/**
 * Created by VINNI on 07.12.16.
 */
import java.util.*;
final public class ArraysUtils {

    public static void main(String[] args) {
        int arr1[] = {7, 7, -5, 0, -33, -5, -4, 1, -33, 2};
        int arrravno = 0;
        for (int z = 0; z < arr1.length - 1; z++) {
            if (arr1[z] != arr1[z + 1])
                arrravno = 1;
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr1));
        sum(arr1);
        min(arr1, arrravno);
        max(arr1, arrravno);
        maxPositive(arr1, arrravno);
        multiplication(arr1);
        modulus(arr1);
        reverse(arr1);
        findEvenElements(arr1);
        secondLagest(arr1, arrravno);


    }

    public static void min(int[] arr, int arrravno) {
        if (arrravno == 0)
            System.out.println("min: все эл. массива равны");
        else {
            int min = arr[0];
            for (int i = 1; i <= arr.length - 1; ++i) {
                if (arr[i] < min) min = arr[i];
            }
            System.out.println("min:" + min);
        }
    }

    public static void max(int[] arr, int arrravno) {
        if (arrravno == 0)
            System.out.println("max: все эл. массива равны");
        else {
            int max = arr[0];
            for (int i = 1; i <= arr.length - 1; ++i) {
                if (arr[i] > max) max = arr[i];
            }

            System.out.println("max:" + max);
        }
    }

    public static void sum(int[] arr) {
        int sum1 = 0;
        for (int i = 0; i <= arr.length - 1; i++) {

            sum1 = sum1 + arr[i];
        }

        System.out.println("сумма элементов:" + sum1);

    }

    public static void multiplication(int[] arr) {
        int mult = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            mult = mult * arr[i];
        }
        System.out.println("multiplication:" + mult);
    }


    public static void maxPositive(int[] arr, int arrravno) {
        if (arrravno == 0)
            System.out.println("maxPositive: все эл. массива равны");
        else {
            int max = arr[0];
            for (int i = 1; i <= arr.length - 1; ++i) {
                if (arr[i] > max) max = arr[i];
            }
            if (max > 0) {
                System.out.println("maxPositive:" + max);
            } else System.out.println("Положительные элементы отсутствуют");
        }
    }

    public static void modulus(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];
        if (last != 0) {

            int mod = first % last;
            System.out.println("modulus первого и последн. эл.:" + mod);
        } else System.out.println("modulus: Последний эл. равен нулю");
    }


    public static void secondLagest(int[] arr, int arrravno) {
        if (arrravno == 0)
            System.out.println("secondLagest: все эл. массива равны");
        else {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }


            for (int z = arr.length - 1; z > 0; z--) {
                if (arr[z] != arr[z - 1]) {
                    System.out.println("secondLagest:" + arr[z - 1]);
                    break;
                }
            }
        }

    }

    public static int[] reverse(int[] arr2) {

        int tmp;
        for (int i = 0; i < arr2.length / 2; i++) {
            tmp = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = arr2[i];
            arr2[i] = tmp;
        }
        System.out.println("reverse:" + Arrays.toString(arr2));
        return arr2;
    }

    public static int[] findEvenElements(int[] arr2) {
        boolean mask[] = new boolean[arr2.length];
        int removeCount = 0;

                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j]% 2 != 0 || arr2[j] ==0) {
                            mask[j] = true;
                            removeCount++;
                    }
                }

        int[] result = new int[arr2.length - removeCount];

        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (!mask[i]) {
                result[j++] = arr2[i];
            }
        }
        System.out.println("findEvenElements: " + Arrays.toString(result));
        return result;
    }

}