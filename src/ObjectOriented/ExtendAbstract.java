package ObjectOriented;

import java.util.Scanner;

public class ExtendAbstract extends Abstract{

    @Override
    int sum(int a, int b) {
        return a+b;
    }

    public static void main(String args[]){
        ExtendAbstract ea =new ExtendAbstract();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Result: " +ea.sum(a,b));

    }
}
