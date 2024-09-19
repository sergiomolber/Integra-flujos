@Trsnporte
Feature: Pruebas Transporte

  @CrearUnTransporte
  Scenario Outline: Crear un Transporte
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a transporte y creo un transporte <codigoDeTransporte> <direccion> <codigoDeReferencia> <tipoDeTransporte> <modoDeTransporte> <cadenaDeConexion> <cifrado> <estado>  <activoHasta> <tipoMensaje>
    Then Valido mensaje de creacion exitosa
    Then Descargar archivo




    Examples:
      | tipoDeEntidad | usuario                                | clave            | codigoDeTransporte | direccion | codigoDeReferencia      | tipoDeTransporte | modoDeTransporte | cadenaDeConexion | cifrado     | estado | activoHasta  | tipoMensaje  |
    ##@externaldata@./src/test/resources/Data/DataTransporte.xlsx@CrearTransporte
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"AutomatizacionPR121230"|"INPUT"|"BANCOLP_PSE_NACHAM_Tr"|"FILE"|"FILE"|"Automatizacion21681"|"NONE"|"ACTIVE"|"2025-11-07"|"ByteArray"|

  @EditarUnTransporte
  Scenario Outline: Editar un Transporte
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a transporte y edito un transporte <transporteABuscar>  <direccion> <codigoDeReferencia> <cadenaDeConexion> <cifrado> <estado> <activoHasta>  <tipoMensaje>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | transporteABuscar |  direccion | codigoDeReferencia      |  cadenaDeConexion | cifrado | estado     | activoHasta  | tipoMensaje |
    ##@externaldata@./src/test/resources/Data/DataTransporte.xlsx@editarTransporte
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"AutomatizacionPR121221"|"INPUT"|"BANCOLP_PSE_NACHAM_Tr"|"Automatizacion15435"|"NONE"|"ACTIVE"|"2024-11-08"|"ByteArray"|

  @EliminarUnTransporte
  Scenario Outline: Eliminar un Transporte
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a transporte y elimino un transporte <transporteABuscar>
    Then Valido mensaje de eliminacion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | transporteABuscar |
    ##@externaldata@./src/test/resources/Data/DataTransporte.xlsx@EliminarTransporte
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"AutomatizacionPR121221"|


