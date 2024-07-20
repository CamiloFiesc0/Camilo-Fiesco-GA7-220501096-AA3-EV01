
package com.sinfloo.demo.interfaceService;

import com.sinfloo.demo.modelo.Servicio;
import java.util.List;
import java.util.Optional;


public interface IservicioService {
 
    public List<Servicio>listarServicio();
    public Optional<Servicio>listarIdasignado(int idasignado);
    public int save(Servicio s);
    public void delete(int idasignado);
    
}
