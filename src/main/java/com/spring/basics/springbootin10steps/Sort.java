package com.spring.basics.springbootin10steps;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // marking the implementation below as a component that can be injected
@Primary // this is making this component as a primary component so if we have more than one component that could be injected this will be the one to be used
public class Sort implements SortAlgorithm{

	public int[] simpleSort(int[] numbers) {		
		Arrays.sort(numbers);
		return numbers;
	}	
}
