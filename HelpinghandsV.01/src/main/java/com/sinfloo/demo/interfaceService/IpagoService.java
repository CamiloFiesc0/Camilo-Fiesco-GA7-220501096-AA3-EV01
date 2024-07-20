
package com.sinfloo.demo.interfaceService;

import com.sinfloo.demo.modelo.Pago;
import java.util.List;
import java.util.Optional;


public interface IpagoService {
    
    public List<Pago>listarPago();
    public Optional<Pago>listarNumfactura(int numfactura);
    public int save(Pago p);
    public void delete(int numfactura);
}
