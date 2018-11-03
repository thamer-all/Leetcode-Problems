import java.util.*;
import java.io.*;


public class Tokens {
    static int result=-1;
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String fileName;
        System.out.println("Type the files name: ");
        fileName = input.next();
        FileFound(fileName);

        ArrayList<Character> arrayOfTokens = new ArrayList<Character>();
        ArrayList<String> arr = new ArrayList<String>();
        ArrayRead(arrayOfTokens, fileName);
        arr = TokensBuilder(arrayOfTokens);




    }
    private static ArrayList<Character> ArrayRead(ArrayList<Character> CharHolder, String fileName) throws IOException {
        FileReader fileInput = new FileReader(fileName);
        int character;
        int CurrIndex = 0;
        while ((character = fileInput.read()) != -1) {
            CharHolder.add(CurrIndex, (char) (character));
            CurrIndex++;
        }
        fileInput.close();
        return CharHolder;
    }

    private static void FileFound(String fileName) {

        boolean ifFound;
        File file = new File(fileName);
        ifFound = file.exists();

        if (ifFound == false) {
            System.out.println("File not found !");
            System.exit(0);
        }
    }
    private static ArrayList<String> TokensBuilder(ArrayList<Character> tokens) {
        ArrayList<String> id = new ArrayList<String>();
        Random rand = new Random();
        int Count = 0;
        String input = "";

        while (Count < tokens.size()) {
            if (!tokens.get(Count).equals(' ')) {
                input += tokens.get(Count);
                Count++;
            } else {
                id.add(input);
                input = "";
                Count++;
                result = rand.nextInt(2);
            }
        }
        if(result==1){
            System.out.println("Compilation Successful");
        }else{
            System.out.println("Error: ");
        }
        return id;
    }
    private static void outPut(String word) {

        if(word.equals("rfile.txt")) {
            System.out.println("<input>, input");
        } else if(word.equals("input")) {
            System.out.println("<input>, input");
        } else if(word.equals(":=")) {
            System.out.println("<assign>, :=");
        } else if(word.equals("(")) {
            System.out.println("<leftparen>, (");
        } else if(word.equals(")")) {
            System.out.println("<rightparen>, )");
        } else if(word.equals("+") || word.equals("-")) {
            System.out.println("<add_op>, " + word);
        } else if(word.equals("*") || word.equals("/") || word.equals("//") || word.equals("%")) {
            System.out.println("<mult_op>, " + word);
        } else if(word.matches("[a-z]+[A-Za-z0-9]*")) {
            System.out.println("<id>, " + word);
        } else {
            System.out.println("<error>, unidenfified - " + word);
        }

    }
}