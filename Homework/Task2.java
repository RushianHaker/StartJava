import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if((a > b)&(c > b)){
			System.out.println("Ответ - " + (a + c));
		}else if((b > a)&(c > a)){
			System.out.println("Ответ - " + (b + c));
		}else if((a > c)&(b > c)){
			System.out.println("Ответ - " + (a + b)); 
		}
	}
}