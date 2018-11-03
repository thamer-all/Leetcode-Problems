 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;

public class Tokens1 {

    final static String[] ILLEGAL_IDS = {"read", "write"};

   public static enum Token {
        ASSIGN(':', ":="),
        PLUS('+'),
        MINUS('-'),
        TIMES('*'),
        DIVIDES('/'),
        LEFT_PARENTHESES('('),
        RIGHT_PARENTHESES(')');

        private final String lexeme;
        private final char matcher;

        Token(char matcher) {
            this.matcher = matcher;
            lexeme = String.valueOf(matcher);
        }

        Token(char matcher, String lexeme) {
            this.matcher = matcher;
            this.lexeme = lexeme;
        }

        public char matcher() {
            return matcher;
        }

        public String lexeme() {
            return lexeme;
        }

        @Override
        public String toString() {
            return name().replaceAll("_", " ");
        }

        public String toLexEntry() {
            return toString() + ": " + lexeme;
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            iterativePrintln(lexify(toTestString(args)));
            System.exit(0);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter test case: ");
        iterativePrintln(lexify(input.nextLine()));
    }

    public static List<String> lexify(String testCase) {
        String sanitized = testCase.replaceAll("\\s+", "");
        List<String> lexEntryList = new ArrayList<>();
        StringBuilder identifierBuilder = new StringBuilder();
        StringBuilder numberBuilder = new StringBuilder();

        int balancedParantheses = 0;
        boolean buildingIdentifier = false;
        boolean buildingNumber = false;
        boolean singleLineCommenting = false;
        boolean multiLineCommenting = false;

        outer:
        for (int i = 0; i < sanitized.length(); i++) {
            char current = sanitized.charAt(i);
            char next = ' ';
            if (i != sanitized.length() - 1) {
                next = sanitized.charAt(i + 1);
            }

            if (singleLineCommenting) {
                if (current == '\n') {
                    singleLineCommenting = false;
                }
                continue;
            } else if (multiLineCommenting) {
                if (current == '*' && next == '/') {
                    i++;
                    multiLineCommenting = false;
                }
                continue;
            }

            if (Character.isLetter(current)) {
                buildingIdentifier = true;
                identifierBuilder.append(current);
                continue;
            }

            if (isNumber(current)) {
                if (buildingIdentifier) {
                    identifierBuilder.append(current);
                    continue;
                } else {
                    buildingNumber = true;
                    numberBuilder.append(current);
                    continue;
                }
            }

            for (Token token : Token.values()) {
                if (current == token.matcher()) {
                    if (token == Token.ASSIGN) {
                        if (next == '=') {
                            i++;
                        } else {
                            haltPrint("Unmatched Assignment: ':' without '=' ");
                        }
                    } else if (token == Token.LEFT_PARENTHESES) {
                        balancedParantheses++;
                    } else if (token == Token.RIGHT_PARENTHESES) {
                        balancedParantheses--;
                    } else if (token == Token.DIVIDES) {
                        if (next == '/') {
                            i++;
                            singleLineCommenting = true;
                            continue outer;
                        } else if (next == '*') {
                            i++;
                            multiLineCommenting = true;
                            continue outer;
                        }
                    }

                    if (buildingNumber) {
                        lexEntryList.add("NUMBER: " + numberBuilder.toString());
                        numberBuilder.setLength(0);
                        buildingNumber = false;
                    }

                    if (buildingIdentifier) {
                        String id = identifierBuilder.toString();

                        if (!isLegalId(id)) {
                            haltPrint("Illegal ID: " + id);
                        }

                        lexEntryList.add("IDENTIFIER: " + id);
                        identifierBuilder.setLength(0);
                        buildingIdentifier = false;
                    }

                    lexEntryList.add(token.toLexEntry());
                }
            }

            if (current == '=') {
                haltPrint("Unmatched Assignment: '=' without ':'");
            }
        }

        if (buildingNumber) {
            lexEntryList.add("NUMBER: " + numberBuilder.toString());
        } else if (buildingIdentifier) {
            String id = identifierBuilder.toString();

            if (!isLegalId(id)) {
                haltPrint("Illegal ID: " + id);
            }
            lexEntryList.add("IDENTIFIER: " + id);
        }

        if (balancedParantheses != 0) {
            haltPrint("Unbalanced Parantheses");
        }

        if (multiLineCommenting) {
            haltPrint("Unclosed Comment");
        }

        return lexEntryList;
    }

    public static void iterativePrintln(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void haltPrint(String str) {
        System.out.println(str);
        System.exit(0);
    }

    public static String toTestString(String[] args) {
        return String.join("", args);
    }

    public static boolean isLegalId(String id) {
        for (String illegalId : ILLEGAL_IDS) {
            if (illegalId.equals(id)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isNumber(char c) {
        try {
            Double.parseDouble(String.valueOf(c));
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}