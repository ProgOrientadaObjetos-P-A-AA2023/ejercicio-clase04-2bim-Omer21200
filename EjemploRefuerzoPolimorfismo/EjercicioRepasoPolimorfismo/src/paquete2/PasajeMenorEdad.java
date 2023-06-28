/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeMenorEdad extends PasajeUrbano {
     private double pasajeFijo;
    public PasajeMenorEdad(double pasaje){
        super(pasaje);
        pasajeFijo=pasaje;
    }
        
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Menor de edad\n"
                + "%s",
                super.toString());
    }

    @Override
    public void establecerValorPasaje() {
        valorPasaje=pasajeFijo-(pasajeFijo*0.20);
    }
    
}
