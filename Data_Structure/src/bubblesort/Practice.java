package bubblesort;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {9,4,5,2,1,3,8,6,7};
		
		bubbleSort(array);
		
		for(int i : array) {
			System.out.print(i +" ");
		}
	}

	private static void bubbleSort(int array[]) {
		for (int i = 0; i < array.length -1; i++) {
			for (int j = 0; j < array.length -1; j++) {
				if(array[j]>array[j+1]) {
				int temp = array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
			}
		}
		
		
	}

}
