import java.util.*;

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

//        int salary  = 10000;
//
//        if(salary > 10000){
//            salary = salary+2000;
//        }
//        else if(salary < 10000){
//            salary = salary + 1000;
//        }
//        else{
//            salary = salary + 0;
//        }
//        System.out.println("Salary is: " + salary);

//        System.out.println("Enter Three Numbers: ");
//        Scanner sc = new Scanner(System.in);
//        int first = sc.nextInt();
//        int second = sc.nextInt();
//        int third = sc.nextInt();
////
//        if(first > second && first > third) {
//            System.out.println(first  + " is largest");
//        }
//        else if(second > first && first > third) {
//            System.out.println(second + " is largest");
//        }
//        else if(third > first && third > second){
//            System.out.println(third + " is largest");
//        }
//        else{
//            System.out.println("make sure than you dont give any equal numbers");
//        }

//        int x = (Math.max(first, second));
//
//        System.out.println(Math.max(x, third));

//        System.out.println("Enter your input");
//        Scanner sc1 = new Scanner(System.in);
//        char input1 = sc1.next().charAt(0);
//        if(input1  >= 'A' && input1 <= 'Z') {
//            System.out.println("Capital");
//        }
//        else{
//            System.out.println("Small");
//        }


//        int firstNum = 0;
//        int secondNum = 1;
//        int n = 7;
//        System.out.print(firstNum + " " + secondNum);
//        for(int count = 2; count <= n; count++) {
//            int sum = firstNum + secondNum;
//            System.out.print(" " + sum);
//            firstNum = secondNum;
//            secondNum = sum;
//        }


//        long number = 1385757879;
//
//        int count = 0;
//
//   while(number > 0){
//       if(number % 10 ==7){
//           count++;
//           number = number / 10;
//       }
//       else{
//           number = number / 10;
//       }
//   }
//        System.out.println(count);


//        while(number > 0){
//            if(number % 10 == 7){
//                count++;
//            }
//            number /= 10;
//        }
//        System.out.println(count);


//        int number  = 23597;
//        String text = "";
//        int result = 0;

//        String text = String.valueOf(number);
//        String result = "";
//
//        System.out.println(text);
//        for(int i = text.length()-1 ; i >= 0; i-- ) {
//            result = result + text.charAt(i);
//        }
//        System.out.println(result);

//        while(number > 0){
//            int character = number %10;
//            number = number/10;
//            text = text + character;
//        }
//        System.out.println(text);

//        while(number > 0){
//            int dum =  number%10;
//            result = result*10+dum;
//            number = number/10;
//        }
//        System.out.println(result);

// building a calculator program


//        System.out.println("Enter + - * / % as operators or x or X to terminate the program");
//        Scanner scanner = new Scanner(System.in);
//
//       int result = 0;
//
//        while(true){
//            char operator = scanner.next().charAt(0);
//            if(operator == 'x' || operator == 'X'){
//                break;
//            }
//            else if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
//                System.out.println("Enter First Number");
//                int firstNum  = scanner.nextInt();
//                System.out.println("Enter Second Number");
//                int secondNum = scanner.nextInt();
//
//                if(operator == '+'){
//                     result = firstNum + secondNum;
//
//
//                }
//                else if(operator == '-'){
//                     result = firstNum - secondNum;
//                }
//                else if(operator == '*'){
//                     result = firstNum * secondNum;
//                }
//                else if(operator == '/'){
//                    if(secondNum != 0){
//                         result = firstNum / secondNum;
//                    }
//                    else{
//                        System.out.println("Can not divide " + firstNum  + " by " + secondNum);
//                    }
//                }
//                else if(operator == '%'){
//                     result  = firstNum % secondNum;
//                }
//
//                System.out.println("Result is: " + result);
//            }
//            else{
//                System.out.println("Invalid Operator");
//                break;
//            }
//        }

//        int number = 1234567;
//        String result = String.valueOf(number);
//        String finalResult = "";
//        int revNum = 0;
//        System.out.println(number);
//
//        for(int i = result.length() -1 ; i>=0;i--){
//            finalResult = finalResult + result.charAt(i);
//        }
//        System.out.println(finalResult);

