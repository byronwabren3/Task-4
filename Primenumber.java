/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Primenumber { public static void main(String args[]) {
    int num=25;
    int count=0;
    if(num>1){
        
    for(int i=2;i<=num;i++)
    {
        if(num%i==0)
        count++;
    }
    if (count==2)
   {
    System.out.println("is a prime number");
}
else
{
  System.out.println("is not a prime number");   
}
    }
}
}

