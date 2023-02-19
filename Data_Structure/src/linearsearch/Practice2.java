package linearsearch;

public class Practice2 {
	
	public static void main(String[] args) {
		
		int array[]= {45,3,6,2,3,5,6};
		
		int index =linearSerach(array,10);
		if( index!= -1) {
			System.out.println("Element in index of "+index);
		}
		else {
			System.out.println("elment not found");
		}
	}

	private static int linearSerach(int[] array, int value) {
		for(int i =0; i<array.length;i++) {
			if(array[i]==value){
				return i;
		}
		
	}
		return -1;
	}
}
