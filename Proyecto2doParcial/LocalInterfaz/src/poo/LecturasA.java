/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Mauro S S
 */
public class LecturasA
{
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);
    
    public static int leerEntero()
    {
        do
        {
            try
            {
                return Integer.parseInt(br.readLine());
            } catch (Exception e)
            {
                System.out.println("Se esperaba un enetero, verifique porfabor");
            }
        } while (true);
    }
    
    public static String leerCadena()
    {
        try
        {
            return br.readLine();
        } catch (Exception e)
        {
            System.out.println("se esperaba una cadena");
            return "";
        }
    }
    
    public static char leercaracter()
    {
        char l = ' ';
        try
        {
            l = (char) br.read();
            String s = br.readLine();
        } catch (Exception ex)
        {
            System.out.println("Error de entrada de datos\nIntenta de nuevo");
        }
        return l;
    }
}
