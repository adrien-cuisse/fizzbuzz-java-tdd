package com.github.adrien.cuisse;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		return IntStream.range(from, to + 1)
			.mapToObj(this::generate)
			.collect(Collectors.joining(" "));
	}
}
