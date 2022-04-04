package JavaBasic;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a program: 1.if-else 2.switch-case");
        int choose = Integer.parseInt(sc.nextLine());
//      If...else
        if (choose==1){

            while (true) {
                System.out.println("Enter a number from 1 to 3: ");
                int n = Integer.parseInt(sc.nextLine());
                if (n == 1) { //condition
                    System.out.println("Program 1"); // block of code to be executed if the condition is true
                    break;
                } else if (n == 2) {
                    System.out.println("Program 2"); // block of code to be executed if the condition is true
                    break;
                } else if (n == 3) {
                    System.out.println("Program 3"); // block of code to be executed if the condition is true
                    break;
                } else {
                    System.out.println("Please re-enter a number from 1 to 3"); // block of code to be executed if the condition is false
                }
            }
//      Switch...case
        } else if (choose==2){
            while (true) {
                System.out.println("Enter a number from 1 to 3: ");
                int n = Integer.parseInt(sc.nextLine());

                switch (n) {   //expression
                    case 1:
                        System.out.println("Program 1");  // code block
                        break;
                    case 2:
                        System.out.println("Program 2");  // code block
                        break;
                    case 3:
                        System.out.println("Program 3");  // code block
                        break;
                    default:
                        System.out.println("Please re-enter a number from 1 to 3");  // code block
                }
            }
        }
    }
}
