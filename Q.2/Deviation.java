
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shilpa
 */
public class Deviation {
    
     public static void main (String [] args)  
   {  
      System.out.println("Enter 10 numbers to find standard deviation");  
     Scanner sc = new Scanner (System.in);  
      double[] array= new double [10];  
      double sum=0, mean_val=0;  
      for (int i=0; i<10; i++) //Take input in the array  
     {  
           System.out.print("Enter a number : ");  
           array[i]=sc.nextDouble();  
           sum+=array[i]; //sum of all elements  
     }  
      mean_val=sum/10;  
      sum=0;  
      System.out.println("Mean_val: "+mean_val); //Display mean of all elements  
      double [] temp= new double[10];  
      for (int j=0; j<10; j++) //calculate standard deviation  
     {  
           temp[j]=Math.pow((array[j]-mean_val),2);  
           sum+=temp[j];  
     }  
      mean_val=sum/10;  
      double deviation_val=Math.sqrt(mean_val);  
      System.out.println("Deviation_val : "+ deviation_val);  
   }  
    
}

