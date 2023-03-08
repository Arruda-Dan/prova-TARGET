import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		boolean pertence = pertenceFibonacci(num);
		if (pertence) {
			System.out.println(num + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(num + " não pertence à sequência de Fibonacci.");
		}

		sc.close();
	}

	public static boolean pertenceFibonacci(int num) {
		if (num == 0 || num == 1) {
			return true;
		}
		int a = 0;
		int b = 1;
		int c = 1;
		while (c < num) {
			c = a + b;
			a = b;
			b = c;
		}
		if (c == num) {
			return true;
		} else {
			return false;
		}
	}

}
