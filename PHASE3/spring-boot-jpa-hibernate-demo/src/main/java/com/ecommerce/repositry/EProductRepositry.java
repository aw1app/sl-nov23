package com.ecommerce.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Long>{
	
	// Spring only wants to mention those CRUD methods
	// that are not based on ID
	
	List<EProduct> findAllByName(String name);	
	
	List<EProduct> findAllByPrice(float price);
	
	//search by name like
	List<EProduct> findAllByNameContaining(String name);
	
	//
	List<EProduct> findAllByPriceGreaterThan(float price);
	
	List<EProduct> findAllByPriceGreaterThanAndPriceLessThan(float price1, float price2);
	
	//Ordering
	List<EProduct> findAllByPriceGreaterThanOrderByPrice(float price);

}