//             while(number > 0){
//                 int rem = number % 10;
//                 finalResult = finalResult + rem;
//                 number = number / 10;
//             }
//        System.out.println(finalResult);

//        while(number > 0){
//            int rem = number % 10;
//            revNum = revNum * 10 + rem;
//            number = number / 10;
//        }
//        System.out.println(revNum);


//        Calculator problem once again

//        System.out.println("Enter The operation First and then two numbers to perform the operation and see the result:");
//        Scanner scanner = new Scanner(System.in);
//
//      while(true){
//          char operator = scanner.next().charAt(0);
//          if(operator == 'x'){
//              break;
//          }
//          else if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
//              System.out.println("Enter First Number: ");
//              int firstNum = scanner.nextInt();
//              System.out.println("Enter Second Number: ");
//              int secondNum = scanner.nextInt();
//              if(operator == '+'){
//                  System.out.println(firstNum + secondNum);
//              }
//              else if(operator == '-'){
//                  System.out.println(firstNum - secondNum);
//              }
//              else if(operator == '*'){
//                  System.out.println(firstNum * secondNum);
//              }
//              else if(operator == '/'){
//                 if(secondNum != 0){
//                     System.out.println(firstNum / secondNum);
//                 }
//                 else{
//                     System.out.println("Small Number Can't be Divided by Large Number");
//                 }
//              }
//              else if(operator == '%'){
//                  System.out.println(firstNum % secondNum);
//              }
//          }
//          else{
//              System.out.println("Invalid Operation");
//              break;
//          }
//      }

//        Area of a circle

//        System.out.println("Enter radius to find area of a circle: ");
//        Scanner scanner = new Scanner(System.in);
//        float radius = scanner.nextFloat();
//
//        double area = (3.1416 * radius);
//
//        System.out.println("The area of the circle for your given raidus (" + radius + ")" +  " is " + area);


//        area of a triangle

//        System.out.println("Enter Base of The Triangle");
//        Scanner scanner = new Scanner(System.in);
//        float base = scanner.nextFloat();
//        System.out.println("Enter Height of The Triangle");
//        float height = scanner.nextFloat();
//
//        double area = (base * height) / 2;
//
//        System.out.println("The area of the Triangle for your given base (" + base + ") and height (" + height + ")" +  " is " + area);

//        Area of Rectangle

//        System.out.println("Enter length of the rectangle");
//
//        Scanner input = new Scanner(System.in);
//        float length = input.nextFloat();
//        System.out.println("Enter width of the rectangle");
//        float width = input.nextFloat();
//        double area  = (length * width);
//
//        System.out.println("Area is : " + area);

//        Area Of Isosceles Triangle

//        System.out.println("Enter base of the triangle: ");
//        Scanner scanner = new Scanner(System.in);
//        float base = scanner.nextFloat();
//        System.out.println("Enter height of the triangle: ");
//        float height = scanner.nextFloat();
//        double area = (base * height) / 2;
//        System.out.println("The area of the triangle is " + area);

//        Area Of Parallelogram

//        System.out.println("Enter base of parallelogram");
//        Scanner scanner = new Scanner(System.in);
//        float base = scanner.nextFloat();
//        System.out.println("Enter height of parallelogram");
//        float height = scanner.nextFloat();
//        double area = base * height;
//        System.out.println("Area of parallelogram is " + area);

//        Area Of equilateral triangle.

//        System.out.println("Enter length of one side: ");
//        Scanner scanner = new Scanner(System.in);
//        float length = scanner.nextFloat();
//
//        double area = Math.sqrt(3)/4*(Math.pow(length,2));
//
//        System.out.println("Area is: " + area);

//        Fibonacci Series In Java Programs

