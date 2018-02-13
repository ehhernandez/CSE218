package genericClassesWithTwoFields;

public class Demo {

	public static void main(String[] args) {
		Point<Integer, String> p1 = new Point<>(1, "1.1");
//		Integer i = Integer.parseInt(p1.getY());
		double i = Double.valueOf(p1.getY());
		System.out.println(i);
	}

}
