package Ex3;

abstract class Calculator{
	private int a, b;

	void setValue(int a, int b) {
		this.a=a; this.b=b;
	}
	abstract int calculate();
}