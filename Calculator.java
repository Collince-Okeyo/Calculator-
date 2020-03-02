import java.util.Scanner;
public class Calculator {

    public int subtraction(int a, int b){
        return a-b;
    }

    public int addition(int a, int b){
        return a+b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }
    public int modulus(int a, int b){
        return a%b;
    }



    public static void main(String[]args){

        Calculator calculator = new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Enter 1 for addition,2 for subtraction, 3 for multiplication,4 for division,5 for modulus");
        int choice=sc.nextInt();
        switch(choice)
        {
        
        case 1:
          System.out.println(calculator.addition(num1,num2));
          break;
        case 2:
          System.out.println(calculator.subtraction(num1,num2));
          break;
        case 3:
          System.out.println(calculator.multiplication(num1,num2));
          break;
        case 4:
          System.out.println(calculator.division(num1,num2));
          break;
        case 5:
           System.out.println(calculator.modulus(num1,num2));
           break;
        default:
           System.out.println("Invalid");
        }
   }
}