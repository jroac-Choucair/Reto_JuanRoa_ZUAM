# Introduction 
Este es un ejemplo de una automatización móvil que utiliza Serenity como framework, Appium y programación en Java.

# Getting Started
La aplicación que nesecitas para instalar está en: https://github.com/saucelabs/sample-app-mobile/releases

Recordar cambiar las capabilities de su dispositivo móvil en serenity.properties

# Build and Test
Para ejecutar el proyecto completo utilizar el comando:  
```
 gradle test   
```  
Para ejecutar un runner específico : 
 
```  gradle clean test -Dtest.single=MiRunner  ```   
```  gradle clean test -Prunner=MiRunner  ``` 
Para ejecutar diferentes runners separándolos por comas:

```  gradle clean test -Prunner=PrimerRunner,SegundoRunner  ```

Para Generar la evidencia de pruebas: 
 
```  gradle aggregate  ```  

Aunque el proyecto por si solo genera la evidencia automaticamente una vez finalice la ejecución.

# Ejemplo comandos de ejecución: 
```   gradle clean test -Dtest.single=LoginRunner aggregate  ```
