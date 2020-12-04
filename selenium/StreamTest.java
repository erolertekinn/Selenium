package selenium;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamTest {

// Count the number of names starting with alphabet A in the List

//@Test

	public void Regular() {

// TODO Auto-generated method stub

// Count the number of names starting with  alphabet  A in the list

		ArrayList<String> names = new ArrayList<String>();

		names.add("Hamad");

		names.add("Ali");

		names.add("Abdullah");

		names.add("Saad");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);

			if (actual.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);

	}

//@Test

	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Hamad");

		names.add("Ali");

		names.add("Abdullah");

		names.add("Saad");

// There is no life for intermediate op if there is no terminal op

// terminal operation will execute only if inter op (filter) return true

//We can create stream

// how to use filter in stream API

		Long c = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(c);

		long d = Stream.of("Hamad", "Ali", "Abdullah", "Saad").filter(s -> {

			s.startsWith("A");
			return true;

		}).count();

		System.out.println(d);

// print all the names present in the loop

//names.stream().filter(s-> s.length()>2).forEach(s -> System.out.println(s));

// for getting N number of results we use limit

		names.stream().filter(s -> s.length() > 2).limit(1).forEach(s -> System.out.println(s));

	}

	@Test

	public void streamMap(){

// print names of length 4 with uppercase

		Stream.of("Hammad", "ali", "Saad", "Abdullah").filter(s -> s.endsWith("d")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}

}