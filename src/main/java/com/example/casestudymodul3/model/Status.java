package com.example.casestudymodul3.model;

public class Status {
    private  int idstatus;
    private String status;

    public Status(int idstatus, String status) {
        this.idstatus = idstatus;
        this.status = status;
    }



    public int getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(int idstatus) {
        this.idstatus = idstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
