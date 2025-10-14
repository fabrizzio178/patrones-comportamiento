package com.state.contextos;

import com.state.strategys.interfaces.IEstrategiaPago;

// Clase que sirve para ejemplificar el patrón Strategy. La usamos como contexto
public class PagoContexto {
    private IEstrategiaPago estrategiaPago;

    public void setEstrategiaPago(IEstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    public void ejecutarPago(double monto){
        if(estrategiaPago != null){
            estrategiaPago.pagar(monto);
        } else {
            System.out.println("Estrategia de pago no definida.");
        }
    }
}
