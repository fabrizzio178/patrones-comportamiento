package com.state.strategys;

import com.state.strategys.interfaces.IEstrategiaPago;

public class PagoConTarjeta implements IEstrategiaPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con tarjeta.");
    }
}
