@Restricciones
Feature: Prueba TipoTransaccion

  @CrearUnaRestriccion
  Scenario Outline: Crear una restriccion
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a catalogos luego modulo restricciones y crear una <eFOriginadora> <eFRecepetora> <codigoTransaccion> <estado> <activoDesde> <activoHasta>
    Then Valido mensaje de creacion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | eFOriginadora         | eFRecepetora    | codigoTransaccion | estado   | activoDesde  | activoHasta  |
    ##@externaldata@./src/test/resources/Data/Data_Restricciones.xlsx@CrearRestriccion
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"RAPPIPAY(BANRAPPI)"|"CITIBANK(BANCITIBAN)"|"37 - DÃ©bito a cuenta ahorros"|"ACTIVE"|"2024-09-06"|"2024-09-06"|

