package com.state;

import com.state.contextos.MaquinaCafe;
import com.state.contextos.PagoContexto;
import com.state.iterator.NombresCollection;
import com.state.iterator.interfaces.NombresIterator;
import com.state.observer.DisplayConcreto;
import com.state.observer.WeatherSujeto;
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

        // Ejemplo de patrón Observer
        System.out.println("\n=== Ejemplo Patrón Observer ===");
        WeatherSujeto sujeto = new WeatherSujeto();
        DisplayConcreto phoneApp = new DisplayConcreto("App móvil");
        DisplayConcreto webApp = new DisplayConcreto("Panel web");

        sujeto.suscribir(phoneApp); // Suscribimos los observadores, en este ejemplo, tenemos aplicacion movil y web
        sujeto.suscribir(webApp);

        sujeto.setTemperature(25.0); // Cambiamos la temperatura, lo que notifica a los observadores
        sujeto.setTemperature(30.5);

        // Ejemplo de patrón Iterator
        System.out.println("\n=== Ejemplo Patrón Iterator ===");
        // Recorrido normal:
        NombresCollection coleccion = new NombresCollection();
        coleccion.agregar("Fabrizzio");
        coleccion.agregar("Ana");
        coleccion.agregar("Luis");
        System.out.println("\nRecorrido Normal:");
        NombresIterator iterador = coleccion.crearIterator();
        while(iterador.hasNext()){
            System.out.println(iterador.getNext());
        }

        // Recorrido inverso:
        System.out.println("\nRecorrido Inverso:");
        NombresIterator iteradorInverso = coleccion.crearIteradorInverso();
        while(iteradorInverso.hasNext()){
            System.out.println(iteradorInverso.getNext());
        }
    }
}
