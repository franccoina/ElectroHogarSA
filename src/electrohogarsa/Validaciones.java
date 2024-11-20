
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
--------------------- ASIGNATURA ---------------------

 * 650506006-3 ESTRUCTURA DE DATOS Y LABORATORIO VIRTUAL
 * MORELA DEL SOCORRO MONCADA GONZÁLEZ
 * 07 DE SEPTIEMBRE DEL 2024

--------------------- ENUNCIADO --------------------- 

 *   La tienda de electrodomésticos “ELECTROHOGAR S.A.” ofrece una variedad de productos 
      para el hogar, incluyendo lavadoras y refrigeradores. Por cada lavadora, se tiene: 
       número de serie, marca, modelo, precio unitario y capacidad de carga en kilos. Por cada 
        refrigerador, se tiene: número de serie, marca, precio unitario y tipo de energía (eléctrica o gas).

 * Se requiere:
    
    - Promedio de precios de las lavadoras.
    - ¿Cuántos y cuáles de los refrigeradores son a gas?
    - Promedio de precios de los refrigeradores.

--------------------- INTEGRANTES EQUIPO 3 ---------------------

 * BLANDÓN MENA DAVID FRANCISCO

 */

package electrohogarsa;

import javax.swing.JOptionPane;

public class Validaciones {
    
     /*este metodo retorna un entero entre 1 y el tope que recibe
    y valida ademas que no lo dejen en blanco y que no le ingresen letras*/
        
    public static int leerOpcionesMenu(String mensaje,int tope)
    {
        int op=0;
    do{//ciclo para validar la opcion del menu
            try{    
            op=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            if(op<=0||op>tope)
               JOptionPane.showMessageDialog(null,"Debe ingresar un número de 1 a "+tope);  
            }catch(Exception er)  
                    {
                    JOptionPane.showMessageDialog(null,"Error debe digitar numeros de 1 a "+tope+" NO letras");
                    }
            }while(op<=0||op>tope);//fin del ciclo de validacion
    return op;
    }
    
    
    	//Metodo para leer numeros enteros
	public static int leerEntero(String mensaje)
	{
		int num = 0;
                do{
		try
		{
	      	    
                    num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                    if(num<=0)
                        JOptionPane.showMessageDialog(null,"ERROR, el Numero debe ser mayor que cero");
                       
                }
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null,"ERROR - OJO la Excepcion es: " + e);
		}
                 }while(num<=0);
		return num;
	}

	//Metodo para leer numeros reales
	public static double leerReal(String mensaje)
	{
		double num = 0;
                do{
		try
		{
	      	    
                    num = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                    if(num<=0)
                        JOptionPane.showMessageDialog(null,"ERROR, el Numero debe ser mayor que cero");
                       
                }
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null,"ERROR - OJO la Excepcion es: " + e);
		}
                 }while(num<=0);
		return num;
	}
        //Metodo para leer cadenas de texto
	public static String leerString(String mensaje)
	{
		String cadena= "";
                do{
		try
		{
	      	    
                    cadena = JOptionPane.showInputDialog(mensaje);
                    if(cadena.equals(""))
                        JOptionPane.showMessageDialog(null,"ERROR, NO debe dejarla en blanco, \n¡DEBE ingresar informacion!");
                       
                }
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null,"ERROR - OJO la Excepcion es: " + e);
		}
                 }while(cadena.equals(""));
		return cadena;
	}
    
        
        
}
