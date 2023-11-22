/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFrame;
import poo.Mensaje;

/**
 *
 * @author PC
 */
public class Array implements Serializable
{

    public static final long SerialVersionUID = 1L;

    ArrayList<String> sucursales = new ArrayList();
    ArrayList<ArrayList> zapatoServicios = new ArrayList();

    public Array()
    {
    }

    public ArrayList<ArrayList> getAutoServicios()
    {
        return zapatoServicios;
    }

    public ArrayList<String> getSucursales()
    {
        return sucursales;
    }

    public void setmodeloServicios(ArrayList<ArrayList> autoServicios)
    {
        this.zapatoServicios = autoServicios;
    }

    public void setSucursales(ArrayList<String> sucursales)
    {
        this.sucursales = sucursales;
    }

    /**
     * Carga sucursal
     *
     * @param sucu cadena
     */
    public void cargaSucursal(String sucu)
    {
        sucursales.add("Sucursal: " + sucu);
        zapatoServicios.add(new ArrayList());
    }

    public void agregarmodelo(int posArr, Modelo obj)
    {
        if (obj instanceof Caballero)
        {
            zapatoServicios.get(posArr).add(obj);

        } else if (obj instanceof Dama)
        {
            zapatoServicios.get(posArr).add(obj);
        }
    }

    public void terminarmodelo(JFrame jf, String placa)
    {
        int flag = 0;
        for (int i = 0; i < sucursales.size(); i++)
        {
            for (int j = 0; j < zapatoServicios.get(i).size(); j++)
            {
                if (((Modelo) zapatoServicios.get(i).get(j)).getCalzado().equals(placa))
                {
                    zapatoServicios.get(i).remove(j);
                    flag = 1;

                } else
                {
                    flag = 0;

                }
            }
        }

        if (flag == 1)
        {
            Mensaje.exito(jf, "Se ha eliminado el modelo.");
        } else
        {
            Mensaje.error(jf, "No se ha encontrado la modelo.");
        }

    }

    public void cerrarSucursal(int cerrar)
    {
        sucursales.remove(cerrar);

    }

    public String mostrarTodo()
    {
        String s = "";
        for (int i = 0; i < sucursales.size(); i++)
        {
            if (zapatoServicios.get(i) != null)
            {
                s += "\n" + sucursales.get(i).toString() + "\n";
                for (int j = 0; j < zapatoServicios.get(i).size(); j++)
                {
                    s += "\t\t" + zapatoServicios.get(i).get(j).toString() + "\n";
                }
            } else
            {
                s += "No se han registrado modelo \n";
            }
        }
        return s;
    }

    public String consultaAgen(int posA)
    {
        String s = "";
//        for (int i = 0; i < sucursales.size(); i++)
//        {
        s += "\t" + sucursales.get(posA).toString() + "\n";

        for (int j = 0; j < zapatoServicios.get(posA).size(); j++)
        {
            s += "\t\t" + zapatoServicios.get(posA).get(j).toString() + "\n";
        }
//            break;
//        }
        return s;
    }

    public String consPintura(int posP)
    {
        String s = "";

        for (int j = 0; j < zapatoServicios.get(posP).size(); j++)
        {
            if (zapatoServicios.get(posP).get(j) instanceof Caballero)
            {
                s += zapatoServicios.get(posP).get(j).toString();
            }
        }
        return s;
    }

    public String consServicio(int posS)
    {
        String s = "";

        for (int j = 0; j < zapatoServicios.get(posS).size(); j++)
        {
            if (zapatoServicios.get(posS).get(j) instanceof Dama)
            {
                s += zapatoServicios.get(posS).get(j).toString();
            }
        }
        return s;
    }

    public void movermodelo(int posAnt, int posActual)
    {
        for (int i = 0; i < zapatoServicios.get(posAnt).size(); i++)
        {
            zapatoServicios.get(posActual).add(zapatoServicios.get(posAnt).get(i));
        }

        for (int i = 0; i < zapatoServicios.get(posAnt).size(); i++)
        {
            zapatoServicios.get(posAnt).remove(i);
        }
    }

    public String buscarmodelo(String placa)
    {
        String s = " ";
        for (int i = 0; i < sucursales.size(); i++)
        {
            for (int j = 0; j < zapatoServicios.get(i).size(); j++)
            {
                if (((Modelo) zapatoServicios.get(i).get(j)).getCalzado().equals(placa))
                {

                    s += zapatoServicios.get(i).get(j).toString();
                    //System.out.println("Se ha encontrado su auto");
                }
            }
        }
        return s;
    }

}
