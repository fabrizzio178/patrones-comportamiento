package com.state.states;

import com.state.contextos.MaquinaCafe;

public class EstadoEntregandoCafe extends EstadoBase{
    public EstadoEntregandoCafe(MaquinaCafe maquinaCafe){
        super(maquinaCafe);
    }

    @Override
    public void presionarBoton(){
        if (!verificarEnergia()) return;
        System.out.println("Café entregado. Puede preparar otro.");
        maquinaCafe.cambioEstado(new EstadoEsperandoMoneda(maquinaCafe));
    }
    
}
