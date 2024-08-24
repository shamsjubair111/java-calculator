import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//       1. Write a program to print whether a number is even or odd, also take input from the user.

//        System.out.println("Enter Your Number: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        if(number % 2 ==0){
//            System.out.println("Even Number");
//
//        }
//        else{
//            System.out.println("Odd Number");
//        }

//        2.Take name as input and print a greeting message for that particular name.

//        System.out.println("Enter your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//            System.out.println("Stay Committed " + name);

//        3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

//        System.out.println("Enter Principal: ");
//        Scanner sc = new Scanner(System.in);
//        int principal = sc.nextInt();
//        System.out.println("Enter Time: ");
//        int time = sc.nextInt();
//        System.out.println("Enter Rate: ");
//        int rate = sc.nextInt();
//
//        float simpleInterest = (principal * time * rate) / 100;
//        System.out.println("Simple Interest: " + simpleInterest);

//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

//        System.out.println("Enter First Number: ");
//        Scanner sc = new Scanner(System.in);
//        float firstInput  = sc.nextFloat();
//        System.out.println("Enter Second Number: ");
//        float secondInput  = sc.nextFloat();
//        System.out.println("Enter The operator:");
//        char operator = sc.next().charAt(0);
//        float  result = 0;
//
//        if(operator == '+'){
//            result = firstInput + secondInput;
//        }
//        else if (operator == '-'){
//            result = firstInput - secondInput;
//        }
//        else if(operator == '*'){
//            result = firstInput * secondInput;
//        }
//        else if(operator == '/'){
//            result = firstInput / secondInput;
//        }
//
//        System.out.println("The Result is: " + result);

//        5. Take 2 numbers as input and print the largest number.

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter The First Number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter The Second Number: ");
//        int num2 = sc.nextInt();
//
//        if(num1 > num1){
//
//            System.out.println(num1 + " is larger than " + num2);
//        }
//        else if(num2 > num1){
//            System.out.println(num2 + " is larger than " + num1);
//        }
//        else{
//            System.out.println(num1 + " is equal to " + num2);
//        }

//        6. Input currency in rupees and output in USD.


//        System.out.println("Enter Your Amount in INR: ");
//        Scanner sc = new Scanner(System.in);
//        double amount = sc.nextDouble();
//        System.out.println("Your Amount in USD: " + (amount* 0.012));

//        7. To calculate Fibonacci Series up to n numbers.

//        System.out.println("Enter for how many numbers you want to see the Fibonacci series: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int firstNumber = 0;
//        int secondNumber = 1;
//
//        System.out.print("The Fibonacci series is: " + firstNumber + " " + secondNumber);
//
//        for (int count = 2; count < n; count++) {
//            int sum = firstNumber + secondNumber;
//            System.out.print(" " + sum);
//            firstNumber = secondNumber;
//            secondNumber = sum;
//        }

//        System.out.println();


//        8. To find out whether the given String is Palindrome or not.

//         String text = "civic";
//         boolean palindrome = true;
//         int left = 0;
//         int right = text.length() - 1;
//
//
//         while(left < right){
//             if(text.charAt(left) != text.charAt(right)){
//                 palindrome = false;
//                 break;
//             }
//             left++;
//             right--;
//         }
//
//        System.out.println("Palindrome: " + palindrome );

//        9. To find Armstrong Number between two given number.

//        System.out.println("Enter First Number");
//        Scanner sc = new Scanner(System.in);
//        String firstNum = sc.next();
//        int firstSum = 0;
//        int secondSum = 0;
//        System.out.println("Enter Second Number");
//        String secondNum = sc.next();
//
//        for(int i = 0; i<firstNum.length(); i++){
//            firstSum = (int) (firstSum + Math.pow(Integer.parseInt(String.valueOf(firstNum.charAt(i))),firstNum.length()));
//;        }
//
//        for(int i = 0; i<secondNum.length(); i++){
//            secondSum = (int) (secondSum + Math.pow(Integer.parseInt(String.valueOf(secondNum.charAt(i))),secondNum.length()));
//        }
//
//        if(firstSum == Integer.parseInt(firstNum)){
//
//            System.out.println("First Number is armstrong ");
//        }
//        else{
//            System.out.println("First Number is not armstrong ");
//        }
//
//        if(secondSum == Integer.parseInt(secondNum)){
//
//            System.out.println("Second Number is armstrong ");
//        }
//        else{
//            System.out.println("Second Number is not armstrong ");
//        }








    }
}