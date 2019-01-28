import java.util.Scanner;
public class Task7 {
    
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		for(int i = 0; i <= b - a+1; i++) {
		    for(int i2 = 0; i2 < i; i2++){
		        System.out.print((a + i - 1) + " ");
		    }
		    
		    System.out.print(System.getProperty("line.separator"));
		}
	}
}