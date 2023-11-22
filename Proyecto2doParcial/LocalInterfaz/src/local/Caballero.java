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
public class Caballero extends Modelo implements Serializable
{

    private String tmodelo;
    private String costo;
    private String pagado;

    public Caballero()
    {
    }

    public Caballero(String tmodelo, String costo, String pagado, String modelo, int talla, String calzado)
    {
        super(modelo, talla, calzado);
        this.tmodelo = tmodelo;
        this.costo = costo;
        this.pagado = pagado;
    }

    public Caballero(String tmodelo, String costo, String pagado)
    {
        this.tmodelo = tmodelo;
        this.costo = costo;
        this.pagado = pagado;
    }

    public String getCosto()
    {
        return costo;
    }

    public String getTmodelo()
    {
        return tmodelo;
    }

    public String getPagado()
    {
        return pagado;
    }

    public void setCosto(String costo)
    {
        this.costo= costo;
    }

    public void setTmodelo(String tmodelo)
    {
        this.tmodelo = tmodelo;
    }

    public void setPagado(String pagado)
    {
        this.pagado = pagado;
    }

    @Override
    public String toString()
    {
        return "\n\tModelo - " + super.toString() + "\n\t\tDepartamento - CABALLERO" + "\n" + "\t\t- tipo de modelo: " + tmodelo + "\n\t\t- Costo: " + costo + "\n\t\t- Pagado: " + pagado + "\n\n";
    }

}
