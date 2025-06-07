package com.github.adrien.cuisse;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class FizzBuzzTests
{
	private final FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	void fizzbuzz_numberIs1_stringIs1()
	{
		// given
		int number = 1;

		// when
		String output = this.fizzbuzz.generate(number);

		// then
		assertThat(output, is("1"));
	}

	@Test
	void fizzbuzz_numberIs2_stringIs2()
	{
		// given
		int number = 2;

		// when
		String output = this.fizzbuzz.generate(number);

		// then
		assertThat(output, is("2"));
	}

	@Test
	void fizzbuzz_numberIs4_stringIs4()
	{
		// given
		int number = 4;

		// when
		String output = this.fizzbuzz.generate(number);

		// then
		assertThat(output, is("4"));
	}
}
