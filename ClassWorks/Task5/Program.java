import java.util.Scanner;
class Program {
	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		while (i <= n) {
			if (i % 2 == 0){
				System.out.println(i);
			}	
			i=i+1;
		}
	}
}
