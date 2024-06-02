// package ShardhMamJavaProgram;

import java.util.*;

public class SortZeroOrOne {

    public static int[] sort012(int n, int arr[]) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    public static int[] binary(int n, int arr[]) {

        return arr;
    }

    // using count
    public static int[] sortZeroOne(int n, int arr[]) {
        int cnt1 = 0, cnt0 = 0;
        for (int j : arr) {
            if (j == 1) {
                cnt1++;
            } else if (j == 0) {
                cnt0++;
            }
        }
        Arrays.fill(arr, 0);

        for (int i = cnt0; i < cnt1 + cnt0; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < n; i++) {
            arr[i] = 2;
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sArr[] = sort012(n, arr);
        for (int j : sArr) {
            System.out.print(j + " ");
            System.out.println(sortZeroOne(n, sArr));
        }
        System.out.println();
    }
}
