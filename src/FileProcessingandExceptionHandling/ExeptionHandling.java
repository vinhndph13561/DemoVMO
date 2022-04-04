package FileProcessingandExceptionHandling;

import java.util.Scanner;

public class ExeptionHandling {
    public void ArithmeticException() {
        try{
            //code that may raise exception
            int data = 100 / 0;//ArithmeticException
        }catch(
        ArithmeticException e){
            e.printStackTrace();
        }
    }
    public void NullPointerException() {
        try{
            //code that may raise exception
            String s=null;
            System.out.println(s.length());//NullPointerException
        }catch(NullPointerException e){
            e.printStackTrace();
        }

    }
    public void NumberFormatException() {
        try{
            //code that may raise exception
            String s="abc";
            int i=Integer.parseInt(s);//NumberFormatException
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

    }
    public void ArrayIndexOutOfBoundsException() {
        try{
            //code that may raise exception
            int a[]=new int[5];
            a[10]=50; //ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        ExeptionHandling eh = new ExeptionHandling();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number from 1 to 4: ");
            int n = sc.nextInt();

            switch (n) {   //expression
                case 1:
                    eh.ArithmeticException();
                    break;
                case 2:
                    eh.NullPointerException();
                    break;
                case 3:
                    eh.NumberFormatException();
                    break;
                case 4:
                    eh.ArrayIndexOutOfBoundsException();
                    break;
                default:
                    System.out.println("Please re-enter a number from 1 to 4");  // code block
            }
        }
    }

}


