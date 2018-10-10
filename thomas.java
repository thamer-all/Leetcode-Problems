import java.util.*;
public class thomas {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println(removeDubs(list));
    }
    public static ArrayList<Integer> removeDubs(ArrayList<Integer> a){
        int end = a.size()-1;
        for (int i = a.size()-2; i >= 0; i--){
            if(a.get(i) == end){
                a.remove(i);
            }
            else {
                end = a.get(i);
            }
        }
        return a;
    }
}
