package linearsearch;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {1,2,3,4,5,6,7,8,9};
		int index =linearSearch(array,6);
		if(index!= -1) {
			System.out.println("Element in index "+index);
		}
		else {
			System.out.println("Elment not found");
		}
	}

	private static int linearSearch(int[] array, int value) {
		// TODO Auto-generated method stub{
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value) {
				return i;
			}
			
		}
		return -1;
	}

}
