import java.util.Arrays;
import java.util.ArrayList;

public class ArrayWat {

    public static void main(String[] args) {

        Integer int_rar2[] = { 1, 2, 3, 4, 5 };

        int arrLen = int_rar2.length;

        System.out.println("Array:" + int_rar2);

        ArrayList<Integer> rar2 = new ArrayList<Integer>(Arrays.asList(int_rar2));

        // int_rar2 [arrLen - 1] = 64;

        rar2.add(6);

        for (Integer i = 0; i < rar2.size(); i++) {

            System.out.println(rar2.get(i));

        }

    }
}