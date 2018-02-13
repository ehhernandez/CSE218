package genericClasses;

public class Demo {

	public static void main(String[] args) {
		Point<Integer> p1 = new Point<>(1, 2);
		Point<Double> p2 = new Point<>(1.1, 2.2);
		Point<String> p3 = new Point<>("One point one", "Two point two");
		
		printPointNumbers(p1);
		printPointNumbers(p2);
//		printPointNumbers(p3);
//		p1.setX(3);
//		p2.setX(3.3);
//		p3.setX("Three point three");
//		
//		int x = p1.getX();
//		double z = p1.getX();
//		String y = p2.getY().toString();
//		System.out.println("Y value is a string: " + y);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
	}
	
	public static void printPointNumbers(Point<? extends Number> point) {
		System.out.println(point);
	}

}
