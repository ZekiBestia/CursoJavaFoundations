# Promociones 
Se asigna un tipo más pequeño a un tipo mayor:   
byte → short → int → long  
```java
long intToLong = 6;
```
Se asgina un valor int a un tipo flotante:   
4 → 4,0
```java
double intToDouble =4,0;
```
![[DatosPrimitivos.png]]


# Conversiones 
Se asigna un tipo mayor a un tipo mas pequño:
byte ← short ← int ← log   
```java
int LongAInt = (int)20L; //cambiamos el numero long a int
```
Si se asigna un tipo flotante a un tipo integral:
```java
short dobleAEntero = (short) 3.5; // dobleAEntero=3
```

Pérdida de precisión:
```java
double money = 53.99;
int moneyE = (int) money; //MoneyE is 53
```

En el siguiente ejemplo Java marca un error:
```java
int a = 2;
	int b= 2;
	byte c;
	c = (a+b);  
```
A pesar de que el tipo de dato byte si puede guardar esa cantidad de memoria Java no le permite realizar esa asignación , esto porque Java asume que al agregar  una variable *int*, el valor rebasaria el espacio asignado a un byte. 

Solución:
```java
int a = 2;
	int b= 2;
	byte c;
	c = (byte)(a+b); //Convertir a las variables a y b en tipo byte
```

En la siguiente asignación Java marca error porque *v* y *n* se promocionan automaticamente a enteros:
```java 
short v , n , m ;
	v = 4;
	n=5;
	m =(v +n); //Java marca error

```

Solución: 
```java
short v , n , m ;
	v = 4;
	n=5;
	m =(short)(v + n); // convertimos a short la suma de (v + n)
					  // m=9
```

# Tipo Float
Los valores del tipo flotante tienen que tener escrito una *F* despues del valor asignado, si no Java marcaria un error:
```java
float numero = 3.45; //java marcaria un error
float numero2 = 3.45F; //Asi se debemos asignar un valor Flotante 
float numero 3 = (float)3.45; //Esta es otra forma valida
```

# String a Datos Numéricos
En ocaciones le solicitamos al usuario que ingrese texto en un cuadro de dialogo.La mejor forma de repesentar texto es mediante un valor String.  
Pero a veces se tendra que realizar operaciones matemáticas con las entradas de los usuarios.
- Tendriamos que convertir el valor String en tipos de datos numericos
	- short
	- int 
	- double
	- float

Para convertir String a datos numéricos podemos ocupar los metodos *parce()* o el método *valueOf()*
### String to int 
#### Con el método *parse();*
```java
	String edad = "12";
	int edadIn;
	edadIn = Integer.parseInt(edad);//convierte String a entero

```
#### Con el método *valueOf();*
```java
	String edad = "12";
	int edadIn;
	edadIn = Integer.valueOf(edad);//convierte String a entero
```
### String to double
#### Con el método *parse();*
```java

```