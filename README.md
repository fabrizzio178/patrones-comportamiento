# 🧩 Patrones de Comportamiento – State, Strategy, Observer e Iterator

Este repositorio contiene implementaciones en Java de varios **patrones de diseño de comportamiento**, entre ellos **State**, **Strategy**, **Observer** e **Iterator**.  
Estos patrones se enfocan en **cómo los objetos interactúan y se comunican entre sí** para lograr comportamientos flexibles, reutilizables y desacoplados.

Cada implementación busca mostrar **la idea esencial del patrón** de forma práctica y sencilla.

---

## 📚 Índice

- [☕ Patrón State – Máquina de Café](#-patrón-state--máquina-de-café)
- [💳 Patrón Strategy – Sistema de Pagos](#-patrón-strategy--sistema-de-pagos)
- [🔔 Patrón Observer – Sistema de Notificaciones](#-patrón-observer--sistema-de-notificaciones)
- [🔁 Patrón Iterator – Recorrido de Colecciones](#-patrón-iterator--recorrido-de-colecciones)
- [🧠 Conclusión](#-conclusión)

---

## ☕ Patrón State – Máquina de Café

El patrón **State** permite que un objeto cambie su comportamiento interno cuando cambia su estado, sin utilizar condicionales ni modificar la clase principal.  
Cada estado se encapsula en una clase distinta, y el contexto (por ejemplo, la máquina de café) delega el comportamiento al estado actual.

### Estructura conceptual

- **Contexto (`MaquinaCafe`)**: mantiene una referencia al estado actual.  
- **Interfaz de estado (`IEstadoMaquina`)**: define las operaciones comunes para todos los estados.  
- **Estados concretos**: implementan la interfaz y definen comportamientos específicos (`EstadoEsperandoMoneda`, `EstadoPreparandoCafe`, etc.).

### Funcionamiento

1. La máquina tiene un atributo `estadoActual` que implementa `IEstadoMaquina`.  
2. Al ejecutar `presionarBoton()`, delega la acción al estado actual.  
3. Cada estado puede cambiar el estado de la máquina usando `cambioEstado()`.  
4. El comportamiento varía dinámicamente según el estado sin usar `if` o `switch`.

---

## 💳 Patrón Strategy – Sistema de Pagos

El patrón **Strategy** permite definir una familia de algoritmos intercambiables y encapsularlos en clases independientes.  
El contexto utiliza una referencia a una estrategia concreta, que puede cambiarse dinámicamente en tiempo de ejecución.

### Estructura conceptual

- **Interfaz (`EstrategiaPago`)**: define el método común `pagar(double monto)`.  
- **Estrategias concretas**: distintas formas de pago (`PagoConTarjeta`, `PagoConEfectivo`).  
- **Contexto (`PagoContexto`)**: delega la ejecución del pago a la estrategia activa.

### Funcionamiento

1. El contexto define una referencia `EstrategiaPago estrategia`.  
2. Se configura la estrategia deseada con `setEstrategia()`.  
3. El método `ejecutarPago()` llama internamente a `estrategia.pagar(monto)`.  
4. Se puede cambiar el comportamiento sin modificar el contexto ni usar condicionales.

---

## 🔔 Patrón Observer – Sistema de Notificaciones

El patrón **Observer** (u "Observador") establece una relación **uno-a-muchos** entre objetos:  
cuando un objeto cambia de estado (el *sujeto*), **notifica automáticamente a todos sus observadores**.

Este patrón se usa en sistemas de eventos, interfaces gráficas y mecanismos *publish-subscribe*.

### Estructura conceptual

- **Sujeto (`SujetoConcreto`)**: mantiene una lista de observadores y los notifica cuando ocurre un cambio.  
- **Interfaz de observador (`Observador`)**: define el método `actualizar()`.  
- **Observadores concretos**: reaccionan de distintas formas ante los cambios del sujeto (`ObservadorEmail`, `ObservadorSMS`, etc.).

### Funcionamiento

1. Los observadores se **suscriben** al sujeto.  
2. Cuando el sujeto cambia de estado (por ejemplo, un nuevo evento), llama a `notificarObservadores()`.  
3. Todos los observadores reciben la actualización automáticamente.  
4. Se pueden agregar o quitar observadores sin modificar el sujeto.

### Ejemplo típico

Una **notificación de sistema de pedidos**:  
cada vez que se crea un pedido nuevo, el sistema notifica al módulo de facturación, al módulo de stock y al cliente.

---

## 🔁 Patrón Iterator – Recorrido de Colecciones

El patrón **Iterator** permite recorrer una colección sin exponer su estructura interna.  
Define una interfaz estándar para acceder secuencialmente a los elementos de una colección, ya sea hacia adelante, hacia atrás o en un orden particular.

### Estructura conceptual

- **Interfaz (`NombresIterator`)**: define los métodos `hasNext()` y `getNext()`.  
- **Colección (`NombresCollection`)**: guarda los elementos y crea los iteradores.  
- **Iteradores concretos**: implementan distintas formas de recorrido (`NombresIteratorNormal`, `NombresIteratorInverso`).  

### Funcionamiento

1. El cliente solicita un iterador a la colección (`crearIterador()` o `crearIteradorInverso()`).  
2. El iterador se encarga de recorrer los elementos sin que el cliente conozca su estructura interna.  
3. El recorrido puede modificarse fácilmente creando un nuevo tipo de iterador.  

### Ejemplo típico

Una **lista de nombres** que puede recorrerse normalmente o en orden inverso, sin cambiar el código del cliente.

---

## 🧠 Conclusión

Todos estos patrones promueven los mismos principios:

- **Composición sobre herencia.**  
- **Desacoplamiento entre objetos.**  
- **Código extensible sin modificar lo existente.**  
- **Facilidad de mantenimiento y pruebas.**

#### Próximos patrones a implementar

- **Command (Comando)**  
- **Template Method (Método Plantilla)**  
- **Mediator (Mediador)**  
- **Memento (Recuerdo)**  
