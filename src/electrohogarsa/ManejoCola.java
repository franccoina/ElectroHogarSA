package electrohogarsa;

import javax.swing.JOptionPane;

public class ManejoCola {

//metodo para ingresar elctrodomesticos en la cola
    public Cola IngresarDatos(Cola objC, int tipo) {

        // Si el tipo es 1, es una lavadora
        if (tipo == 1) {
            Lavadoras objElect = new Lavadoras();
            objElect = objElect.IngresarDatos();
            objC.Push(objElect);
        } // Si el tipo es 2, es un refrigerador
        else if (tipo == 2) {
            Refrigeradores objElect = new Refrigeradores();
            objElect = objElect.IngresarDatos();
            objC.Push(objElect);
        }//Fin si-sino

        return objC;  // Regresa la cola con los electrodomésticos añadidos
    }//Fin ingresar datos

//metodo para juntar y retornar en una cadena todo el contenido de la cola
    public String ConcatenarCola(Cola c1, Cola c2) {
        String texto = "";
        Object Dato;

        while (c1.IsEmpty() == false) {
            Dato = c1.Pop();
            texto = texto + Dato.toString() + "\n";
            c2.Push(Dato);
        }//fin mientras

        DevolverCola(c2, c1);
        return texto;
    }//fin de concatenar

    //metodo para devolver la cola a su estado original
    public void DevolverCola(Cola objca, Cola objc) {
        while (objca.IsEmpty() == false) {
            objc.Push(objca.Pop());
        }//fin mientras
    }//fin devolver cola

//calcular el Promedio de precios de los electrodomesticos
    public double PromediarPreciosElectrodomesticos(Cola c1, Cola c2) {
        double promedio;

        promedio = Promediar(AcumularPrecios(c1, c2), ContarElectrodomesticos(c1, c2));

        return promedio;
    }//Fin promediar precios de los electrodomesticos

//metodo que cuenta el numero de electrodomesticos
    public int ContarElectrodomesticos(Cola c1, Cola c2) {
        int con = 0;
        while (c1.IsEmpty() == false) {
            c2.Push(c1.Pop());
            con = con + 1;
        }//fin mientras
        DevolverCola(c2, c1);
        return con;
    }//Fin contar electrodomesticos

//metodo que acumula los precios de los electrodomesticos
    public double AcumularPrecios(Cola c1, Cola c2) {
        double acumP = 0;
        while (c1.IsEmpty() == false) {
            acumP = acumP + ((Electrodomesticos) c1.Peek()).getPrecioUnidad();
            c2.Push(c1.Pop());
        }//fin mientras
        DevolverCola(c2, c1);
        return acumP;
    }//Fin acumular precios

//metodo que obtiene los refrigeradores segun su tipo
    public void RefrisTipoGas(Cola c1, Cola c2) {
        Cola c3 = new Cola(10000);

        while (!c1.IsEmpty()) {
            Refrigeradores refrigerador = (Refrigeradores) c1.Pop();

            // Comprobamos el tipo de energía
            if (refrigerador.getTipoEnergia().equals("GAS")) {
                c2.Push(refrigerador);
            } else {
                c3.Push(refrigerador);
            }
        }

        JOptionPane.showMessageDialog(null, "Los refrigeradores a GAS son: \n" + ConcatenarCola(c2, c1));
        DevolverCola(c2, c3);
        DevolverCola(c3, c1);
    }//Fin obtener refris por tipo
    
    //metodo que obtiene los refrigeradores segun su tipo
    public void RefrisTipoElectrica(Cola c1, Cola c2) {
        Cola c3 = new Cola(10000);
        
        while (!c1.IsEmpty()) {
            Refrigeradores refrigerador = (Refrigeradores) c1.Pop();

            // Comprobamos el tipo de energía
            if (refrigerador.getTipoEnergia().equals("ELECTRICA")) {
                c2.Push(refrigerador);
            } else {
                c3.Push(refrigerador);
            }
        }

        
        JOptionPane.showMessageDialog(null, "Los refrigeradores a ELÉCTRICA son: \n" + ConcatenarCola(c2, c1));
        DevolverCola(c2, c3);
        DevolverCola(c3, c1);
    }//Fin obtener refris por tipo

//retorna el promedio de los datos que le llegan
    public double Promediar(double acum, int con) {
        return acum / con;
    }//Fin promediar

//DATOS DE PRUEBA:
    public Cola LavadorasPrueba(Cola col) {
        col.Push(new Lavadoras("LG", "2203", "Turbo", 250000, 65));
        col.Push(new Lavadoras("LG", "2204", "CalTech", 250000, 60));
        col.Push(new Lavadoras("LG", "2205", "Rocco", 250000, 50));
        col.Push(new Lavadoras("LG", "2206", "MAXpower", 250000, 70));

        return col;
    }

    public Cola RefrigeradoresPrueba(Cola col) {
        col.Push(new Refrigeradores("Haceb", "2206", 270000, "GAS"));
        col.Push(new Refrigeradores("Haceb", "2206", 250000, "GAS"));
        col.Push(new Refrigeradores("Haceb", "2206", 200000, "ELECTRICA"));
        col.Push(new Refrigeradores("Haceb", "2206", 290000, "ELECTRICA"));

        return col;
    }

}//fin clase manejo de cola
