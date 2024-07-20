
package com.sinfloo.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "servicio")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idasignado;
    private String estadoservicio;
    private String distancia;
    private int idsolicitud;

    public Servicio() {
    }

    public Servicio(int idasignado, String estadoservicio, String distancia, int idsolicitud) {
        this.idasignado = idasignado;
        this.estadoservicio = estadoservicio;
        this.distancia = distancia;
        this.idsolicitud = idsolicitud;
    }

    public int getIdasignado() {
        return idasignado;
    }

    public void setIdasignado(int idasignado) {
        this.idasignado = idasignado;
    }

    public String getEstadoservicio() {
        return estadoservicio;
    }

    public void setEstadoservicio(String estadoservicio) {
        this.estadoservicio = estadoservicio;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }
    
    
}
