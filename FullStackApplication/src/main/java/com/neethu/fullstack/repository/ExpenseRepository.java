package com.neethu.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neethu.fullstack.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

}
