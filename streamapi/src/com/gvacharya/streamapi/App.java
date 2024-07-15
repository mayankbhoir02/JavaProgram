package com.gvacharya.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.gvacharya.streamapi.entity.Student;

public class App {

	public static void main(String[] args) {
		int[] intArray = {3,2,4,1,6,7,4,1,5};
		
		IntStream intStream = Arrays.stream(intArray);
		
		// reduces elements from array
//		intStream
//			.filter(no->no%2==0)
//				.filter(no->no>2)
//					.forEach(no->{System.out.println(no);});/
		
		// to perform operation on every element of array MAP is used.
//		intStream
//		.filter(no->no%2==0)
//			.map(no->no+1)
//				.forEach(no->System.out.println(no));
			
		Student[] studentArray = new Student[5];
		
		studentArray[0] = new Student(1,"Rohit",26);
		studentArray[1] = new Student(2,"Mohit",21);
		studentArray[2] = new Student(3,"Purohit",25);
		studentArray[3] = new Student(4,"Rohit",20);
		studentArray[4] = new Student(5,"kunal",20);
		
		//stream interface - student user defined dtype
		Stream<Student> studentStream = Arrays.stream(studentArray);
//		
//		studentStream
//			.map(e->e.getName())
//				.filter(name->name.charAt(0) =='r')
//					.forEach(name->System.out.println(name));
//		studentStream.close();
//		
//		studentStream
//			.map(r->r.getRollNo())
//				.filter(r->r%2==0)
//					.forEach(System.out::println);
//		studentStream.close();
//		
//		studentStream
//			.filter(obj->{return (obj.getRollNo() % 2 == 0);})
//				.forEach(System.out::println);
//		studentStream.close();
		
//		studentStream
////		.map(obj -> obj.getAge())
//			.map(Student::getAge)
//				.distinct()
//					.sorted(Comparator.reverseOrder())
//						.forEach(System.out::println);
		
		//Terminal function - count
//		long count = studentStream
//			.map(Student::getAge)
//				.filter(n->n%2==0)
//					.distinct()
//						.count();
//		
//		System.out.println(count);
		
		
//		Optional<Integer> min = studentStream
//				.map(Student::getAge)
//						.sorted()
//							.min((e1,e2)->{return (e1<e2)?e2:e1;});
//							
//		if(!min.isEmpty())
//		System.out.println(min);
//		studentStream1.close(); 
		
		String[] nameArray = studentStream
				.map(Student::getName)
					.filter(str->str.charAt(1)=='o')
						.toArray(String[]::new);
		
		for(String name:nameArray)
			System.out.println(name);
		
					
		//ass3
		//integerarray
		//sort
		//filter evenodd
		//map multiply
		
		//ass2
		//employee class - name,salary,id
		//map - obj -> name
		//toarray - stringstream -> stringarray
		//bubblesort
		
		//ass1
		//pincode array
		//max pincodes
		
	}
}
