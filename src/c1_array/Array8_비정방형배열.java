/* 비정방형
 * [][][][][]
 * [][][]
 * [][]
 * [][][][][][]
 * 
 */

package c1_array;

public class Array8_비정방형배열 {

	public static void main(String[] args) {
		
		int[][]arr=new int[4][];
		arr[0] = new int [5];
		arr[1] = new int [3];
		arr[2] = new int [2];
		arr[3] = new int [6];
		
		//입력
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=(i+1)*10+j;
				
			}
		}
	
	//출력
	for(int i=0; i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+ " ");
		}System.out.println();
	}
	
	//연습
	char  [][]ch= {{'가','나','다','라','마'},{'가','나'},{'가','나','다'},{'가','나','다','라'}};
	
	for(int i=0;i<ch.length;i++) {
		for(int j=0 ;j<ch[i].length ; j++) {
		System.out.print(ch[i][j]+" ");
		}System.out.println();
	}
	}
	
	
	
	
}









