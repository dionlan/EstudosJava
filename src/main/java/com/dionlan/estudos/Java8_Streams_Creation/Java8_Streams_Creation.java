package com.dionlan.estudos.Java8_Streams_Creation;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8_Streams_Creation {
	
	public static void main(String[] args) {
		//Collection
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().forEach(System.out::println);
		
		//Arrays
		Integer[] intArray = new Integer[] {1, 2, 3, 4};
		Arrays.stream(intArray).forEach(System.out::println);
		
		//Stream.of para qualquer tipo de objeto
		Stream
			.of("Dionlan", "Alves", "De", "Jesus")
			.forEach(System.out::println);
		
		//IntStream.range 0 a 5 //IntStream.rangeClosed 0 a 6
		IntStream
			.range(0, 6).forEach(System.out::println);
		
		//Stream.iterate = começa com 5, e faz o anterior x 2 = 5, 10, 20, 40, 80, 160, 320...
		Stream
			.iterate(5, n -> n * 2)
			.limit(10)
			.forEach(System.out::println);
		
		String s = "Dionlan Alves de Jesus";
		Pattern pa = Pattern.compile(" ");
		pa.splitAsStream(s).forEach(System.out::println	);
	}
}
