package com.spring.basics.springbootin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	@Autowired
	private SearchAlgorithm searchAlgorithm;
	
	public BinarySearchImpl() {}
		
	public BinarySearchImpl(SortAlgorithm sortAlgorithm, SearchAlgorithm searchAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
		this.searchAlgorithm = searchAlgorithm;
	}

	// if the parameter its on the passed array return 1 otherwise return 0
	public int binarySearch(int[] numbers, int numToSearchFor) {	
		// sort the array					
		int[] numbersSorted = sortAlgorithm.simpleSort(numbers);
		
		// search the array
		int found = searchAlgorithm.search(numbersSorted, numToSearchFor);
		
		// return the result
		return found;
			
	}

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public void setSearchAlgorithm(SearchAlgorithm searchAlgorithm) {
		this.searchAlgorithm = searchAlgorithm;
	}
	
	

}
