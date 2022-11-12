package com.mycompany.youtuber;

import java.sql.Time;
import java.util.Date;


public class Video {
    String codigo;
    String nombre;
    Date fechaCreacion;
    Date fechaSubida;
    Time duracion;

    public Video() {
    }

    public Video(String codigo, String nombre, Date fechaCreacion, Date fechaSubida, Time duracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaSubida = fechaSubida;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Video{" + "codigo=" + codigo + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", fechaSubida=" + fechaSubida + ", duracion=" + duracion + '}';
    }
    
}
