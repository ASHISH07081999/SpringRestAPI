package com.springrest.springrest.controller;

import java.util.Arrays;import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P1 {

	public static void main(String[] args) {
		
		int[] a=null;
		
		 Optional<int[]> of = Optional.of(a);
		 
		 if(of.isPresent()) {
			 System.out.println("it is showing" );
		 }
		 else {
			 System.out.println("else");
		 }
		 
		 
		//Arrays.stream(a).flatmap(Stream<int>).summarystatitics().getmax().orelse(0);
		
		int min = Arrays.stream(a).summaryStatistics().getMin();
		
		System.out.println(min);
		
		

		
		
	}
	
}
