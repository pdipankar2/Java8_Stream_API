package com.jtc.paralle;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallalDemo {
public static void main(String[] args) {
	
	System.out.println("======Sequencial Stream=======");


Stream<Integer> stream = Stream.of(1,2,3,4,5);

stream.forEach(a->System.out.println(a+"-"+Thread.currentThread()));

System.out.println("=======Parallel stream==========");

Stream<Integer> stream1 = Stream.of(1,2,3,4,5);

stream1.parallel().forEach(a->System.out.println(a+""+Thread.currentThread()));


}
}
