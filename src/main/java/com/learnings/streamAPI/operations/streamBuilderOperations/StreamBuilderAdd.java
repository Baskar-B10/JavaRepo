package com.learnings.streamAPI.operations.streamBuilderOperations;// Java code for StreamDemo builder()
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamBuilderAdd {

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Using StreamDemo builder()
		Stream.Builder<String> builder = Stream.builder(); 

		// Adding elements in the stream of Strings 
		Stream<String> stream = builder.add("Geeks") 
									.add("for") 
									.add("Geeks") 
									.add("GeeksQuiz") 
									.build(); 

		// Displaying the elements in the stream 
		stream.forEach(System.out::println);

		// Using StreamDemo builder()
		Stream.Builder<String> s = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> ss = s.add("Geeks").build();

		// Displaying the elements in the stream
		ss.forEach(System.out::println);

		// Using StreamDemo builder()
		Stream.Builder<String> builders = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> streams = builders.add("GEEKS")
				.add("for")
				.add("Geeks")
				.add("GeEKSQuiz")
				.build();

		// Converting elements to Lower Case
		// and storing them in List list
		List<String> list = streams.map(String::toLowerCase)
				.collect(Collectors.toList());

		// Displaying the elements in list
		System.out.println(list);
	} 
} 
