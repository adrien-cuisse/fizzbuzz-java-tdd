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
			arguments(4, "4"));
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
}
