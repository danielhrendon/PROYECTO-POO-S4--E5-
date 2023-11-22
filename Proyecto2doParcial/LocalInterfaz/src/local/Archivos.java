/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import poo.Mensaje;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Archivos
{

    public static void guarda(Object obj[], JFrame jf)
    {
        // FileOutputStream fos = new FileOutputStream(c:/doctos/usu/arch.dat);
//        FileOutputStream fos = new FileOutputStream(arch.dat);
//        FileOutputStream fos = new FileOutputStream(/../datos/arch.dat);
        try
        {
            FileOutputStream fos = new FileOutputStream("arch.dat");
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf, "No encontre el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf, "ERROR..." + ex.toString());
        }
    }

    public static Object[] carga(JFrame jf)
    {
        // FileOutputStream fos = new FileOutputStream(c:/doctos/usu/arch.dat);
//        FileOutputStream fos = new FileOutputStream(arch.dat);
//        FileOutputStream fos = new FileOutputStream(/../datos/arch.dat);
        Object obj[] = null;
        try
        {
            FileInputStream fos = new FileInputStream("arch.dat");
            ObjectInputStream arch = new ObjectInputStream(fos);
            obj = (Object[]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf, "No encontre el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf, "ERROR..." + ex.toString());
        }
        return obj;
    }

    public static void guarda(Object obj, String trayectoria, JFrame jf)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(trayectoria);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (FileNotFoundException ex)
            {
                Mensaje.error(jf, "No encontre el archivo");
            } catch (Exception ex)
            {
                Mensaje.error(jf, "ERROR..." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf, "ERROR... No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf, "ERROR..." + ex.toString());
        }

    }

    public static Object[] carga(String trayectoria, boolean b, JFrame jf)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fos = new FileInputStream(trayectoria);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fos);
                obj = (Object[]) arch.readObject();
                arch.close();
            } catch (FileNotFoundException ex)
            {
                Mensaje.error(jf, "No encontre el archivo");
            } catch (Exception ex)
            {
                Mensaje.error(jf, "ERROR..." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf, "ERROR... No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf, "ERROR..." + ex.toString());
        }
        return obj;
    }

    public static void guarda(Object obj, String trayectoria)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(trayectoria);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error.. de entrada salida");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("ERROR... No se encontro el archivo");
        } catch (Exception ex)
        {
            System.out.println("ERROR..." + ex.toString());
        }
    }

    public static Object carga(String trayectoria)
    {
        Object obj = null;
        try
        {
            FileInputStream fos = new FileInputStream(trayectoria);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fos);
                obj = arch.readObject();
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error.. de entrada salida FFFFF");
            } catch (Exception ex)
            {
                System.out.println("EROOR.." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("ERROR... No se encontro el archivo");
        } catch (Exception ex)
        {
            System.out.println("ERROR..." + ex.toString());
        }
        return obj;
    }

    public static Object carga(String trayectoria, JFrame jf)
    {
        Object obj = null;
        try
        {
            FileInputStream fos = new FileInputStream(trayectoria);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fos);
                obj = arch.readObject();
                arch.close();
            } catch (IOException ex)
            {
                Mensaje.error(jf, "Error.. de entrada salida FFFFF");
            } catch (Exception ex)
            {
                Mensaje.error(jf, "EROOR.." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("ERROR... No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf, "ERROR..." + ex.toString());
        }
        return obj;
    }
}
