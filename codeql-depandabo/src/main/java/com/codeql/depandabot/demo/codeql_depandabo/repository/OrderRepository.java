package com.codeql.depandabot.demo.codeql_depandabo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeql.depandabot.demo.codeql_depandabo.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long>{

}
