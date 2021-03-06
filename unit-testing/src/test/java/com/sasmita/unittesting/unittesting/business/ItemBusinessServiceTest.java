package com.sasmita.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sasmita.unittesting.unittesting.data.ItemRepository;
import com.sasmita.unittesting.unittesting.data.SomeDataService;
import com.sasmita.unittesting.unittesting.model.Item;

@ExtendWith(MockitoExtension.class)
class ItemBusinessServiceTest {
	
	@InjectMocks
	ItemBusinessService itemBusinessServiceMock;
	
	@Mock
	ItemRepository repositoryMock;
	

	@Test
	public void retrieveAllItems_basic() {
		when(repositoryMock.findAll()).thenReturn(List.of(new Item(2,"Item2",10,20),new Item(3,"Item3",20,20)));
		List<Item> items = itemBusinessServiceMock.retrieveAllItems();
		assertEquals(200, items.get(0).getValue());
		assertEquals(400, items.get(1).getValue());
		
	}
	
}
