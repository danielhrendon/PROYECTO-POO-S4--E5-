/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.io.Serializable;
import poo.LecturasA;

/**
 *
 * @author Lenovo
 */
public class ManipulaMenu implements Serializable
{

    public static int cabaMenu(String mnu[])
    {
        System.out.println("\n\n\n\n..........MENU..........");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i + 1) + ".-" + mnu[i]);
        }
        System.out.print("Elige una opcion:  ");
        return LecturasA.leerEntero();
    }

    public boolean validaSucursal(int posDigi, int x)
    {
        if (posDigi >= 0 && posDigi < x)
        {
            return true;
        } else
        {
            System.out.println("Por favor revisa que esté bien escrito la sucursal");
            return false;
        }
    }
}
