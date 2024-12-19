package com.jtc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirsttDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55, 22, 40, 11, 4, 66, 88, 99);

		for (Integer i : list) {

			if (i <30) {
				System.out.println(i);
			}
		}
		System.out.println("=======stram===========");

		/*
		 * Stream<Integer> filterstream = list.stream();
		 * 
		 * filterstream.filter(i->i<30).forEach(j->System.out.println(j));
		 */
		
		list.stream().filter(i->i>30).forEach(i->System.out.println(i));
		//max value
		Optional<Integer> max = list.stream().max((a,b)->a>b ?1 :(a<b ? -1 : 0 ));
		System.out.println(max);
		
		//min value
		
		Optional<Integer> min = list.stream().min(Integer::compareTo);
		
		
		System.out.println("min value -"+min.get());

	}
	

}
