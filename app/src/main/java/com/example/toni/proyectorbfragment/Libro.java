package com.example.toni.proyectorbfragment;

/**
 * Created by Toni on 30/04/2016.
 */
public class Libro {
    private String titulo;
    private String autor;
    private String fecha;
    private String preExplicacion;
    private String resumen;
    private String personal;
    private int portada;

    public Libro(String titulo, String autor, String fecha, String preExplicacion, String resumen, String personal, int portada) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.preExplicacion = preExplicacion;
        this.resumen = resumen;
        this.personal = personal;
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPreExplicacion() {
        return preExplicacion;
    }

    public String getResumen() {
        return resumen;
    }

    public String getPersonal() {
        return personal;
    }

    public int getPortada() {
        return portada;
    }
}
