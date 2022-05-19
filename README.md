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

_**Grafos dirigidos/no dirigido:** Se considera un grafo simple de Euler, cuando no se tiene bucles y cumple con alguno de los dos colorarios._

_**Colorario 1:** Todos los grados de los vertices deben ser par._

_**Colorario 2:** El grado máximo de vertices impares es 2, teniendo asi, un vertice de comienzo y otro para culminar._

<p align="center"><img width="400" src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Ciclo_euleriano.PNG/220px-Ciclo_euleriano.PNG" alt="Imagen Grafo Completo"></p>


## 2) Explicación de Clases 📖

_Se cuenta con tres clases: Clase Main, Clase GrafoEuler y Clase Arista_


<p align="center"><img width="350" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Clase%20GrafoEuler.png" alt="Imagen Clase GrafoEuler"></p>

_**Clase Main:** Es nuestra clase principal, por donde hacemos correr todos los metodos implementados en nuestra clase GrafoEuler._

_**Clase GrafoEuler:** Esta clase se encarga de la verificación de un Grafo de Euler._

_A su vez, se utilizo listas de adyacencia para la representacion de los grafos._

```
public class GrafoEuler {
    private ArrayList<Arista>[] adj;
    private boolean [] visADJ;
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

### colorarios() 📋

_Verifica si el grafo cumple con alguno de los colorarios._

```
@param  No necesita parametros
@return void - sin valor de retorno
```

### recorrido(int v, int destino, Arista arista) 📋

_Recorre todo el grafo, buscando un ciclo o camino de Euler, se utilizo el recorrido dfs recursivo para su verificación._

_Imprime todos los resultados que encuentra, tomando todos los vertices._

```
@param int -> origen del vertice (v)
@param int -> destino del vertice (destino)
@param Arista -> ultimá arista visitada (arista)
@return void - sin valor de retorno
```

## 4) Ejecutando Pruebas - DEMO ⚙️

_**Grafo 1:**_  
  
<p align="center"><img width="250" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Grafo%201.png" alt="Imagen Grafo 1"></p>
  
_**Resultados Grafo 1:**_ 

<p align="center"><img width="400" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G1%20VS.png" alt="Imagen Resultado Grafo 1 VS"></p>
  
<p align="center"><img width="250" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultados%20G1.png" alt="Imagen Resultado Grafo 1"></p>
  
<p align="center"><img width="250" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultados%20G1%20(P2).png" alt="Imagen Resultado Grafo 1 P2"></p>  

_**Grafo 2:**_  
  
<p align="center"><img width="400" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Grafo%202.png" alt="Imagen Grafo 2"></p>
  
_**Resultados Grafo 2:**_ 

<p align="center"><img width="350" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G2%20VS.png" alt="Imagen Resultado Grafo 2"></p>
  
_Resultado del último grafo_  
  
<p align="center"><img width="350" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G2.png" alt="Imagen Resultado Grafo 2"></p> 
    
_**Grafo 3:**_  
  
<p align="center"><img width="300" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Grafo%203.png" alt="Imagen Grafo 3"></p>
  
_**Resultados Grafo 3:**_ 

_Grafo que no es de Euler, la terminar se encuentra vacía._

<p align="center"><img width="700" src="https://github.com/esther-romero/Grafo-Euler/blob/main/img/Resultado%20G3%20VS.png" alt="Imagen Resultado Grafo 2"></p>
    

## 5) Construido con 🛠️

_Herramientas que se utilizaron para el proyecto_

* Java - Lenguaje de programación
* Visual Studio Code - IDE de programación
