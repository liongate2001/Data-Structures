
public class Arrays {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        int arrLen = arr.length;

        int newArrl = arrLen + 1;
        int newArr[] = new int[newArrl];

        System.out.println("The length of the arrays: " + arrLen);
        System.out.println("");

        for (int i = 0; i < arrLen; i++) {
            newArr[i] = arr[i];
        }

        newArr[newArrl - 1] = 666;
        System.out.println("The elements of the arrays: ");

        for (int i = 0; i < newArrl; i++) {
            System.out.println("\n " + newArr[i]);

        }

    }

}