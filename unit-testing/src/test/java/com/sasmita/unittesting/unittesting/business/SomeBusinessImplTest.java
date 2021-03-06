package com.sasmita.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sasmita.unittesting.unittesting.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplTest {
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Mock
	SomeDataService dataServiceMock;
	

	@Test
	public void calculateSum_basic() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, businessImpl.calculateSum());
	}
	
	@Test
	public void calculateSum_empty() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(0, businessImpl.calculateSum());
	}
	
	@Test
	public void calculateSum_one_value() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {10});
		assertEquals(10, businessImpl.calculateSum());
	}
	
	@Test
	public void spying() {
		ArrayList arrayListSpy = spy(ArrayList.class);
		arrayListSpy.add("Test0");
		System.out.println(arrayListSpy.get(0));
		System.out.println(arrayListSpy.size());
		arrayListSpy.add("Test1");
		arrayListSpy.add("Test2");
		System.out.println(arrayListSpy.size());
		when(arrayListSpy.size()).thenReturn(5);
		System.out.println(arrayListSpy.size());
		verify(arrayListSpy).add("Test2");
		
		
	}

}
