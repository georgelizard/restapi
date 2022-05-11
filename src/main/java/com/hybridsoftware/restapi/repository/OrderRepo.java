package com.hybridsoftware.restapi.repository;

import com.hybridsoftware.restapi.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface OrderRepo extends PagingAndSortingRepository<Order, Integer> {
}