//        int firstNumber = 0;
//        int secondNumber = 1;
//        int nextNumber = 0;
//        System.out.println("Enter for how many numbers you want to find the fibonacci series: ");
//        Scanner scanner = new Scanner(System.in);
//        int limit = scanner.nextInt();
//        System.out.print("Your Desired Fibonacci Series is: " + firstNumber + " " + secondNumber);
//
//        for(int i = 2; i<=limit;i++){
//            nextNumber = firstNumber + secondNumber;
//            System.out.print(" " + nextNumber);
//            firstNumber = secondNumber;
//            secondNumber = nextNumber;
//        }

//        Subtract the Product and Sum of Digits of an Integer

//        leetcode (1281)

//        int sum = 0;
//        int pro = 1;
//        int rem= 0;
//        System.out.println("Enter any nymber: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        while(n > 0){
//            rem = n % 10;
//            sum = sum + rem;
//            pro = pro * rem;
//            n = n / 10;
//        }
//        System.out.println("The result is: " + (pro - sum));

//        Input a number and print all the factors of that number (use loops).

//        System.out.println("Enter your number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(number);
//
//        System.out.print("The factors are: " + 1);
//         for(int i = 2 ; i<=number/2 ;i++)
//        {
//            if(number % i == 0){
//                System.out.print(" " + i);
//            }
//        }
//        System.out.println(" " + number);

//
//        System.out.println("Enter your number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(number);
//        List<Integer> list = new ArrayList<>();
//        for(int i = 1 ; i<=Math.sqrt(number) ;i++)
//        {
//            if(number%i==0){
//                if(i==(number/i))list.add(i);
//                else {
//                    list.add(i);
//                    list.add(number / i);
//                }
//            }
//        }
//        Collections.sort(list);
//        list.stream().forEach(System.out::println);

//        Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

//        System.out.println("Keep entering digit and your numbers will get added or enter 0 to exit the program and see the answer:");
//        Scanner scanner = new Scanner(System.in);
//        long result = 0;
//        while (true) {
//            int input = scanner.nextInt();
//
//            if (input == 0) {
//                break;
//            } else {
//                result = result + input;
//
//            }
//
//
//        }
//        System.out.println("Result is: " + result);

//        Take integer inputs till the user enters 0 and print the largest number from all.
//        System.out.println("Keep entering digit or enter 0 to exit the program and see the largest number:");
//        Scanner scanner = new Scanner(System.in);
//        int largest = 0;
//        while(true){
//            int number = scanner.nextInt();
//            if(number == 0){
//                break;
//            }
//            else{
//                if(number > largest){
//                    largest = number;
//                }
//            }
//        }
//        System.out.println("Largest number: " + largest);

//        Factorial Program in java

//        System.out.println("Enter Your Number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        long result =  fact(number);
//        System.out.println("Factorial of: " + number + " is: " + result);
//
//    }
//
//
//        with recursion
//    public static int fact(int n) {
//if(n == 0){
//    return 1;
//}
//        return (n*fact(n-1)) ;
//    }

//        without recusrion

//        System.out.println("Enter Your Number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int result = 1;
//
//        while(number >0){
//            result = result * number;
//            number--;
//        }
//        System.out.println(result);


//        System.out.println("Keep entering numbers or enter 0 to find maximum from your given numbers");
//        Scanner scanner = new Scanner(System.in);
//        int largest = 0;
//        while(true){
//            int input = scanner.nextInt();
//            if(input == 0){
//                break;
//            }
//            else{
//                if(input > largest){
//                    largest = input;
//                }
//            }
//        }
//        System.out.println(largest);

//        Calculate average of numbers

//        System.out.println("Keep entering you number or 0 to exit program: ");
//        Scanner scanner = new Scanner(System.in);
//        int numberCount = 0;
//        float sum = 0;
//        while(true) {
//            int input = scanner.nextInt();
//
//         if(input == 0) {
//             break;
//         }
//         else{
//             sum = sum+input;
//             numberCount++;
//         }
//
//        }
//
//        System.out.println("Average of " + numberCount + " numbers is " + sum/numberCount);



//        int x1 = 3;
//        int x2 = 7;
//        int y1 = 4;
//        int y2 = 1;
//
//        double distancce = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//
//        System.out.println("Your Answer is: " + distancce);

