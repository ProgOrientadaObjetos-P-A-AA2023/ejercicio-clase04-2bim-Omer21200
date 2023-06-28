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
public class PasajeNormal extends PasajeUrbano {
     private double pasajeFijo;
    public PasajeNormal(double pasaje){
        super(pasaje);
        pasajeFijo=pasaje;
    }
    
    
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Normal\n"
                + "%s",
                super.toString()
                );
    }

    @Override
    public void establecerValorPasaje() {
        valorPasaje=pasajeFijo;
    }
}
