package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.RepassDAO;
import com.example.casestudymodul3.model.Account;

public class RepassService {
    RepassDAO repassDAO = new RepassDAO();
    public void updatepass(Account account1){
         repassDAO.updatepass(account1);
    }
}
