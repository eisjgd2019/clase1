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
public class RectanguloHijo extends Rectangulo {
    private int posicionX;
    private int posicionY;
    private String tipoMovimiento;

    public RectanguloHijo(int posicionX, int posicionY, String tipoMovimiento, int ancho, int alto, int estado, String color) {
        super(ancho, alto, estado, color);
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tipoMovimiento = tipoMovimiento;
    }

    public RectanguloHijo() {
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    /**
     * tipo movimiento tendra dos valores: automatico y manual 
     * @param tipoMovimiento 
     */
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

   public void mover(String direccion, int x, int y){
       
   }

    @Override
    public void cambiarEstado(int estado) {
        super.cambiarEstado(estado); //To change body of generated methods, choose Tools | Templates.
    }
    
}

