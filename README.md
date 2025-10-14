# Patrones de Comportamiento – State y Strategy

Este repositorio contiene implementaciones en Java de dos patrones de diseño de comportamiento:
State y Strategy.

Ambos patrones buscan modificar el comportamiento de un objeto en tiempo de ejecución, pero lo hacen con propósitos distintos.
El objetivo de este proyecto es entender cómo aplicarlos de manera práctica mediante ejemplos simples y comparables.

## ☕ Patrón State – Máquina de Café

El patrón State permite que un objeto cambie su comportamiento interno cuando cambia su estado, sin utilizar condicionales ni modificar la clase principal.
Cada estado se encapsula en una clase distinta, y el contexto (por ejemplo, la máquina de café) delega el comportamiento al estado actual.

#### Estructura conceptual

Contexto (MaquinaCafe): mantiene una referencia al estado actual.
Interfaz de estado (IEstadoMaquina): define las operaciones comunes para todos los estados.
Estados concretos: implementan la interfaz y definen comportamientos específicos (por ejemplo, EstadoEsperandoMoneda, EstadoPreparandoCafe).

#### Funcionamiento:

1-La máquina tiene un atributo estadoActual que implementa IEstadoMaquina.

2-Al ejecutar presionarBoton(), delega la acción al estado actual.

3-Cada estado puede cambiar el estado de la máquina usando cambioEstado().

4-De este modo, el comportamiento varía dinámicamente según el estado sin usar if o switch.

## 💳 Patrón Strategy – Sistema de Pagos

El patrón Strategy permite definir una familia de algoritmos intercambiables y encapsularlos en clases independientes.
El contexto utiliza una referencia a una estrategia concreta, que puede cambiarse dinámicamente en tiempo de ejecución.

#### Estructura conceptual

Interfaz (EstrategiaPago): define el método común pagar(double monto).
Estrategias concretas: distintas formas de pago, como PagoConTarjeta o PagoConEfectivo.
Contexto (PagoContexto): delega la ejecución del pago a la estrategia activa.

#### Funcionamiento:

1-El contexto define una referencia EstrategiaPago estrategia.

2-Se configura la estrategia deseada con setEstrategia().

3-El método ejecutarPago() llama internamente a estrategia.pagar(monto).

4-Así, se puede cambiar el comportamiento sin modificar el contexto ni usar condicionales.

## Conclusión
Ambos patrones promueven:
Composición sobre herencia.
Código flexible y extensible.
Eliminación de condicionales repetitivos.

#### Este repositorio servirá como base para ampliar con otros patrones de comportamiento como:

Observer (Publish–Subscribe)
Iterator
Adapter