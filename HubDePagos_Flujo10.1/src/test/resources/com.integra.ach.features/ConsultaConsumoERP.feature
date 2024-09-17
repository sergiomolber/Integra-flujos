@ConsultaConsumoERP
Feature: Pruebas Consulta Consumo ERP

  @ConsultaConsumoERP
  Scenario Outline: Consulta consumo ERP
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar al modulo de ciclos y consultar un consumo de ERP <fecha>
    Then Valido Inicio de solicitud exitoso


    Examples:
      | tipoDeEntidad | usuario                                | clave            | fecha |
    ##@externaldata@./src/test/resources/Data/DataConsultaConsumoERP.xlsx@ConsultaConsumoERP
|"EF"|"cenitautorizaut@gmail.com"|"ColombiaAch.2023*"|"2024-09-03"|

