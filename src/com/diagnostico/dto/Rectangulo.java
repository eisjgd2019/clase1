/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diagnostico.dto;

/**
 *
 * @author estudiantes
 */
public class Rectangulo {
    private int ancho;
    private int alto;
    private int estado;
    private String color;

    public Rectangulo(int ancho, int alto, int estado, String color) {
        this.ancho = ancho;
        this.alto = alto;
        this.estado = estado;
        this.color = color;
    }

    public Rectangulo() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getEstado() {
        return estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void cambiarEstado(int estado){
        this.estado = estado;
    }
}
