class Program {
	public static void main(String args[]) {
		int a[] = {4, 5, 9, 2, 1};
		int x = 0;
		int y = 1;
		for (int i = 4; i >= 0; i--) {
			x = x + a[i] * y;
			y = y * 10;
		}
		//x = (a[1] * 10000) + (a[2] * 1000) + (a[3] * 100) + (a[4] * 10) + (a[5] * 1);
		System.out.println(x);
	}
}