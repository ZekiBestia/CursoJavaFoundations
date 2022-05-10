# TIPOS DE DATOS JAVA
Lección 3 del curso de ***Oracle Java Foundations***
##  1. ¿QUÉ ES UNA VARIABLE?

Una variable tiene como fin el almacenar datos. Al crear una variable esta reserva espacio en la memoria RAM.
```java
int num1; //Reserva espacio en memoria
num1=5; //Asigna a la variable num1 el valor de 5
```
NOMENCLATURA INADECUADA PARA VARIABLES

1. Asignar nombres muy largos y poco claros a las variables

```java
int estoEsUnaVariableParaAlmacenarEdad;
int jajesleieesi = 22;
```
* Se recomienda ponerles un nombre corto y claro a nuestras variables
```java
int edad;
int peso;
```
2. Las variables no puden empezar con numeros
```java
int 4333Mate=33;//error
```
3. Dos variables no pueden tener el mismo nombre
```java
int x = 4;
double x= 5.4;
//error en los dos casos
```
## 2.DATOS NUMÉRICOS 
Algunos tipos primitivos.
Las variables primitivas tiene valor por default 0.

| Tipo      |  Length    | Valor mínimo     |Valor máximo |
|-----------|------------|----------------- |------------ |
|Byte       | 8 bits     |  -128            |  $127$      |
|Short      |16 bits     | -32768           | 32767       |
|int        |32 bits     |-2,147,483,648    |2,147,483,647|
|long       |64 bits     |$-2^{63}$         | $2^{63}-1$  |

## 3. OPERADORES MATEMÁTICOS

Operadores mátematicos estándar

| Objetivo     |   Operador | 
|------------  |------------|
|Suma          |+           |
|Resta         |-           | 
|Multiplicación|*           |
|División      |/           |

Ejemplo: 
```java
int suma , resta , multiplicacion, division;
		int num1=5;
		int num2=3;
		suma = num1 + num2;
		resta= num1- num2;
		multiplicacion= num1*num2;
		division= num1/num2;
```
