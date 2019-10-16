package com.spring.basics.springbootin10steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // marking the implementation below as a component that can be injected
@Primary //this is making this component as a primary component so if we have more than one component that could be injected this will be the one to be used
public class Search implements SearchAlgorithm {

	@Override
	public int search(int[] arrayToSearch, int numberToSearch) {
		
		int result = 0;
		for (int i : arrayToSearch) {
			result = (numberToSearch == i)? 1 : 0; 
		}				
		return result;
	}

}
