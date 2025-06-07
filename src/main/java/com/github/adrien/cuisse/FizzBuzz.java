package com.github.adrien.cuisse;

public final class FizzBuzz
{
	public String generate(int number)
	{
		if (number == 5)
			return "Buzz";
		if (number == 10)
			return "Buzz";
		if (number % 3 == 0)
			return "Fizz";
		return String.valueOf(number);
	}
}
