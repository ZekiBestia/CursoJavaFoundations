# Tipo de datos Textuales
## Tipo primitivo char
Es el único tipo de dato textual primitivo , se utiliza para un único carácter (16bits)  
Ejemplo:
```java
char caracter = 'M';
char num = '4';
//Se coloca entre comillas simples el caracter que se le asigna
```
Los tipos ==*char*== no puedes admitir varios caracteres:
```java
char caracter1='SER'; //Esto marca un error
```

## Datos primitivos
| Tipo      |  Length    | Datos            |  
|-----------|------------|------------------|
|boolean    |1 bits      | true /false      |
|Byte       | 8 bits     | Enteros          |
|Short      |16 bits     | Enteros          |
|int        |32 bits     | Enteros          |
|long       |64 bits     | Enteros          |
|float      |32 bits     |Números flotantes |
|double     |64 bits     |Números flotantes |
|char       |16 bits     |Caracteres únicos |
## String 
Las cadenas pueden admitir varios caracteres , utlizando dobles comillas  
Ejemplo:
```java
String cadena = "Hola mundo";
```
Las cadenas en Java son objetos y no datos primitivos. Java viene con una clase* String* que ofrece información sobre:
- Las propiedades de la cadena 
- Los comportamientos de la cadena
Podemos crear cadenas combinando variables:
```java
String var1 = "Hello my name is ";
String var2 = "Ezequiel Olivera Reyes";
String saludo = var1 + var2 ;
```
