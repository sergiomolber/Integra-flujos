@ConsultaAseguramientoXMLBANRED
Feature: Pruebas Creacion Archivo XML

  @ConsultaAseguramientoXMLBANRED
  Scenario Outline: Consulta Aseguramiento XML BANRED
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a reportes luego al modulo de Aseguramiento XML BANRED y consulto <posicion> <formato>
    Then Valido consulta exitosa

    Examples:
      | tipoDeEntidad | usuario                               | clave            |posicion        |formato |
    ##@externaldata@./src/test/resources/Data/Data_ConsultaAseguramientoXMLBANRED.xlsx@ConsultaArchivoXMLBANRED
|"EF"|"cenitoperatoraut@achcolombia.com.co"|"ColombiaAch.2023+"|"A favor de ACH"|"TXT"|
