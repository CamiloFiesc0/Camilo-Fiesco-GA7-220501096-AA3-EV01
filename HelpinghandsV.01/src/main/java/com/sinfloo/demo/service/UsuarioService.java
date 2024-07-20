
package com.sinfloo.demo.service;

import com.sinfloo.demo.modelo.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sinfloo.demo.interfaceService.IusuarioService;
import com.sinfloo.demo.interfaces.Iusuario;


@Service
public class UsuarioService implements IusuarioService{

    @Autowired
    private Iusuario data;
    
    @Override
    public List<Usuario> listar() {
        return (List<Usuario>)data.findAll();
    }

    @Override
    public Optional<Usuario> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Usuario u) {
        int res=0;
       Usuario usuario=data.save(u);
       if(!usuario.equals(null)){
           res=1;
       }
       
        return 0;
    }

    
    
       @Override
    public int RegistroExitoso(Usuario u) {
        int res=0;
       Usuario usuario=data.save(u);
       if(!usuario.equals(null)){
           res=1;
       }
       
        return 0;
    }
    
    
    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    
    
}
