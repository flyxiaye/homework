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
public class MyThread extends Thread{
    double[] arr;
    int lo, hi;
    public MyThread(double[] arr, int lo, int hi)
    {
        this.arr = arr;
        this.lo = lo;
        this.hi = hi;
    }
    @Override
    public void run()
    {
        BubbleSort.sort(arr, lo, hi);
    }
}
