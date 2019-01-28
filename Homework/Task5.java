import java.util.Scanner;
public class Task5 {
    public static void main (String[] args) {

        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        System.out.println ( 
            a * (b - a + 1) + (b - a) * (b - a + 1) / 2
        ); 

    }
}