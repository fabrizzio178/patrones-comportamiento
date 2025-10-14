package com.state.states;

import com.state.entities.MaquinaCafe;
import com.state.states.interfaces.IEstadoMaquina;

public abstract class EstadoBase implements IEstadoMaquina {
    protected MaquinaCafe maquinaCafe;

    public EstadoBase(MaquinaCafe maquinaCafe) {
        this.maquinaCafe = maquinaCafe;
    }

    // Declaramos una clase abstracta ya que queremos implementar un método común entre los estados (verificarEnergia)

    protected boolean verificarEnergia(){
        if (!maquinaCafe.tieneEnergia()){
            System.out.println("No hay energia");
            return false;
        } else {
            return true;
        }
    }
}
