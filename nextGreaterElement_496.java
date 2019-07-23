import java.util.*;

public class nextGreaterElement_496 {

    public static void main(String[] args) {

        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        num1 = nextGreatEle(num1,num2);

        for (int i = 0 ; i < num1.length;i++){
            System.out.print(num1[i]+" ");
        }


    }
    public static int[] nextGreatEle(int [] findNums, int [] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;

    }
}
