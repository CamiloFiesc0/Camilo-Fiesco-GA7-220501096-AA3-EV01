
package com.sinfloo.demo.interfaces;
import com.sinfloo.demo.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iusuario extends CrudRepository<Usuario, Integer>{
    
}
