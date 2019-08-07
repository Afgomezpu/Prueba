/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.ImageIcon;

/**
 *
 * @author 57318
 */
public class Fondo {
    

  private ImageIcon fondo;
    private String ruta;

    public Fondo(String ruta) {
        this.ruta = ruta;
        this.fondo=new ImageIcon(getClass().getResource(this.ruta));
     
    }

    public ImageIcon getFondo() {
        return fondo;
    }

    public void setFondo(ImageIcon fondo) {
        this.fondo = fondo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}