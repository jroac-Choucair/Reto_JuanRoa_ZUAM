@autor Juan Roa

  Feature: Como usuario quiero ingresar a la App SwagLabs para comprar un producto

    @RutaCompraExitosa
    Scenario Outline: Intento Compra Exitosa
      Given que Juan ingresa a la App SwagLabs para comprar un producto
      When  seleciona el articulo para continuar el proceso de compra
        |usuario|contrasena|producto|nombre|apellido|codpostal|
        |<usuario>|<contrasena>|<producto>|<nombre>|<apellido>|<codpostal>|
      Then debe ver el <mensaje> en la pantalla resumen

      Examples:
      |usuario|contrasena|producto|nombre|apellido|codpostal|mensaje|
      |standard_user|secret_sauce|Chamarra Sauce Labs|Juan|Roa|111156|GRACIAS POR SU ORDEN|

    @RutaCompraFallida
    Scenario Outline: Intento Compra Fallida
      Given que Juan ingresa a la App SwagLabs para comprar un producto
      When  Elimina de su carrito los productos y continua con el proceso de compra
      Then debe ver el <mensaje> de alerta en la pantalla informacion

      Examples:
        |mensaje|
        |SU CARRITO ESTA VACÓ|

    @RutaCompraNula
    Scenario Outline: Intento Compra Nula
      Given que Juan ingresa a la App SwagLabs para comprar un producto
      When  Ingresa a su carrito y continua con el proceso de compra
      Then debe ver el <mensaje> de alerta en la pantalla de tu carrito

      Examples:
        |mensaje|
        |SU CARRITO ESTA VACÓ|