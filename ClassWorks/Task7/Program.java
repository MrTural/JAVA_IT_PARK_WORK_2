import java.util.Scanner;

class Program {
	public static void main(String args[]) {
	Scanner scanner = new Scanner (System.in);
	int a[] = {5, 2, 1, 5, 6, 7};
	int i = scanner.nextInt();
	int j = scanner.nextInt();
	int n = a[i];
	a[i] = a[j];
	a[j] = n;
	i = 0;
	while (i < 6){
		System.out.println(a[i]);
		i++;
		}
	}
}