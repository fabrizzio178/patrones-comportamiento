package com.state.iterator;

import java.util.ArrayList;
import java.util.List;

import com.state.iterator.interfaces.NombresIterator;

public class NombresCollection {
    private List<String> nombres = new ArrayList<>();

    public void agregar(String nombre){
        nombres.add(nombre);
    }

    public NombresIterator crearIterator() {
        return new NombresIteratorConcreto(nombres);
    }

    public NombresIterator crearIteradorInverso(){
        return new NombresIteratorInverso(nombres);
    }

    private static class NombresIteratorConcreto implements NombresIterator {
        private final List<String> nombres;
        private int posicionActual = 0;

        public NombresIteratorConcreto(List<String> nombres) {
            this.nombres = nombres;
        }

        @Override
        public boolean hasNext() {
            return posicionActual < nombres.size();
        }

        @Override
        public String getNext() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("No hay más elementos en la colección.");
            }
            return nombres.get(posicionActual++);
        }
    }

    private static class NombresIteratorInverso implements NombresIterator {
        private final List<String> nombres;
        private int posicionActual;

        public NombresIteratorInverso(List<String> nombres) {
            this.nombres = nombres;
            this.posicionActual = nombres.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return posicionActual >= 0;
        }

        @Override
        public String getNext() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("No hay más elementos en la colección.");
            }
            return nombres.get(posicionActual--);
        }
    }
}
