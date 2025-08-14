import java.util.*;
public class calculator{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number");
       double num1 = sc.nextDouble();

       System.out.println("Enter operator(+,-,*,/)");
       char operator =  sc.next().charAt(0);
       
       System.out.println("Enter your second number");
       double num2 = sc.nextDouble();

    double result;

    switch (operator) {
        case '+': result = num1 + num2; 
            break;
        case '-': result = num1 - num2;
            break;
        case '*': result = num1 * num2;
            break;
        case '/': result = num1 / num2;
            break; 

        default: 
        System.out.println("invalid operator");
        sc.close();
         return;
    }
    System.out.println("Result: " + result);
    sc.close();
    }
}