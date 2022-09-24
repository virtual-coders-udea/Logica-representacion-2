package hileras;

import javax.swing.JOptionPane;

public class Hilera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "brian gracias por ayudarae ";
        char aCar, opc;
        ListaHileraDoble objHilera1 = new ListaHileraDoble(cadena);
        objHilera1.ListaHileraDoble();
        aCar = objHilera1.MostrarDatos();
        while (aCar !='*')
        {
            System.out.print(aCar);
            aCar = objHilera1.MostrarDatos();
        }
        System.out.println();
        System.out.println ("tiene: " + objHilera1.contarCaracter('a')+"\t a minusculas");
        System.out.println();
        objHilera1.CambiarLetra('a');
        aCar = objHilera1.MostrarDatos();
        while (aCar !='*')
        {
            System.out.print(aCar);
            aCar = objHilera1.MostrarDatos();
        }
        System.out.println();




        System.out.println();
        System.out.println ("tiene: " + objHilera1.contarCaracter('o')+"\t o minusculas");
        objHilera1.eliminarPrimerAparicion('s');
        aCar = objHilera1.MostrarDatos();
        while (aCar !='*')
        {
            System.out.print(aCar);
            aCar = objHilera1.MostrarDatos();
        }

        System.out.println();
        objHilera1.cambiarCaracterPrimeraPalabra('G');
        aCar = objHilera1.MostrarDatos();
        while (aCar !='*')
        {
            System.out.print(aCar);
            aCar = objHilera1.MostrarDatos();
        }
        System.out.println();

        System.out.println();
        objHilera1.cambiarLetraPrimeraPalabra('h');
        aCar = objHilera1.MostrarDatos();
        while (aCar !='*')
        {
            System.out.print(aCar);
            aCar = objHilera1.MostrarDatos();
        }
        System.out.println();


        System.out.println();
        objHilera1.EliminaAes();
        aCar = objHilera1.MostrarDatos();
        while (aCar !='*')
        {
            System.out.print(aCar);
            aCar = objHilera1.MostrarDatos();
        }
        System.out.println();

        objHilera1.ListaHileraDoble();
        aCar = objHilera1.MostrarDatos();
        while (aCar !='*')
        {
            System.out.print(aCar);
            aCar = objHilera1.MostrarDatos();
        }
        System.out.println("   tiene oes: "+objHilera1.contarOes());
        /*
        String cadena = "holaaa Diana esta es la que vamos a trabajar";
        char aCar, opc;
        int i = 0;
        ListaHileraDoble hilera = new ListaHileraDoble(cadena);
         do{
            opc = Menu();
            switch (opc) {
                case '1':
                    cadena = JOptionPane.showInputDialog(null, "Ingrese cadena para crear la hilera", "initial value");
                    break;
                case '2':
                    aCar = hilera.MostrarDatos();
                    while (aCar != '*') {
                        System.out.print(aCar);
                        aCar = hilera.MostrarDatos();
                    }
                    break;
                case '3':
                    /*while (i < cadena.length()) {
                        System.out.println(cadena.charAt(i));
                        hilera.CrearHilera(cadena.charAt(i));
                        i++;
                    }
                    break;
            }
        } while(opc != '5');
    }

    static char Menu()
    {
        char opcion;
        do{
            opcion = JOptionPane.showInputDialog(null, "\n1. Crear o editar hilera\n2. Mostrar hilera\n3. Insertar\n4. Eliminar\n5. Salir").charAt(0);
        } while(opcion < '1' || opcion > '5');

        return opcion;
    }
    }
        */
    }
}
