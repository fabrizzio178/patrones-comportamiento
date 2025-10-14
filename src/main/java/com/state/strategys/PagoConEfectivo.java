package com.state.strategys;

import com.state.strategys.interfaces.IEstrategiaPago;

public class PagoConEfectivo implements IEstrategiaPago{
    @Override
    public void pagar(double monto){
        System.out.println("Pagando " + monto + " con efectivo.");
    }
}
