package august05.java8features.lambdaexpression;

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface MyInterface{
   void add();
}

@FunctionalInterface
interface MyInterface1{
   boolean isEven();
}

@FunctionalInterface
interface MyInterface2{
   int length(String str);
}

public class Main {

	public static void main(String[] args) {
		MyInterface mob = new MyInterface() {
			public void add() {
            	int i,j;
            	i=10;
            	j=20;
            	int s=i+j;
            	System.out.println("sum="+s);
            }
		};

		mob.add();

		MyInterface mob1=()-> {
			int i,j;
			i=10;
			j=20;
			int s=i+j;
			System.out.println("sum="+s);
		};
		
		mob1.add();
		
		MyInterface1 mob2 = () -> (9%2 == 0);
		System.out.println(mob2.isEven());

		MyInterface2 mob3 = (str) -> str.length();
		System.out.println(mob3.length("Shridhar Kirti Ji Deepika Ravi Tannu Aarti"));
		
		Runnable rob = () -> System.out.println("Runnable Interface using Lambda 0");
		Thread t = new Thread(rob);
		t.start();
		
		Runnable rob1 = () -> System.out.println("Runnable Interface using Lambda 1");
		rob1.run();
		
		Predicate<Integer> pob = (num) -> num%2 == 0;
		boolean isEven = pob.test(6);
		System.out.println("Is Even: " + isEven);
		
		//take a group of integer objects in an array
        Integer []arr={8,9,10,11,12,13,14,15,16};
        
	    //create Predicate reference to lambda expression
	    Predicate<Integer>gt=(i) -> i>10;
	   
	    System.out.println("Numbers greater than 10 :");
	    
	    //call the method and pass predicate reference
	    myMethod(gt,arr);
	    
	    Function<String, Integer> length = (s) -> s.length();
	    System.out.println("Length of String " + "Shri" + ": " + length.apply("Shri"));
	    
	    // Lowercase to Uppercase
	    Function<String, String> lowerToUpper = (s) -> s.toUpperCase();
	    System.out.println("UpperCase of String " + "Shri" + ": " + lowerToUpper.apply("Shri"));
	    
	    // Char at 4th Position
	    Function<String, Character> charAtPos = (s) -> s.charAt(3);
	    System.out.println("Length of String " + "Shri" + ": " + charAtPos.apply("Shri"));
	}

	static void myMethod(Predicate<Integer> p, Integer []arr) {
		for(Integer i: arr) {
			if(p.test(i)) System.out.println(i+" ");
		}
	}
}
