//Exercise 6.16 - Aleksandar Kljaic
import java.util.Scanner;

public class Multiple {

 public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner input=new Scanner(System.in);
  System.out.print("Enter two Integers with Spaces to find IF multiples : ");
  int num1=input.nextInt();
  int num2=input.nextInt();
  
  if(ismultiple(num1,num2)==true)
   System.out.println(num1+" is a multiple of "+num2);
  else
   System.out.println("They are Not ");
  
 }

 public static boolean ismultiple(int x,int y){
  
  if(x%y==0||x%y==1)
   return true;
   else
  return false;
 }
 
}