/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diagnostico.dto;

/**
 *
 * @author Hogar
 */
public class CoordenadasDTO {
    private int ejeX;
    private int ejeY;

    public CoordenadasDTO(int ejeX, int ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }
    
}
