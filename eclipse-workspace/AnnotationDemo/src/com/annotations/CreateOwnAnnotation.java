package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Marker Annotation
	// Single Value Annotation
	// Multi Value Annotation


// Meta Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)


// Multi Value Annotation
@interface SmartPhone{
	String os() default "Symbian";
	int version() default 1;
}

@SmartPhone(os = "Android", version = 1)
class NokiaASeries{
	
	String model;
	int size;
	
	public NokiaASeries(String model, int size) {
		
		this.model = model;
		this.size = size;
	}
	
	
}

public class CreateOwnAnnotation {

	public static void main(String[] args) {
		
		NokiaASeries obj = new NokiaASeries("Fire", 5);
		@SuppressWarnings("rawtypes")
		Class c = obj.getClass();
		@SuppressWarnings("unchecked")
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
	}
}
