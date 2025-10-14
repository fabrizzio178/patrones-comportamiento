package com.state.contextos;

import com.state.states.EstadoEsperandoMoneda;
import com.state.states.interfaces.IEstadoMaquina;

// Clase que sirve para ejemplificar el patrón State. La usamos como contexto
public class MaquinaCafe {
    private IEstadoMaquina estadoActual;
    private boolean tieneEnergia = true;

    public MaquinaCafe() {
        estadoActual = new EstadoEsperandoMoneda(this); // Inicializamos la máquina en el estado esperando moneda
        // En tiempo de ejecución apunta a una instancia concreta, en este caso EstadoEsperandoMoneda
    }

    public void cambioEstado(IEstadoMaquina nuevoEstado){
        this.estadoActual = nuevoEstado; // Recibimos el nuevo estado de la máquina
        // La maquina sigue usando la misma interfaz, pero el comportamiento cambia según la clase concreta que tenga en ese momento
    }

    public void presionarBoton(){
        estadoActual.presionarBoton();
    }

    public boolean tieneEnergia() {
        return this.tieneEnergia;
    }

    public void cortarEnergia() {
        this.tieneEnergia = false;
    }

    public void ejecutarCiclo(int pasos){
        for(int i=0; i<pasos; i++){
            presionarBoton();
        }
    }
}
