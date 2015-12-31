/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secant.method;

/**
 *
 * @author Mohamed El-Shaer
 */
import java.lang.*;
public class SecantMethod {
public static void main(String argv[]) {
    double tolerance = 1e-6; 
    double difference = 1, x =0, x1=1;
    int n = 20;
    x = secant(x,x1,tolerance, difference);
    System.out.println("Root obtained: " + x);
   
    
  }


  public static double secant( double x,double x1, double tolerance, double difference) {
    int k = 0; //number of iterations
    double x2=0;
    while ((Math.abs(difference)>tolerance)&& f(x2)!=0) {
      double d = f(x1)-f(x);
       x2 = x1-f(x1)*(x1-x)/d;
      x  = x1;
      x1 = x2;
      difference = x1-x;
      k++;
        System.out.println("Iteration number:"+k);
        System.out.println("Root obtained:"+x1);
        System.out.println("Estimated error:"+difference);
    }
    System.out.println("iterations: " + k);
    return x1;
  }


  public static double f(double x) {
    return 230*x*x*x*x+18*x*x*x+9*x*x-221*x-9;
  }
    
}
