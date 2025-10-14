# Patron State - Máquina de Café

Este proyecto es una implementación en Java del **patrón de diseño State**, utilizando una máquina de café como ejemplo.  
El objetivo es demostrar cómo los diferentes estados de un objeto pueden cambiar su comportamiento sin modificar la clase principal.

---

## Estructura del proyecto
patron-state/
├── src/
│ ├── main/
│ │ ├── java/com/state/entities/
│ │ │ └── MaquinaCafe.java
│ │ ├── java/com/state/states/interfaces/
│ │ │ └── IEstadoMaquina.java
│ │ └── java/com/state/states/
│ │ ├── EstadoEsperandoMoneda.java
│ │ └── EstadoPreparandoCafe.java
├── pom.xml
└── README.md

- **MaquinaCafe.java**: Clase principal que representa la máquina de café.  
- **IEstadoMaquina.java**: Interfaz que define el comportamiento de los estados (`presionarBoton`).  
- **Estados concretos**: Clases que implementan `IEstadoMaquina`, cada una define la respuesta específica al botón según el estado actual de la máquina.

---

## Cómo funciona

1. La máquina mantiene un estado actual (`IEstadoMaquina`).  
2. Cada estado concreto define su comportamiento en `presionarBoton()`.  
3. La máquina puede cambiar de estado mediante el método `cambioEstado()`.  
4. Esto permite que la máquina responda de forma diferente según su estado sin cambiar la clase principal.

---

### Ejemplo de uso

```java
MaquinaCafe maquina = new MaquinaCafe();
maquina.ejecutarCiclo(3); // presiona el botón 3 veces
maquina.cambioEstado(new EstadoPreparandoCafe(maquina));
maquina.ejecutarCiclo(2);

