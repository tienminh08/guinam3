package com.example.casestudymodul3.Service;

import com.example.casestudymodul3.Dao.ConnectionAccount;
import com.example.casestudymodul3.Dao.ConnectionStatus;
import com.example.casestudymodul3.model.Status;

public class ServiceStatus {
    public  static Status ShowStatus(int status){
        return ConnectionStatus.ShowStatus(status);
    }

}
