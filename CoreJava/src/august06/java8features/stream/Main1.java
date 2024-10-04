package august06.java8features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(55);
		list.add(65);
		list.add(46);
		list.add(48);
		list.add(20);
		
		List<Integer> odd = list.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
		System.out.println(odd);
		
		long evenCount = list.stream().filter(n -> n%2 == 0).count();
		System.out.println(evenCount);
		
		Integer[] arr = list.stream().filter(n -> n%2 != 0).toArray(Integer[]::new);
		for (Integer num: arr) {
			System.out.println(num);
		}
		
		Stream<String> strings = Stream.of("hello", "hi", "Tannu", "Kavya", "neha");
		long n = strings.filter(x -> x.length() > 4).count();
		System.out.println(n);
		
		Stream<String> strings2 = Stream.of("hello", "hi", "Tannu", "Kavya", "neha");
//		strings2.filter(x -> x.startsWith("T")).map(x -> x.toUpperCase()).forEach(System.out::println);
//		strings2.filter(x -> x.startsWith("T")).map(String::toUpperCase).forEach(System.out::println);
		strings2.filter(x -> x.startsWith("T")).map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
		
		//convert all strings to  capital letters and collect them into an array 

		List<String>lst =Arrays.asList("USA","Japan","India","China", "","Russia","uk");
		List<String> lst1=lst.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		String []arr1=lst1.stream().map(x->x.toUpperCase()).toArray(String[]::new);

		System.out.println("Array of sorted strings in uppercase :");

		for(String i: arr1){
		   System.out.println(i+" ,");
		}
		
		Integer[] arrNew = {34, 56, 12, 34, 56, 12, 55, 78};
		Stream<Integer> intStream = Stream.of(arrNew);
		List<Integer> arrDistinct = intStream.distinct().collect(Collectors.toList());
		for (Integer n1: arrNew) {
			System.out.print(n1 + " ");
		}
		System.out.println();
		System.out.println(arrDistinct);
	}

}
