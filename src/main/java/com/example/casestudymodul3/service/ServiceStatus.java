package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.ConnectionStatus;
import com.example.casestudymodul3.model.Status;

public class ServiceStatus {
    public  static Status ShowStatus(int status){
        return ConnectionStatus.ShowStatus(status);
    }

}
