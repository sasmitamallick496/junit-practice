package com.sasmita.unittesting.unittesting.business;

import java.util.stream.IntStream;

import com.sasmita.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {
	
	private SomeDataService someDataService;
	
	public int calculateSum() {
		int[] data = someDataService.retrieveAllData();
		return IntStream.of(data).reduce(Integer::sum).orElse(0);
	}

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}
	

}
