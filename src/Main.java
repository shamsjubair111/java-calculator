import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Enter Your Numbers");
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.next();
            if(input.equals("x")){
                break;
            }
            else{
                sum = sum+ Integer.parseInt(input);
            }
        }
        System.out.println("The sum is: " + sum);

    }
}