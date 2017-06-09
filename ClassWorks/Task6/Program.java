import java.util.Scanner;

class Program {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 2;
		boolean isPrime = true;
		while(i*i<=n) {
			if (n % i == 0){
				isPrime = false;
				break;
			} 
			i++; // i=i+1
		} if (isPrime == true) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}
	}
}		