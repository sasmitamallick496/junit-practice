package com.sasmita.unittesting.unittesting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasmita.unittesting.unittesting.data.ItemRepository;
import com.sasmita.unittesting.unittesting.model.Item;

@Service
public class ItemBusinessService {
	
	@Autowired
	private ItemRepository repository;

	public Item retrieveHardCodedItem() {
		return new Item(1,"Ball",10,100);
	}
	
	public List<Item> retrieveAllItems(){
		List<Item> items = repository.findAll();
		items.stream().forEach(item -> item.setValue(item.getQuantity()*item.getPrice()));
		return items;
		
	}

}
