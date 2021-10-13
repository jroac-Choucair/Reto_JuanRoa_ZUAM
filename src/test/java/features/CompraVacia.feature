@autor Juan Roa

Feature: Como usuario quiero ingresar a la App SwagLabs para comprar un producto

  @RutaCompra
  Scenario Outline: Intento Compra Nula
    Given que Juan ingresa a la App SwagLabs para comprar un producto
    When  Ingresa a su carrito y continua con el proceso de compra
    Then debe ver el <mensaje> de alerta en la pantalla de tu carrito

    Examples:
      |mensaje|
      |SU CARRITO ESTA VACÓ|