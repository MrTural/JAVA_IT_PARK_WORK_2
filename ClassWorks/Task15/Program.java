class Program {
	static void showLess(int array[], int number) {
		for(int i = 0; i < 4; i++) {
			if(array[i] < number) {
				System.out.println(array[i]);
			}
		}
	}
	public static void main(String args[]) {
		int a [] = {3, 5, 9, 4};
		showLess(a, 6);
		}
}