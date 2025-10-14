package com.state.states;

import com.state.entities.MaquinaCafe;

public class EstadoEsperandoMoneda extends EstadoBase{
    public EstadoEsperandoMoneda(MaquinaCafe maquinaCafe){
        super(maquinaCafe); // Hereda de la clase abstracta para obtener el metodo verificarEnergia
    }

    @Override
    public void presionarBoton(){
        if (!verificarEnergia()) return;
        System.out.println("Moneda ingresada, preparando café...");
        maquinaCafe.cambioEstado(new EstadoPreparandoCafe(maquinaCafe)); // Cambia el estado a preparando café
    }
}
