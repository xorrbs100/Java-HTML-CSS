package Ex3;
class Sub extends Calculator{
	
	int a, b;
	@Override
	int calculate() {
		return a-b;
	}

	@Override
	void setValue(int a, int b) {
		this.a=a;this.b=b;
		
	}
	
}