//        System.out.println("Enter Number of Courses: ");
//        Scanner sc = new Scanner(System.in);
//        int numCourses = sc.nextInt();
//        int creditHour = 0;
//        float result  = 0;
//        float midResult;
//
//        while(numCourses>0) {
//            System.out.println("Enter Your Grade : ");
//            float grade = sc.nextFloat();
//            System.out.println("Enter Your Credit Hour : ");
//            int credit = sc.nextInt();
//            midResult = grade * credit;
//            result  = result + midResult;
//            creditHour = creditHour + credit;
//            numCourses--;
//
//        }
//
//        System.out.println("Your CGPA is: " + result/creditHour);

//        calculate t he commission percentage

//        System.out.println("Enter Actual Amount");
//        Scanner sc = new Scanner(System.in);
//        float amount = sc.nextFloat();
//        System.out.println("Enter Commission AMout:");
//        float commission = sc.nextFloat();
//         double commmissionPercent = (commission * 100) / amount;
//        System.out.println("Commission Percent: " + commmissionPercent);




//        int p = 450000;
//        float r = 0.128f;
//        int n = 4;
//        int t = 5;
//
//        double compundInterest = p*Math.pow((1+(double)(r/n)),(n*t));
//        System.out.println("Coumpound Interest is: " + compundInterest);


//        Calculate sumof N numbers

