package c2_exception;

public class E2_ArrayIndexOutOfBoundsExcpetion {

	public static void main(String[] args) {
		int [] intArray=new int[5];
		
		try {
			intArray[3]=10;
			intArray[6]=5;
			System.out.println(intArray[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열의 범위초과");
		}
	}

}
