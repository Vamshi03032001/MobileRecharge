package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Offers;

public interface OfferRepository extends JpaRepository<Offers,Integer> {
	
	@Query(value="select * from offers o where o.operator_operatorid=:operatorid",nativeQuery=true)
	List<Offers> findByOperator(@Param("operatorid") int operator);
}
