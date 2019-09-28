/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ChxxxXL
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        for (int i = 1; i <= 100; i++)
        {
            int sum = 0;
            int last_factor = 0;
            while (true)
            {
                int factor = getFactor(i, last_factor+1);
                sum += factor;
                if (sum == i)
                {
                    outPut(i);
                    last_factor = 0;
                }
                else if (sum > i)
                {
                    break;
                }
                else
                {
                    last_factor = factor;
                }  
            }
        }
    }
    static int getFactor(int a, int f)
    {
        for (int i = f; i <= a/2; i++)
        {
            if (a % i == 0)
                return i;
        }
        return a;
    }
    static void outPut(int n)
    {
        System.out.print("完数: "+n+"=1");
        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0)
                System.out.print("+"+i);
        }
        System.out.print(", "+n+"=1");
        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0)
                System.out.print("*"+i);
        }
        System.out.print('\n');
    }
}
