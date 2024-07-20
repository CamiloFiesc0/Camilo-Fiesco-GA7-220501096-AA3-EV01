
package com.sinfloo.demo.service;

import com.sinfloo.demo.interfaceService.IsolicitudService;
import com.sinfloo.demo.interfaces.Isolicitud;
import com.sinfloo.demo.modelo.Solicitud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudService implements IsolicitudService{

    @Autowired
    private Isolicitud data;
    
    
    @Override
    public List<Solicitud> listarSolicitud() {
        return (List<Solicitud>)data.findAll();
    }

   @Override
    public Optional<Solicitud> listarCodigo(int codigo) {
        return data.findById(codigo);
    }

   
     @Override
    public int save(Solicitud s) {
        int res=0;
       Solicitud solicitud=data.save(s);
       if(!solicitud.equals(null)){
           res=1;
       }
       
        return 0;
    }
    

    @Override
    public void delete(int codigo) {
        data.deleteById(codigo);
    }

    
    
     
}
