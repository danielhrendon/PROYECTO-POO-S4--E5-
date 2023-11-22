
package local;

import poo.LecturasA;

public class prbLocal
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String menu[] =
        {
            "Registrar una nueva sucursal", "Agregar un modelo a dama o caballero",
            "Terminar servicio dama o caballero de un calzado en específico por medio del modelo",
            "Cerrar sucursal se elimina todo el renglón que corresponda a la sucursal",
            "Consultar todas las sucrusales y su información", "Consultar toda la información de una sucursal en especifico",
            "Consultar toda la información de los modelo que están en caballero de una sucursal especifica",
            "Consultar toda la información de los modelo que están en dama de una sucursal especifica",
            "Mover modelo entre diferentes sucursales al departamento del que salen al mismo llegan",
            "Buscar un modelo  en todas las sucursales de la tienda", "Salir"
        };

        Array obj = null;
        obj = (Array) Archivos.carga("arch.dat", null); // EN VEZ DE MANIPULA ARCHIVOS
        ManipulaMenu obj2 = new ManipulaMenu();
        int opc;
        int posSucu;

        if (obj == null)
        {
            obj = new Array();
        }

        do
        {
            opc = ManipulaMenu.cabaMenu(menu);

            switch (opc)
            {
                case 1:
                    System.out.println("Agregar nueva sucursal: ");
                    String nuevaSucu = LecturasA.leerCadena();
                    obj.cargaSucursal(nuevaSucu);
                    break;

                case 2:
                    System.out.println("¿A qué departamento desea llevar su modelo?");
                    System.out.println("1. caballero");
                    System.out.println("2. dama");
                    int op = LecturasA.leerEntero();

                    if (op == 1)
                    {
                        System.out.println("Digite la posición de la sucursal: ");
                        posSucu = LecturasA.leerEntero();
                        if (obj2.validaSucursal(posSucu, obj.zapatoServicios.size()) == true)
                        {
                            System.out.println("Tipo de modelo");
                            String fE = LecturasA.leerCadena();
                            System.out.println("Costo: ");
                            String colPref = LecturasA.leerCadena();
                            System.out.println("Pagado: ");
                            String fS = LecturasA.leerCadena();
                            System.out.println("Llene los datos de su modelo...");
                            System.out.println("Modelo: ");
                            String model = LecturasA.leerCadena();
                            System.out.println("talla: ");
                            int an = LecturasA.leerEntero();
                            System.out.println("Tipo de calzado: ");
                            String plac = LecturasA.leerCadena();
                            obj.agregarmodelo(posSucu, new Caballero(fE, colPref, fS, model, an, plac));

                        } else
                        {
                            System.out.println("\t Esa posición de sucursal no está registrada");
                        }
                    } else if (op == 2)
                    {
                        System.out.println("¿Posición de la sucursal?");
                        int posSucu2 = LecturasA.leerEntero();
                        if (obj2.validaSucursal(posSucu2, obj.zapatoServicios.size()) == true)
                        {
                            System.out.println("Tipo de servicio: ");
                            String ser = LecturasA.leerCadena();
                            System.out.println("Costo: ");
                            int pre = LecturasA.leerEntero();
                            System.out.println("¿Está pagado?: S = Sí ó N = No");
                            char paga = LecturasA.leercaracter();
                            System.out.println("Llena los datos de tú modelo...");
                            System.out.println("Modelo: ");
                            String model = LecturasA.leerCadena();
                            System.out.println("talla: ");
                            int anyo = LecturasA.leerEntero();
                            System.out.println("tipo de clazado: ");
                            String plac = LecturasA.leerCadena();
                            obj.agregarmodelo(posSucu2, new Dama(ser, pre, paga, model, anyo, plac));

                        } else
                        {
                            System.out.println("\t Esa posición de sucursal no está registrada");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Está terminando un servicio");
                    System.out.println("Digite Calzado");
                    String pla = LecturasA.leerCadena();
                    break;

                case 4:
                    System.out.println("Digite la posición de la sucursal que desea cerrar: ");
                    int cerrar = LecturasA.leerEntero();
                    obj.cerrarSucursal(cerrar);
                    break;

                case 5:
                    System.out.print(obj.mostrarTodo());
                    break;

                case 6:
                    System.out.println("Digite la posición de la agencia que desea consultar: ");
                    int posA = LecturasA.leerEntero();

                    if (posA < obj.zapatoServicios.size())
                    {
                        System.out.println(obj.consultaAgen(posA));
                    } else
                    {
                        System.out.println("La posición de la sucursal no existe");
                    }
                    break;

                case 7:
                    System.out.println("Digite la posición de la agencia que desea consultar: ");
                    int posP = LecturasA.leerEntero();
                    System.out.println(obj.consPintura(posP));
                    break;

                case 8:
                    System.out.println("Digite la posición de la agencia que desea consultar: ");
                    int posS = LecturasA.leerEntero();
                    System.out.println(obj.consServicio(posS));
                    break;

                case 9:
                    System.out.println("\tMover modelo entre diferentes sucursales");
                    System.out.println("Digite la posición de la sucursal que desea mover: ");
                    int posAnt = LecturasA.leerEntero();
                    System.out.println("Digite la posición de la sucursal a la que desea mover los modelo: ");
                    int posActual = LecturasA.leerEntero();
                    if (posActual < obj.zapatoServicios.size() && posAnt < obj.zapatoServicios.size())
                    {
                        if (posAnt == posActual)
                        {
                            System.out.println("No se puede mover modelo a la misma posición");

                        } else
                        {
                            obj.movermodelo(posAnt, posActual);
                        }
                    } else
                    {
                        System.out.println("La posición de la sucursal no existe");
                    }
                    break;

                case 10:
                    System.out.println("Digite modelo: ");
                    String placa = LecturasA.leerCadena();
                    System.out.println(obj.buscarmodelo(placa));
                    break;

                case 11:
                    break;

                default:
                    System.out.println("Opción incorrecta");

            }

        } while (opc != menu.length);
        Archivos.guarda(obj, "arch.dat", null);

    }

}
