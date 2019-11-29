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
public class BubbleSortThread {

    public static void main(String[] args) {
        int N = 10000;
        double[] a = new double[N];
        for (int i = 0; i < N; i++){
            a[i] = Math.random();
        }

        Timer t1 = new Timer();
        BubbleSort.sort(a, 0, a.length - 1);
        System.out.println("t1:" + t1.stop() + "s");
        Timer t2 = new Timer();
        BubbleSortThread(a, 4);
        System.out.println("t2:" + t2.stop() + "s");
        System.out.println(BubbleSort.isSorted(a));
//        for (double d : a)
//            System.out.print(d + " ");
    }

    public static void BubbleSortThread(double[] a, int n) {
        int[] split = new int[n - 1];
        for (int i = 0; i < split.length; i++) {
            split[i] = a.length * (i + 1) / n;
        }

        MyThread[] mt = new MyThread[n];
        mt[0] = new MyThread(a, 0, split[0]);
        for (int i = 1; i < n - 1; i++) {
            mt[i] = new MyThread(a, split[i - 1] + 1, split[i]);
        }
        mt[n - 1] = new MyThread(a, split[n - 2] + 1, a.length - 1);
        for (MyThread m : mt) {
            m.start();
        }
        while (true) {
            int ack = 0;
            for (MyThread m : mt) {
                if (m.isAlive()) {
                    ack++;
                }
            }
            if (ack == 0) {
                break;
            }
        }
        MergeArray.merge(a, split);
    }
}
