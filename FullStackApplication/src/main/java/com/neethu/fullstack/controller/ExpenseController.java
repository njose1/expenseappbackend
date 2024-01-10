package com.neethu.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neethu.fullstack.model.Expense;
import com.neethu.fullstack.service.ExpenseService;

@RestController
@RequestMapping("/expense")
@CrossOrigin
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;

	@PostMapping("/add")
	public String add(@RequestBody Expense expense) {
		expenseService.addExpense(expense);
		return "Success";
	}
}
