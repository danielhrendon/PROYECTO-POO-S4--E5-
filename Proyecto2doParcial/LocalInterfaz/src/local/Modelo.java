/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Modelo implements Serializable
{

    private String modelo;
    private int talla;
    private String calzado;

    public Modelo()
    {
    }

    public Modelo(String modelo, int talla, String calzado)
    {
        this.modelo = modelo;
        this.talla = talla;
        this.calzado = calzado;
    }

    public int getTalla()
    {
        return talla;
    }

    public String getModelo()
    {
        return modelo;
    }

    public String getCalzado()
    {
        return calzado;
    }

    public void setTalla(int talla)
    {
        this.talla = talla;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setCalzado(String calzado)
    {
        this.calzado = calzado;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return " (Modelo: " + modelo + "/  talla: " + talla + "/  tipo de calzado: " + calzado + ")" + "\n";
    }

}
