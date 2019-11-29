/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeb;

/**
 *
 * @author ChxxxXL
 */
public class MergeArray {

    private static double[] aux;

    public static void merge(double[] a, int[] split) {
        aux = new double[a.length];
        for (int i = 0; i < split.length - 1; i++) {
            merge(a, split[i], 0, split[i + 1]);
        }
        merge(a, split[split.length - 1], 0, a.length - 1);
    }

    public static void merge(double[] a, int mid, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo, j = mid + 1;
        for (int k = 0; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

}
