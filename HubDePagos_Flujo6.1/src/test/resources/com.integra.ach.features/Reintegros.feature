@ReporteReintegros
Feature: Pruebas Reporte Reintegros

# CREAMOS UN REINTEGRO Y LUEGO SE CONSULTA QUE HAYA QUEDADO EN EL REPORTE
  @CrearUnReintegro
  Scenario Outline: Crear un reintegro
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    ##Crear reintegro
    When Ingresar cartalogos luego al modulo de reintegro y diligenciar formulario de creacion de un reintegro  <entidad> <montoAFavor> <montoEnContra> <estado> <obervacion>
    Then Valido mensaje de creacion exitosa
    #Consultar reintegro
    When Ingresar cartalogos luego al modulo de reintegro y consultar un reintegiro
    Then Valido consulta


    Examples:
      | tipoDeEntidad | usuario            | clave      | entidad | montoAFavor | montoEnContra | estado | obervacion |
    ##@externaldata@./src/test/resources/Data/Data_Reintegros.xlsx@CrearReintegro
|"EF"|"cenitoperatoraut@achcolombia.com.co"|"ColombiaAch.2023+"|"BBVA"|"102346"|"1234556"|"ACTIVE"|"Pruebas"|

  # POR SI REQUIREN SOLO REALIZAR EL PROCESO DE CONSULTA
#  @ConsultaReporteReintegros
#  Scenario Outline: Consulta reporte reintegros
#    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
#    When Ingresar cartalogos luego al modulo de reintegro y consultar un reintegiro
#    Then Valido consulta
#
#    Examples:
#      | tipoDeEntidad | usuario            | clave      |
#    ##@externaldata@./src/test/resources/Data/Data_ConsultaReintegros.xlsx@ConsultaReintegro
#|"EF"|"cenitoperatoraut@achcolombia.com.co"|"ColombiaAch.2023+"|
