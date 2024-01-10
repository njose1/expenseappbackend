package com.neethu.fullstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neethu.fullstack.model.Expense;
import com.neethu.fullstack.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public Expense addExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

}
