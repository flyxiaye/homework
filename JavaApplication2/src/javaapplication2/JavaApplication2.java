/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author ChxxxXL
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            int tmp = multiple(i);
            System.out.print(i+"! = "+tmp+'\n');
            sum += tmp;
        }
        System.out.print("sum = "+sum+'\n');
    }
    static int multiple(int n)
    {
        int tmp = 1;
        for (int i = 1; i <= n; i++)
        {
            tmp *= i;
        }
        return tmp;
    }
    
}

