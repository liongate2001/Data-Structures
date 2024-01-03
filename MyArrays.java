import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrays {
    public static void main(String[] args) {
        Integer arrayA[] = {1, 2, 3, 4, 5};
        int arrLen = arrayA.length;

        System.out.println("Initial array elements:");

        ArrayList<Integer> Ars = new ArrayList<>(Arrays.asList(arrayA));
        Ars.add(6);
        Iterator<Integer> ListElement = Ars.iterator();
        recur(ListElement);
    }

    static void recur(Iterator<Integer> ListE) {
        while (ListE.hasNext()) {
            System.out.println(ListE.next());
            recur(ListE);
        }
    }
}