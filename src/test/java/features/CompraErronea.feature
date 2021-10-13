@autor Juan Roa

Feature: Como usuario quiero ingresar a la App SwagLabs para comprar un producto

  @RutaCompra
  Scenario Outline: Intento Compra Erronea
    Given que Juan ingresa a la App SwagLabs para comprar un producto
    When  Elimina de su carrito los productos y continua con el proceso de compra
    Then debe ver el <mensaje> de alerta en la pantalla informacion

    Examples:
      |mensaje|
      |SU CARRITO ESTA VACÓ|