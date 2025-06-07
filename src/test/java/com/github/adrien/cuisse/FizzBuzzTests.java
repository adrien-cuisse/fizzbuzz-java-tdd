package com.github.adrien.cuisse;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class FizzBuzzTests
{
	@Test
	void fizzbuzz_numberIs1_stringIs1()
	{
		// given
		int number = 1;

		// when
		String output = new FizzBuzz().generate(number);

		// then
		assertThat(output, is("1"));
	}
}
