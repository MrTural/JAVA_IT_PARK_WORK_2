class Program {
	public static int minNumber(int array[]) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	public static int maxNumber(int array[]) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	public static int numberElement(int array[], int number) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				return i;
			} 
		}
		return -1;
	}
	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String args[]) {
		int m[] = {3, -6, 4, 1, -2};
		int myMinNumber = minNumber(m);
		System.out.println(myMinNumber);
		
		int myMaxNumber = maxNumber(m);
		System.out.println(myMaxNumber);
		
		int n = 3;
		int myElement = numberElement(m[],n);
	}
}