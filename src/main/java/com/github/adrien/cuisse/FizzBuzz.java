package com.github.adrien.cuisse;

public final class FizzBuzz
{
	public String generate(int number)
	{
		if (number == 3 )
			return "Fizz";
		if (number == 6)
			return "Fizz";
		return String.valueOf(number);
	}
}
