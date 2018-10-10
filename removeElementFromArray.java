import java.util.ArrayList;

public class removeElementFromArray {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(removeElement(list,1));
    }
    public static int removeElement(ArrayList<Integer> a , int b){
        int count = 0;
        for (int i = 0; i < a.size(); i++){
            if(a.get(i)== b)
                continue;

        else {
            a.set(count,a.get(i));
            count++;
        }
    }
    return count;
}
}
