@CreacionArchivoXML
Feature: Pruebas Creacion Archivo XML

  @CreacionArchivoXML
  Scenario Outline: Creacion Archivo XML
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar catalogos luego al modulo de Archivo XML y creo un archivo <posicion> <ciclo>
    Then Valido creacion exitosa y clic en generar Archivo XML
    When Tramitar xml <RespuetaBR><Consecutivo><observacion>

    Examples:
      | tipoDeEntidad | usuario                               | clave             | posicion     | ciclo        | RespuetaBR        | Consecutivo        | observacion        |
    ##@externaldata@./src/test/resources/Data/Data_CreacionArchivoXML.xlsx@CreacionArchivoXML
|"EF"|"cenitautorizaut@gmail.com"|"ColombiaAch.2023*"|"A favor de ACH"|"1"|"Si"|"Si"|"Pruebas"|
