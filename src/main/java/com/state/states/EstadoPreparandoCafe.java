package com.state.states;

import com.state.entities.MaquinaCafe;

public class EstadoPreparandoCafe extends EstadoBase{
    public EstadoPreparandoCafe(MaquinaCafe maquinaCafe){
        super(maquinaCafe);
    }

    @Override
    public void presionarBoton(){
        if (!verificarEnergia()) return;
        System.out.println("Café listo. Entregando...");
        maquinaCafe.cambioEstado(new EstadoEntregandoCafe(maquinaCafe));
    }
    
}
