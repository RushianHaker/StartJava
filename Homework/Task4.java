import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

	int N = new Scanner(System.in).nextInt();

        while(0 < N) {
            int numeral = N % 10;
            
            if((numeral / 2 == 1)&(numeral % 2 == 0)) {
                System.out.println("True");
                return;
            }
            
            N = N / 10;
        }
        System.out.println("False");
	}
}