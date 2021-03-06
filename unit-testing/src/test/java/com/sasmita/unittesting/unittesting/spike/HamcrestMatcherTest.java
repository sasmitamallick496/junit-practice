package com.sasmita.unittesting.unittesting.spike;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class HamcrestMatcherTest {
	
	@Test
	public void learning() {
		List<Integer> numbers = List.of(12,13,14);
		assertThat(numbers)
					.hasSize(3)
					.contains(12,13)
					.allMatch(x -> x>10);
		assertThat("").isEmpty();
		assertThat("ABCD").startsWith("ABC");
	}

}
