package com.matriz.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matriz.system.models.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
