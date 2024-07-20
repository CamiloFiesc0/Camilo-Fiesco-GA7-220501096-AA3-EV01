
package com.sinfloo.demo.interfaceService;

import com.sinfloo.demo.modelo.Solicitud;
import java.util.List;
import java.util.Optional;


public interface IsolicitudService {
    
      public List<Solicitud>listarSolicitud();
    public Optional<Solicitud>listarCodigo(int codigo);
    public int save(Solicitud s);
    public void delete(int codigo);

  
    
}
