# GRAFO DE EULER

## 👩🏻‍💻 Datos del Estudiante: 
_**Nombre completo:** Esther Romero Aguilar_

_**Carrera:** Ingeniera Informática_

---

# Implementación sobre algún concepto de teoría de grafos


_Elaboración de la estructura, métodos y atributos de un Grafo de Euler_

## 1) Conceptos básicos 📖

_Teoría de conceptos basicos y consideraciones que se tomaron en cuenta al momento de la implementación._

### 📌Grafo de Euler 

_**Grafos dirigidos/no dirigido:** Se considera un grafo simple de Euler, cuando no se tiene bucles y cumple con alguno de los dos corolarios._

_**Corolario 1:** Si G es un grafo euleriano, entonces todos sus vértices tienen grado par._

_**Corolario 2:** Si G es un grafo que posee un camino euleriano, entonces o bien todos los vértices tienen grado par o bien
exactamente dos de los vértices tienen grado impar._

<p align="center"><img width="500" src="https://pbs.twimg.com/media/EiLvBH8X0AAzOZe.jpg" alt="Imagen Grafo Completo"></p>


## 2) Explicación de Clases 📖

_Se cuenta con tres clases: Clase Main, Clase GrafoEuler y Clase Arista_


<p align="center"><img width="350" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Clase%20GrafoEuler.png" alt="Imagen Clase GrafoEuler"></p>

_**Clase Main:** Es nuestra clase principal, por donde hacemos correr todos los metodos implementados en nuestra clase GrafoEuler._

_**Clase GrafoEuler:** Esta clase se encarga de la verificación de un Grafo de Euler._

_A su vez, se utilizo listas de adyacencia para la representacion de los grafos._

```
public class GrafoEuler {
    private ArrayList<Arista>[] adj;
    private int recoEu[];
    private int nodo;
    private int numEdges;
}    
```

_**Clase Arista:** Se encarga de representar una arista, teniendo dos atributos principales, el destino y si fue visitado._

```
public class Arista{
        private int destino;
        private boolean visitado;
}        
```

## 3) Explicación de métodos y su tipo de retorno 🚀

_El Grafo de Euler contiene 3 métodos, mostrando las capacidades básicas que puede realizar un Grafo de Euler._

### addEdge(int o, int d) 📋

_Agrega aristas a un grafo_

```
@param int -> origen del vertice (o)
@param int -> destino del vertice (d)
@return void - sin valor de retorno
```

### corolarios() 📋

_Verifica si un grafo cumple con alguno de los dos corolarios._

```
@param  No necesita parametros
@return void - sin valor de retorno
```

### recorrido(int v, int destino, Arista arista) 📋

_Recorre todo el grafo bajo el algoritmo DFS recursivo, buscando un ciclo o camino de Euler._

_Imprime todos los resultados que encuentra, tomando cada vertice como punto de partida._

```
@param int -> origen del vertice (v)
@param int -> destino del vertice (destino)
@param Arista -> ultimá arista visitada (arista)
@return void - sin valor de retorno
```

## 4) Ejecutando Pruebas - DEMO ⚙️
  
- **`Grafo 1:`**

    | Estructura       |
    | ----------------- |
    | <p align="center"><img width="400" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Grafo%201.png" alt="Imagen Grafo 1"></p> |
    | Resultado        |
    | <p align="center"><img width="500" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G1%20VS.png" alt="Imagen Resultado Grafo 1 VS"></p> |
    
    | Camino Euler1     | Camino Euler2                       |
    | -------- | --------------------------------- |
    | <p align="center"><img width="250" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultados%20G1.png" alt="Imagen Resultado Grafo 1"></p>   | <p align="center"><img width="250" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultados%20G1%20(P2).png" alt="Imagen Resultado Grafo 1 P2"></p>                               | 

- **`Grafo 2:`**

    | Estructura       |
    | ----------------- |
    | <p align="center"><img width="500" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Grafo%202.png" alt="Imagen Grafo 2"></p> |
    | Resultado        |
    | <p align="center"><img width="400" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G2%20VS.png" alt="Imagen Resultado Grafo 2"></p> |
    | Resultado último ciclo de Euler        |
    | <p align="center"><img width="350" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G2.png" alt="Imagen Resultado Grafo 2"></p>  |
 

- **`Grafo 3:`**

    | Estructura puentes de Königsberg  |
    | ----------------- |
    | <p align="center"><img width="300" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Grafo%203.png" alt="Imagen Grafo 3"></p> |
    | Grafo no Euleriano       |
    | No se encuentra ningun camino/ciclo. Terminal vacio. |
    | <p align="center"><img width="700" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G3%20VS.png" alt="Imagen Resultado Grafo 2"></p> |

    

## 5) Construido con 🛠️

_Herramientas que se utilizaron para el proyecto_

* Java - Lenguaje de programación
* Visual Studio Code - IDE de programación
