package com.ksystem.demo.model;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 顧客リポジトリクラス。
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
