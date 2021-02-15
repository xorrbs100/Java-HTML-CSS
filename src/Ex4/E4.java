package Ex4;

class SharpPenceil {
	private int width;
	private int amount;

	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
class BallPen extends SharpPenceil{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

class FountainPen extends BallPen{	
	
	public void refill(int n) {
		setAmount(n);
		
		
		System.out.println(this.getAmount()+""+"만큼 리필합니다");
	}
	
	
}
public class E4 {
	public static void main (String [] args) {
		FountainPen fp1 = new FountainPen();
		fp1.refill(10);
		BallPen bp=new BallPen();
		bp.setAmount(12);
		bp.setWidth(15);
		fp1.setWidth(15);
		fp1.setAmount(15);
		fp1.setColor("red");
	}

}
