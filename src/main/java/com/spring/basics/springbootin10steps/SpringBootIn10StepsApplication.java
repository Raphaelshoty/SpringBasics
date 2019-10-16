package com.spring.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootIn10StepsApplication {

	public static void main(String[] args) {
		// what are the beans ? -> @component 
		// what are the dependencies of a bean ? @autowired
		// what to search for beans -> there´s no need because the spring run a component scan for it
		
		//BinarySearchImpl binarySearch = new  BinarySearchImpl(new Sort(), new Search()); // here in this way im using polimorphism
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootIn10StepsApplication.class, args); // here im getting the application context, so this way getting the object
		//that contains the beans that were marked as components by the @Component annotation 
		
		BinarySearchImpl bean = applicationContext.getBean(BinarySearchImpl.class); // here im retrieving the bean(@component) itself
		int result = bean.binarySearch(new int[] {1,25,2}, 0);
		System.out.println(result);
	}
}
		
		
		

