package Step4_objectArray;

import java.util.Scanner;

class Book{
	String title,author;
	Book(){}
	Book(String title, String author){
		this.title=title; this.author=author;
		
	}
	
	String print() {
		return "제목 : "+title  +"저자 : "+  author;
		
	}
	
}

public class OA2_BookEX {

	public static void main(String[] args) {
		
		Book[] B1= new Book[2];
		
		
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<B1.length;i++) {
			System.out.println("제목 >> ");
			String title =sc.next();
			System.out.println("저자>> ");
			String author= sc.next();
			B1[i]=new Book(title,author);
		}
		sc.close();
		for(int i=0;i<B1.length;i++) {
			System.out.println(B1[i].print());
			
		}
		
		
	}

}
