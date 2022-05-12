# Sentencia de Escape
Un carácter colocado despues de una barra invertida "\\" se denomina secuencia de escape y tiene un significado especial para el compilador.  
En la siguiente tabla aparecen secuencias de escape de Java:

| Secuencia de Escape      |  Descripción                         |  
|--------------------------|--------------------------------------|                
|\t                        |Inserta un nuevo separador, tab       | 
|\b                        |Inserta un retroceso                  | 
|\n                        |Inserta una nueva línea               |
|\r                        |Inserta un retorno de carro           |
|\f                        |Inserta un salto de hoja              |
|\'                        |Inserta un carácter de comilla simple |
|\""                       |Inserta un carácter de comillas dobles|
|\\\                       |Inserta carácter de barra invertida   |

# Sentencias de Impresión 
Hay dos métodos importantes de impresión: 
```java
System.out.println("Hello world"); //Imprime con salto de linea
System.out.print("Hello world"); //Imprime sin salto de linea
```