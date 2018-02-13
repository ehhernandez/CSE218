package readMe;

public class ReadMe {

/* the concept of erasure 
 * 
 */
/*
You cannot instantiate a type parameter
 
public class MyClass<T> {
	public MyClass() {
		T myObject = new T(); // not allowed
	}
}
*/
	
/*	You cannot create an array of objects from generic class
 ArrayList<String> [] a = new ArrayList<>[100]); // not ok
 Integer[] numbers = new Integer[100]; // ok
 
 */
	
	
/*
 A generic class's type parameter cannot be the type of a static 
 field and cannot be referred to in a static method
 
 public class MyClass<T> {
 	private static T value; // not allowed
 }
 
 public class MyClass<T> {
 
 	public static void doSomething() {
 	T myValue; // not allowed
 	
 	}
  */
	
/* You cannot make an exception class generic
 */
}
