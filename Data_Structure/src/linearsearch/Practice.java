package linearsearch;

public class Practice {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,4,8,9};
		
		int index = linearSearch(array , 3);
		if(index !=-1) {
			System.out.println("Element in index "+index);
		}else {
			System.out.println("Element not found");
		}

	}

	private static  int linearSearch(int[] array, int value) {
		for(int i=0; i<array.length;i++) {
			if(array[i]==value) {
				return i;
			}
		}
		
		return -1;
	}
}