//        System.out.println("Keep entering numbers or 0 to terminate the program: ");
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        while (true){
//            int number = scanner.nextInt();
//            if(number == 0){
//                System.out.println("Program Ended");
//                break;
//            }
//            else{
//                sum += number;
//            }
//        }
//
//        System.out.println("The sum is: " + sum);


//       armstrong number

//        System.out.println("Enter your number to check whether it is armstrong or not: ");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        double sum = 0;
//        String inputCount = String.valueOf(input);
//        while (input >0 ) {
//            int midNumber = input % 10;
//            sum  = sum + Math.pow(midNumber,inputCount.length());
//            input = input / 10;
//        }
//
//       if(sum == Integer.parseInt(inputCount)){
//           System.out.println("Armstrong Number");
//       }
//       else{
//           System.out.println("Not Armstrong Number");
//       }


//        check palindrome number again practise

//        System.out.println("Enter number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        String inputString = String.valueOf(number);
//        int left = 0;
//        int right = inputString.length()-1;
//        boolean isArmstrong = false;
//
//        while(left != right) {
//            if(inputString.charAt(left) == inputString.charAt(right)) {
//                isArmstrong = true;
//            }
//            else{
//                isArmstrong = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//


//  armstrong number again

//        System.out.print("Enter number:");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        double sum  = 0;
//        String conNum = String.valueOf(number);
//        while(number > 0){
//            int midNumber = number % 10;
//            sum = sum + Math.pow(midNumber,conNum.length());
//            number = number / 10;
//        }
//       if(sum == Integer.parseInt(conNum)){
//           System.out.println("Yes");
//       }
//       else{
//           System.out.println("No");
//       }


//        given a= 56, b = 98

//        int a =72;
//        int b= 120;
//        int hcf = 0;
//        int lcm;
//        int largeNum,smallNum;
//        if(a > b){
//            largeNum = a;
//            smallNum = b;
//        }
//        else{
//            largeNum = b;
//            smallNum = a;
//        }
//         while(largeNum % smallNum != 0){
//             hcf = largeNum % smallNum;
//             largeNum = smallNum;
//             smallNum = hcf;
//         }
//
//
//         lcm  = (a*b)/hcf;
//        System.out.println(lcm);
//        System.out.println(hcf);

//        System.out.println("Enter your letter: ");
//        Scanner scanner = new Scanner(System.in);
//        char character = scanner.next().charAt(0);
//        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
//            System.out.println("Vowel");
//        }
//        else{
//            System.out.println("Consonant");
//        }

//        find whether a number is a strong number or not

//        System.out.println("Enter Number:");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int sum = 0;
//        for(int i = 1; i <= number/2; i++){
//            if(number % i == 0){
//                sum = sum + i;
//            }
//        }
//        if(sum == number){
//            System.out.println("Strong Number");
//        }
//        else{
//            System.out.println("Not Strong Number");
//        }

//Check Leap Year Or Not

//        System.out.println("Enter year value:");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if(year % 4 == 0 && year % 100 != 0){
//            System.out.println("Leap year");
//        }
//        else if(year % 4 ==0 && (year % 100 == 0 && year % 400 == 0))
//        {
//            System.out.println("Leap year");
//        }
//        else{
//            System.out.println("Not a leap year");
//        }

//        Sum Of A Digits Of Number

//        System.out.println("Enter Digits:");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int sum = 0;
//        while(number > 0) {
//            sum = sum + number % 10;
//            number = number / 10;
//        }
//        System.out.println(sum);

//        Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

//
//        int totalDays = 31;
//        System.out.println(totalDays/2 + " days");

//        System.out.println("Keep entering positive or negative number or 0 to terminate the program: ");
//        Scanner scanner = new Scanner(System.in);
//
//        int sop = 0;
//        int son = 0;
//        while(true){
//            int input = scanner.nextInt();
//            if(input == 0){
//                break;
//            }
//            else if(input > 0){
//                sop = sop + input;
//            }
//            else{
//                son = son + input;
//            }
//        }
//
//        System.out.println("SOP: " + sop);
//        System.out.println("SON: " + son);



//        Switch Cases

//        System.out.println("Enter Programming Language To See Framework: ");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();

//        switch (input) {
//            case "Java":
//                System.out.println("Spring Boot");
//                break;
//                case "Python":
//                    System.out.println("Flask");
//                    break;
//
//            case "java":
//                System.out.println("Android Studio");
//                break;
//
//            default:
//                System.out.println("Language Not Familiar");
//        }

//        switch(input){
//            case "Java" -> System.out.println("Spring Boot");
//            case "Python" -> System.out.println("Python");
//            default -> System.out.println("Java");
//        }


//        nested switch

//        System.out.println("Enter Name: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Enter Age:");
//        int age = sc.nextInt();
//        switch(name){
//            case "jubair":
//                System.out.println("Welcome jubair");
//                switch(age){
//                    case 25:
//                        System.out.println("Young");
//                        break;
//                    default:
//                        System.out.println("Old");
//                }
//                break;
//            default:
//                System.out.println("Error");
//        }
//


//        switch(name){
//            case "jubair" -> {
//                System.out.println("Welcome Jubair");
//                switch(age){
//                    case 25 -> System.out.println("Young");
//                    default -> System.out.println("Old");
//                }
//            }
//            default -> System.out.println("Error");
//        }


//        java functions and methods

//        1. Take input of two numbers and print the sum

//        Scanner scanner = new Scanner(System.in);
//
//       while(true){
//           System.out.println("Enter First Number:");
//           int firstNum = scanner.nextInt();
//           System.out.println("Enter Second Number:");
//           int secondNum = scanner.nextInt();
//           if(firstNum != 0 && secondNum != 0) {
//               int result = findSum(firstNum,secondNum);
//               System.out.println(result);
//           }
//           else {
//               System.out.println("Invalid Number");
//               break;
//           }
//
//       }
//
//
//


//        Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

        System.out.println("Enter Three Numbers: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

//        findMax(firstNum, secondNum, thirdNum);






    }

//    static void findMax(int firstNum, int secondNum, int thirdNum) {
//
//        if(firstNum < 0 || secondNum < 0 || thirdNum < 0 ) {
//            System.out.println("Invalid Input");
//        }
//        else if( firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum ) {
//            System.out.println("the values of given inputs must not be equal");
//        }
//        else{
//            if( firstNum > secondNum && firstNum > thirdNum){
//                System.out.println(firstNum + " " + "is the largest number");
//            }
//            else if( secondNum > firstNum && secondNum > thirdNum){
//                System.out.println(secondNum + " " + "is the largest number");
//            }
//            else{
//                System.out.println(thirdNum + " " + "is the largest number");
//
//            }
//        }
//
//    }





//    static int findSum(int firstNum, int secondNum) {
//         return firstNum + secondNum;
//    }

}