
package com.sinfloo.demo.interfaceService;

import com.sinfloo.demo.modelo.Usuario;
import java.util.List;
import java.util.Optional;


public interface IusuarioService {
    public List<Usuario>listar();
    public Optional<Usuario>listarId(int id);
    public int save(Usuario u);
    public void delete(int id);
    public int RegistroExitoso(Usuario r);
    
}
