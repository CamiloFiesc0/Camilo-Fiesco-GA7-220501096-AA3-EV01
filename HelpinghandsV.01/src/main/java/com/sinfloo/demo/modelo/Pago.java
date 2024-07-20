
package com.sinfloo.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private int numfactura;
    private String metodopago;
    private String estadopago;
    private int valor;
    private int idservicio;

    public Pago() {
    }

    public Pago(int numfactura, String metodopago, String estadopago, int valor, int idservicio) {
        this.numfactura = numfactura;
        this.metodopago = metodopago;
        this.estadopago = estadopago;
        this.valor = valor;
        this.idservicio = idservicio;
    }

    public int getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(int numfactura) {
        this.numfactura = numfactura;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public String getEstadopago() {
        return estadopago;
    }

    public void setEstadopago(String estadopago) {
        this.estadopago = estadopago;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }
    
       
}
