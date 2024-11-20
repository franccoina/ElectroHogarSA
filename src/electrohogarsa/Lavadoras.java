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

/**
 *
 * @author franc
 */
public class Lavadoras extends Electrodomesticos {
    private String Modelo;
    private double CapacidadCargaKg;
    
    //Constructor Vacío
    public Lavadoras() {
    }
    
    // Constructor
    public Lavadoras(String Marca, String NroSerie, String Modelo, double PrecioUnidad, double CapacidadCargaKg) {
        super(Marca, NroSerie, PrecioUnidad);
        this.Modelo = Modelo;
        this.CapacidadCargaKg = CapacidadCargaKg;
    }

    // Getters y Setters
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public double getCapacidadCargaKg() {
        return CapacidadCargaKg;
    }

    public void setCapacidadCargaKg(double CapacidadCargaKg) {
        this.CapacidadCargaKg = CapacidadCargaKg;
    }
    
    public Lavadoras IngresarDatos()
    {
    //variables auxiliares y locales
      String  Mar, NoSer, Mod;
      double Pre, CapKg;
      
      Mar=Validaciones.leerString("Ingrese marca de la lavadora: ");  
      NoSer=Validaciones.leerString("Ingrese Número de Serie de la lavadora: "); 
      Mod=Validaciones.leerString("Ingrese modelo de la lavadora: ");
      Pre=Validaciones.leerReal("Ingrese precio de la lavadora: ");
      CapKg=Validaciones.leerReal("Ingrese capacidad de la lavadora (kg): ");
      
      Lavadoras objLav=new Lavadoras(Mar, NoSer, Mod, Pre, CapKg);
      return objLav;
    }
    
    //Método toString()
    @Override
    public String toString() {
        return "Lavadora { Marca = " + super.Marca + ", Modelo = " + Modelo + ", NroSerie = " + super.NroSerie + ", PrecioUnidad = " + super.PrecioUnidad + ", CapacidadCargaKg = " + CapacidadCargaKg + '}';
    };
     
}//fin de clase lavadoras
