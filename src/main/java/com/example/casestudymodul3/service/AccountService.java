package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.AccountDAO;
import com.example.casestudymodul3.model.Account;

import java.util.List;

public class AccountService {
    AccountDAO accountDAO = new AccountDAO();
    public List<Account> findByUsername(String username) {
        return accountDAO.findByUsername(username);
    }

}
