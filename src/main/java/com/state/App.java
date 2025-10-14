package com.state;

import com.state.contextos.MaquinaCafe;
import com.state.contextos.PagoContexto;
import com.state.strategys.PagoConEfectivo;
import com.state.strategys.PagoConTarjeta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Ejemplo de patrón State
        System.out.println("=== Ejemplo Patrón State ===");
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.ejecutarCiclo(3);

        // Ejemplo de patrón Strategy
        System.out.println("\n=== Ejemplo Patrón Strategy ===");
        PagoContexto pago = new PagoContexto();
        pago.setEstrategiaPago(new PagoConTarjeta());
        pago.ejecutarPago(100);

        pago.setEstrategiaPago(new PagoConEfectivo());
        pago.ejecutarPago(200);
    }
}
