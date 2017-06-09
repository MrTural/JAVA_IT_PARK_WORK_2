import java.util.Scanner;
class Program {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		int number = 13;
		
		int userNumber = scanner.nextInt();
		
		if (userNumber==number) {
			System.out.println("Good");
		} else {
			if (userNumber>number) {
				System.out.println(">");
			} else {
				System.out.println("<");
			}
			
			userNumber=scanner.nextInt();
			
			if (userNumber==number) {
				System.out.println("Good");
			} else {
			
				if (userNumber>number) {
					System.out.println(">");
				} else {
					System.out.println("<");
				}
			
				userNumber=scanner.nextInt();
				
				if (userNumber==number) {
					System.out.println("Good");
				} else {
					System.out.println("=(");
				}
			}
			
			
		}	
		
	}
}