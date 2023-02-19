package linearsearch;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {4,6,7,8,9,0,4,2,3,4,};
		
		int  index =linearSearch(array,6);
		
		if(index!= -1) {
			System.out.println("Element is in the index "+index);
		}else {
			System.out.println("cahracter not found");
		}
	}

	private static int linearSearch(int[] array, int string) {
		// TODO Auto-generated method stub
		for(int i = 0; i<array.length;i++) {
			if(array[i]==string) {
				return i;
			}
		}
		return -1;
	}

}
