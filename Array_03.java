//User input for an array
import java.util.Scanner;

public class Array_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of Numbers that you wish to enter: ");
        int size = sc.nextInt();
        System.out.println("Enter your numbers: ");
        int[] numbers = new int[size];
        for(int i=0; i<size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The numbers that you entered are: ");
        for(int i=0; i<size; i++)
        {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
