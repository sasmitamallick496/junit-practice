package com.sasmita.unittesting.unittesting.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasmita.unittesting.unittesting.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
