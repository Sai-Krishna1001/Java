package com.java8.optionalclass;

import java.util.Optional;

public class OptionalDemo {

	// to avoid the abnormal termination, we use 
	
	public static void main(String[] args) {
		
		String email = "krishna@gmail.com";
		String name = null;
		
		// of, empty, ofNullable
		/*
		 * Optional<Object> emptyOptional = Optional.empty();
		 * System.out.println(emptyOptional);
		 * 
		 * Optional<String> emailOptional = Optional.of(email);
		 * System.out.println(emailOptional);
		 * 
		 * Optional<String> nameOptional = Optional.of(name);
		 * System.out.println(nameOptional);
		 * 
		 * Optional<String> stringOptional = Optional.ofNullable(email);
		 * System.out.println(stringOptional);
		 * 
		 *	// using get() method
		 * Optional<String> stringOptional2 = Optional.ofNullable(name);
		 * System.out.println(stringOptional2.get());
		 */	
		
//		Optional<String> stringOptional = Optional.ofNullable(email);
//		
//		if(stringOptional.isPresent()) {
//			System.out.println(stringOptional.get());
//		}else {
//			System.out.println("No value present");
//		}
		
		// using orElse() method
		String email2 = null;
		Optional<String> stringOptional = Optional.ofNullable(email2);
		String defaultOptional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional);
		
		// using orElseGet() method
		String defaultOptional2 = stringOptional.orElseGet(() -> "default@gmail.com");
		System.out.println(defaultOptional2);
		
		// using orElseThrow() method
//		String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("email is not exist"));
//		System.out.println(optionalObject);
		
		// using ifPresent() method
		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyOptional = Optional.empty();
		
		gender.ifPresent((s)-> System.out.println("value is present"));
		emptyOptional.ifPresent((s) -> System.out.println("value present"));
		
		String result = "  sai ";
		if(result != null && result.contains("abc")) {
			System.out.println(result);
		}
		
		Optional<String> optionalStr = Optional.of(result);
		optionalStr.filter(res -> res.contains("sai"))
				.map(String::trim)
				.ifPresent((res) -> System.out.println(res));
		
		// map method in Optional provides a way to transform value in Optional from one type to another.
	}

}
