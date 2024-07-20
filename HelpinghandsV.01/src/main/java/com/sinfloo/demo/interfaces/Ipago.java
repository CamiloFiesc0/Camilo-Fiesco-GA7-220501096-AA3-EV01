
package com.sinfloo.demo.interfaces;


import com.sinfloo.demo.modelo.Pago;
import org.springframework.data.repository.CrudRepository;


public interface Ipago extends CrudRepository<Pago, Integer> {
    
}
