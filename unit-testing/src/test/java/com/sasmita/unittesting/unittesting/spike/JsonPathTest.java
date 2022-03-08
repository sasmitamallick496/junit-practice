package com.sasmita.unittesting.unittesting.spike;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathTest {
	
	@Test
	public void learning() {
		
		String responseFromservice = "["
				+ "{\"id\":10000,\"name\":\"Pencil\",\"quantity\":5},"
				+ "{\"id\":10001,\"name\":\"Pen\",\"quantity\":15},"
				+ "{\"id\":10002,\"name\":\"Eraser\",\"quantity\":10}"
				+ "]";
		DocumentContext context = JsonPath.parse(responseFromservice);
		int length = context.read("$.length()");
		List<Integer> ids = context.read("$..id");
		assertThat(length).isEqualTo(3);
		assertThat(ids).containsExactly(10000,10001,10002);
		
	}

}
