/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeb;


/**
 *
 * @author win7-s
 */
public class BubbleSort {

    public static void sort(double[] arr, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = lo; j < hi - (i - lo); j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
        }
    }


    public static boolean isSorted(double[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) return false;
        return true;
    }
}
