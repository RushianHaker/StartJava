import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if((a > b)&(b > c)){
			System.out.println(a + "This number is more.");
		}else if((b > a)&(a > c)){
			System.out.println(b + "This number is more.");
		}else if((c > a)&(a > b)){
			System.out.println(c + "This number is more."); 
		}

		if((a < b)&(a < c)){
			System.out.println(a + " - This number is less.");
		}else if((b < a)&(b < c)){
			System.out.println(b + " - This number is less.");
		}else if((c < a)&(c < b)){
			System.out.println(c + " - This number is less.");
		}
	}
}