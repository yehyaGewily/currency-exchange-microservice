package com.exchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exchange.exchangevalue.ExchangeValue;
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
public ExchangeValue findByFromAndTo(String from,String to);
}
