/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author User_
 */
public class libros {
    private int id_libros;
    private String titulo;
    private String autor;
    private String editorial;
    private int cantidad;
    private int tiempo_limite;
    private int estado;
    private String referencia;

    public libros(int id_libros, String titulo, String autor, String editorial, int cantidad, int tiempo_limite, int estado, String referencia) {
        this.id_libros = id_libros;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.cantidad = cantidad;
        this.tiempo_limite = tiempo_limite;
        this.estado = estado;
        this.referencia = referencia;
    }

    public int getId_libros() {
        return id_libros;
    }

    public void setId_libros(int id_libros) {
        this.id_libros = id_libros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTiempo_limite() {
        return tiempo_limite;
    }

    public void setTiempo_limite(int tiempo_limite) {
        this.tiempo_limite = tiempo_limite;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
    
    
    
}
