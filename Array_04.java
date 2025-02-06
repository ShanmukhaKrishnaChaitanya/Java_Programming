import java.util.Scanner;
public class Array_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];
        System.out.println("Enter the names");
        for(int i=0; i<size; i++)
        {
            names[i] = sc.nextLine();
        }
        System.out.println("The names that you have entered are: ");
        for(int i=0; i<size; i++)
        {
            System.out.println(names[i]);
        }
        sc.close();
    }
}
