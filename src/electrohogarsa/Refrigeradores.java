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
public class Refrigeradores extends Electrodomesticos {
    private String TipoEnergia;
    
    // Constructor Vacío
    public Refrigeradores() {
    }
    
    // Constructor
    public Refrigeradores(String Marca, String NroSerie, double PrecioUnidad, String TipoEnergia) {
        super(Marca, NroSerie, PrecioUnidad);
        this.TipoEnergia = TipoEnergia;
    }

    // Getters y Setters
    public String getTipoEnergia() {
        return TipoEnergia;
    }

    public void setTipoEnergia(String TipoEnergia) {
        this.TipoEnergia = TipoEnergia;
    }
    
    public Refrigeradores IngresarDatos()
    {
    //variables auxiliares y locales
      String  Mar, NoSer, Energ;
      double Pre;
      
      Mar=Validaciones.leerString("Ingrese marca del refrigerador: ");  
      NoSer=Validaciones.leerString("Ingrese Número de Serie del refrigerador: "); 
      Pre=Validaciones.leerReal("Ingrese precio del refrigerador: ");
      Energ=Validaciones.leerString("Ingrese energía del refrigerador sin tildes (GAS o ELECTRICA): ").toUpperCase();
      
      Refrigeradores objRef=new Refrigeradores(Mar, NoSer, Pre, Energ);
      return objRef;
    }
    
    //Método toString()
    @Override
    public String toString() {
        return "Refrigerador { Marca = " + super.Marca + ", NroSerie = " + super.NroSerie + ", PrecioUnidad = " + super.PrecioUnidad + ", TipoEnergia = " + TipoEnergia + '}';
    }
     
}//fin de clase refrigeradores
