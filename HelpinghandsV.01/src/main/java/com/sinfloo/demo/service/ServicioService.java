
package com.sinfloo.demo.service;

import com.sinfloo.demo.interfaceService.IservicioService;
import com.sinfloo.demo.interfaces.Iservicio;
import com.sinfloo.demo.modelo.Servicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioService implements IservicioService{

    @Autowired
    private Iservicio data;

    @Override
    public List<Servicio> listarServicio() {
        return (List<Servicio>)data.findAll();
    }

    @Override
    public Optional<Servicio> listarIdasignado(int idasignado) {
        return data.findById(idasignado);
    }

    @Override
    public int save(Servicio s) {
        int res=0;
       Servicio servicio=data.save(s);
       if(!servicio.equals(null)){
           res=1;
       }
       
        return 0;
    }

    @Override
    public void delete(int idasignado) {
        data.deleteById(idasignado);
    }
    
    
    }


    
     

     
     
    
