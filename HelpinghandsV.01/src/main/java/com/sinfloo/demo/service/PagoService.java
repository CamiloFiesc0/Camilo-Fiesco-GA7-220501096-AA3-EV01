
package com.sinfloo.demo.service;

import com.sinfloo.demo.interfaceService.IpagoService;
import com.sinfloo.demo.interfaces.Ipago;
import com.sinfloo.demo.modelo.Pago;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService implements IpagoService {

    @Autowired
    private Ipago data;
    
    
    @Override
    public List<Pago> listarPago() {
        return (List<Pago>)data.findAll();
    }
    
    @Override
    public Optional<Pago> listarNumfactura(int numfactura) {
        return data.findById(numfactura);
    }


   @Override
    public int save(Pago p) {
        int res=0;
       Pago pago=data.save(p);
       if(!pago.equals(null)){
           res=1;
       }
       
        return 0;
    }

    

    @Override
    public void delete(int numfactura) {
        data.deleteById(numfactura);
    }
     
   
    
}
