package com.tzadikiel.itemProductos.models.service;

import java.util.List;

import com.tzadikiel.itemProductos.models.domain.Item;

public interface IItemService{
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	
}
