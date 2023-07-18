import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElementsRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findElementRemoval(array);
        System.out.println("Output : " + output);
    }

    private static int findElementRemoval(int[] array) {
        Arrays.sort(array);
        int size = array.length;
        int[] temp = new int[size];
        for (int i = 0; i < array.length; i++){
            temp[i] = array[size - i - 1];
        }
//        for (int i = 0; i < array.length; i++){
//            System.out.println(temp[i]+ " ");
//        }
        int cost = 0;
        for (int i = 0; i < temp.length; i++){
            cost += temp[i] * (i + 1);
        }
        return cost;
    }
}
