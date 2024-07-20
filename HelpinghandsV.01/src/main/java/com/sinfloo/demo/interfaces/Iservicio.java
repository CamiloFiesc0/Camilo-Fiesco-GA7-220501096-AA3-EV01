
package com.sinfloo.demo.interfaces;


import com.sinfloo.demo.modelo.Servicio;
import org.springframework.data.repository.CrudRepository;


public interface Iservicio extends CrudRepository<Servicio, Integer> {
    
}
