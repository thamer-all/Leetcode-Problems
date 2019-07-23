import java.util.Stack;

public class MinStack_155 {
   static int min = Integer.MAX_VALUE;
    static Stack<Integer> stack = new Stack<>();
    public static void push(int x){
        if (x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    public static void pop(){
        if (stack.pop() == min) min = stack.pop();
    }
    public static int top(){
        return stack.peek();
    }
    public static int getMin(){
        return min;
    }

    public static void main(String[] args) {

        MinStack_155 stack_155 = new MinStack_155();
        stack_155.push(3);
        stack_155.push(2);
        stack_155.push(1);
        stack_155.pop();
        stack_155.getMin();

    }

}
