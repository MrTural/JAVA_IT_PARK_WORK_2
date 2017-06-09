class Program {
	public static void main(String args[]) {
		int a[] = {5, 2, 1, 5, 6, 7};
		int n = 6;
		int i = 0;
		while (i < (n/2)){
			int temp = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = temp;
			i++;
		} 
		i = 0;
		while (i < n) {
		System.out.println(a[i]);
		i++;
		}
	}
}