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
public class Timer {

    private final long st;

    public Timer() {
        st = System.currentTimeMillis();
    }

    public double stop() {
        long ed = System.currentTimeMillis();
        return (ed - st) / 1000.0;
    }
}
