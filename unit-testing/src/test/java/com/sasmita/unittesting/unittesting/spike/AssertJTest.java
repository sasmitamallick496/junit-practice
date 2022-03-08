package com.sasmita.unittesting.unittesting.spike;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertJTest {
	
	@Test
	public void learning() {
		List<Integer> numbers = List.of(12,13,14);
		assertThat(numbers,hasSize(3));
		assertThat(numbers, hasItems(12,14));
		assertThat(numbers, everyItem(greaterThan(10)));
		assertThat("",isEmptyString());
		assertThat("Sasmita",startsWith("Sas"));
		assertThat("Mayank",containsString("ank"));
	}

}
