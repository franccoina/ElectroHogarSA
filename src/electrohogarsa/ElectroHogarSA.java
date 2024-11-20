/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
---------------------------------- ASIGNATURA ----------------------------------

 * 650506006-3 ESTRUCTURA DE DATOS Y LABORATORIO VIRTUAL
 * MORELA DEL SOCORRO MONCADA GONZÁLEZ
 * 07 DE SEPTIEMBRE DEL 2024

---------------------------------- ENUNCIADO ----------------------------------- 

 *   La tienda de electrodomésticos “ELECTROHOGAR S.A.” ofrece una variedad de productos 
      para el hogar, incluyendo lavadoras y refrigeradores. Por cada lavadora, se tiene: 
       número de serie, marca, modelo, precio unitario y capacidad de carga en kilos. Por cada 
        refrigerador, se tiene: número de serie, marca, precio unitario y tipo de energía (eléctrica o gas).

 * Se requiere:
    
    - Promedio de precios de las lavadoras.
    - ¿Cuántos y cuáles de los refrigeradores son a gas?
    - Promedio de precios de los refrigeradores.

---------------------------------- INTEGRANTES EQUIPO 3 ------------------------

 * BLANDÓN MENA DAVID FRANCISCO

 */
package electrohogarsa;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class ElectroHogarSA {

    /**
     * @param args the command line arguments
     */
    //---------------------------------- MAIN ----------------------------------
    public static void main(String[] args) {
        // TODO code application logic here 
        ElectroHogarSA objElect = new ElectroHogarSA();
        
        ManejoCola objManCol = new ManejoCola();

        //Colas para nuestros tipos de electrodomesticos
        Cola objCR = new Cola(10000);
        Cola objCL = new Cola(10000);

        //Cola auxiliar para metodos
        Cola objCa = new Cola(10000);

        int opcion;

        //Menu switch con opciones para que el usuario elija que acción ejecutar
        opcion = Validaciones.leerOpcionesMenu(objElect.MenuPpal(), 7);

        do {
            switch (opcion) {
                case 1:
                    objCL = objManCol.IngresarDatos(objCL, 1);
                    break;
                case 2:
                    objCR = objManCol.IngresarDatos(objCR, 2);
                    break;
                case 3:
                    objManCol.RefrisTipoElectrica(objCR, objCa);
                    
                    objManCol.RefrisTipoGas(objCR, objCa);
                    break;
                case 4:
                    if (objCL.IsEmpty() == false) {
                        JOptionPane.showMessageDialog(null, "El promedio de precios de lavadoras es: \n" + objManCol.PromediarPreciosElectrodomesticos(objCL, objCa));
                    } else {
                        JOptionPane.showMessageDialog(null, "La cola de lavadoras esta vacia.");
                    }
                    
                    if (objCR.IsEmpty() == false) {
                        JOptionPane.showMessageDialog(null, "El promedio de precios de refrigeradores es: \n" + objManCol.PromediarPreciosElectrodomesticos(objCR, objCa));
                    } else {
                        JOptionPane.showMessageDialog(null, "La cola de refrigeradores esta vacia.");
                    }
                    break;
                case 5:
                    if (objCL.IsEmpty() == false) {
                        JOptionPane.showMessageDialog(null, "La cola de lavadoras es: \n" + objManCol.ConcatenarCola(objCL, objCa));
                    } else {
                        JOptionPane.showMessageDialog(null, "La cola de lavadoras esta vacia.");
                    }
                    break;
                case 6:
                    if (objCR.IsEmpty() == false) {
                        JOptionPane.showMessageDialog(null, "La cola de refrigeradores es: \n" + objManCol.ConcatenarCola(objCR, objCa));
                    } else {
                        JOptionPane.showMessageDialog(null, "La cola de refrigeradores esta vacia.");
                    }
                    break;
                case 7:
                    objCL = objManCol.LavadorasPrueba(objCL);
                    JOptionPane.showMessageDialog(null, "Se copiaron datos de prueba a cola de lavadoras.");
                    
                    objCR = objManCol.RefrigeradoresPrueba(objCR);
                    JOptionPane.showMessageDialog(null, "Se copiaron datos de prueba a cola de refrigeradores.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }

            // Actualizamos la opción para permitir que el ciclo pueda terminar correctamente.
            opcion = Validaciones.leerOpcionesMenu(objElect.MenuPpal(), 7);

        } while (opcion < 8);  // El ciclo continuará hasta que el usuario elija salir (opción >= 7)
    }

    // Método para mostrar el menú
    public String MenuPpal() {
        return "Menu Principal\n"
                + "1. Agregar una lavadora.\n"
                + "2. Agregar un refrigerador.\n"
                + "3. Mostrar refrigeradores agrupados por Tipo de Energía.\n"
                + "4. Mostrar promedios de precios de cada tipo de electrodoméstico.\n"
                + "5. Mostrar cola de lavadoras.\n"
                + "6. Mostrar cola de refrigeradores.\n"
                + "7. Agregar datos de prueba a colas.\n"
                + "8. Salir\n";
    }
}
