package Practice;

public class Shape implements Circle, Rectanlge{

	public static void main(String[] args) {
		Shape s = new Shape();
		s.Circle();
        s.Rectanlge();
	}

	private void Circle() {
		System.out.println("Circle is a shape");
		
	}

	private void Rectanlge() {
		System.out.println("Rectangle is a shape");
	
	}

	@Override
	public String shape() {
		return "We can create more shapes";
	}

}
