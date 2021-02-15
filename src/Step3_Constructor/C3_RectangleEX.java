package Step3_Constructor;

import java.util.Scanner;

class Shape{
	
	Shape(){
		
	}
	Shape(int w){
		System.out.println("정사각형의 넓이 "+w*w);
	}
	Shape(int w, int h){
		System.out.println("직사각형의 넓이 "+w*h);
	}
	Shape(int w,int h,int d){
		System.out.println("직육면체의 부피 "+w*h*d);
	}
}

public class C3_RectangleEX {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		/*
		int x=sc.nextInt();
		int y=sc.nextInt();
		int h=sc.nextInt();
		
		Shape s1= new Shape(x);
		Shape s2= new Shape(x,y);
		Shape s3= new Shape(x,y,h);
		
		sc.close();
		*/
		Shape s1= new Shape(10);
		Shape s2= new Shape(7,9);
		Shape s3= new Shape(6,7,8);
		
	}

}
