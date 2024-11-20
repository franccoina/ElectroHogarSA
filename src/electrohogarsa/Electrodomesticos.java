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
public class Electrodomesticos {
    protected String Marca;
    protected String NroSerie;
    protected double PrecioUnidad;

    // Constructor Vacío
    public Electrodomesticos() {
    }
    
    // Constructor
    public Electrodomesticos(String Marca, String NroSerie, double PrecioUnidad) {
        this.Marca = Marca;
        this.NroSerie = NroSerie;
        this.PrecioUnidad = PrecioUnidad;
    }

    // Getters y Setters
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getNroSerie() {
        return NroSerie;
    }

    public void setNroSerie(String NroSerie) {
        this.NroSerie = NroSerie;
    }

    public double getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(double PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }
    
    //Método toString()
    @Override
    public String toString() {
        return "Electrodomesticos { " + "\n\tMarca = " + Marca + "\n\tNroSerie = " + NroSerie + "\n\tPrecioUnidad = " + PrecioUnidad + '}';
    }
    
}
