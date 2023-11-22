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
public class Dama extends Modelo implements Serializable
{

    private String tmodelo;
    private int costo;
    private char pagado;

    public Dama()
    {
    }

    public Dama(String tmodelo, int costo, char pagado, String modelo, int talla, String calzado)
    {
        super(modelo, talla, calzado);
        this.tmodelo = tmodelo;
        this.costo = costo;
        this.pagado = pagado;
    }

    public Dama(String tmodelo, int costo, char pagado)
    {
        this.tmodelo = tmodelo;
        this.costo = costo;
        this.pagado = pagado;
    }

    public char getPagado()
    {
        return pagado;
    }

    public int getCosto()
    {
        return costo;
    }

    public String getTmodelo()
    {
        return tmodelo;
    }

    public void setPagado(char pagado)
    {
        this.pagado = pagado;
    }

    public void setCosto(int costo)
    {
        this.costo = costo;
    }

    public void setTmodelo(String tmodelo)
    {
        this.tmodelo = tmodelo;
    }

    @Override
    public String toString()
    {
        return "\n\tModelo - " + super.toString() + "\n\t\tDepartamento - DAMA" + "\n" + "\t\t" + "- Tipo de modelo: " + tmodelo + "\n\t\t- Costo: " + costo + "\n\t\t- Pagado= " + pagado + "\n\n";
    }

}
