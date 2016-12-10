/**
 * Created by VINNI on 07.12.16.
 */
import java.util.*;
final public class ArraysUtils {


    public static final void min(int[] arr) {

            int min = arr[0];
            for (int i = 1; i <= arr.length - 1; ++i) {
                if (arr[i] < min) min = arr[i];
            }
        }


    public static final void max(int[] arr) {

            int max = arr[0];
            for (int i = 1; i <= arr.length - 1; ++i) {
                if (arr[i] > max) max = arr[i];
            }

        }


    public static final void sum(int[] arr) {
        int sum1 = 0;
        for (int i = 0; i <= arr.length - 1; i++) {

            sum1 = sum1 + arr[i];
        }

    }

    public static final void multiplication(int[] arr) {
        int mult = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            mult = mult * arr[i];
        }

    }


    public static final void maxPositive(int[] arr) {

        int max = arr[0];
        for (int i = 1; i <= arr.length - 1; ++i) {
            if (arr[i] > max) max = arr[i];
        }
        if (max <= 0) max = 0;
    }


    public static final void modulus(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];
        int mod = first % last;
    }


    public static final void secondLagest(int[] arr) {

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

                    break;
                }
            }
    }

    public static final int[] reverse(int[] arr2) {

        int tmp;
        for (int i = 0; i < arr2.length / 2; i++) {
            tmp = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = arr2[i];
            arr2[i] = tmp;
        }

        return arr2;
    }

    public static final int[] findEvenElements(int[] arr2) {
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

        return result;
    }

}