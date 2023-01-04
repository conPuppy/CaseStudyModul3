package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.AccountDAO;
import com.example.casestudymodul3.model.Account;

import java.util.List;

public class AccountService {
    AccountDAO accountDAO = new AccountDAO();
    public List<Account> findByUsername(String username) {
        return accountDAO.findByUsername(username);
    }
    public Account getTopfolow(){
        return accountDAO.getTopfolow();
    }
    public  Account getTopLike(){
        return accountDAO.getTopLike();
    }
    public List<Account> getall(){
        return accountDAO.getall();
    }

    public Account ShowOneAccount(int id){
        return accountDAO.ShowOneAccount(id);
    }

    public void  Delete(int id){
        accountDAO.Delete(id);

    }
    public void  Lookup(int id){
        accountDAO.Lookup(id);

    }
    public void unLook(int id){
        accountDAO.unLook(id);

    }
}
