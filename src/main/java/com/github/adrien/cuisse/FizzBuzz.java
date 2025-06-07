package com.github.adrien.cuisse;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

public final class FizzBuzz
{
	public String generate(int number)
	{
		if (number % 15 == 0)
			return "FizzBuzz";
		if (number % 3 == 0)
			return "Fizz";
		if (number % 5 == 0)
			return "Buzz";
		return String.valueOf(number);
	}

	public String generate(int from, int to)
	{
		return range(from, to + 1)
			.mapToObj(this::generate)
			.collect(joining(" "));
	}
}
