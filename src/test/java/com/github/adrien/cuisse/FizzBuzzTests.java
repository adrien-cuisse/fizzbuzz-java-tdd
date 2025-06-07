package com.github.adrien.cuisse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

final class FizzBuzzTests
{
	private final FizzBuzz fizzbuzz = new FizzBuzz();

	static List<Arguments> anyNumber()
	{
		return List.of(
			arguments(1, "1"),
			arguments(2, "2"),
			arguments(4, "4"),
			arguments(437683738, "437683738"));
	}

	@ParameterizedTest
	@MethodSource("anyNumber")
	@DisplayName("returns number-string for any number")
	void fizzbuzz_anyNumber_numberInString(int number, String expectedOutput)
	{
		// given: any number

		// when
		String output = this.fizzbuzz.generate(number);

		// then
		assertThat(output, is(expectedOutput));
	}

	static List<Integer> multipleOf3()
	{
		return List.of(3, 6, 9);
	}

	@ParameterizedTest
	@MethodSource("multipleOf3")
	@DisplayName("returns Fizz for multiples of 3")
	void fizzbuzz_numberIs3_stringIsFizz(int multipleOf3)
	{
		// given: a multiple of 3

		// when
		String output = this.fizzbuzz.generate(multipleOf3);

		// then
		assertThat(output, is("Fizz"));
	}

	@Test
	void fizzbuzz_numberIs5_stringIsBuzz()
	{
		// given
		int number = 5;

		// when
		String output = this.fizzbuzz.generate(number);

		// then
		assertThat(output, is("Buzz"));
	}

	@Test
	void fizzbuzz_numberIs10_stringIsBuzz()
	{
		// given
		int number = 10;

		// when
		String output = this.fizzbuzz.generate(number);

		// then
		assertThat(output, is("Buzz"));
	}
}
