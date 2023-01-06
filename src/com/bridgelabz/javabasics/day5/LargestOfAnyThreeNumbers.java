import java.util.Scanner;

public class LargestOfAnyThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Number = ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second Number = ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third Number = ");
        int number3 = scanner.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("Number1 is Greater : " +number1);
        }
        else if(number2>number1 && number2>number3){
            System.out.println("Number2 is Greater : " +number2);
        }
        else {
            System.out.println("Number3 is Greater : " +number3);
        }
    }
}