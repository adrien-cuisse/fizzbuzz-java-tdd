package com.github.adrien.cuisse;

public final class FizzBuzz
{
	public String generate(int number)
	{
		if (number % 3 == 0)
			return "Fizz";
		return String.valueOf(number);
	}
}
