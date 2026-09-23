package com.tca.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tca.entity.Customer;
import com.tca.entity.OrderStatus;

import jakarta.transaction.Transactional;

public interface CustomerRepository extends JpaRepository<Customer,Long>
{
	@Modifying
	@Transactional
	@Query(value="INSERT into orders values(:custId, :oDate, :status, :oid)",nativeQuery=true)
	public void updateOrder(Long oid,LocalDate oDate,OrderStatus status,Long custId);
}
