@CuadreYConciliacion
Feature: Prueba cuadre y consolidacion

  @ConsultarPorFechaYCicloCuadreYConciliacion
  Scenario Outline: Consultar por fecha y ciclo y exportar los archivos
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cuadre y conciliacion y diligenciar formulario de consulta <ciclo>
    Then Valido la consulta y descarga de los export

    Examples:
      | tipoDeEntidad | usuario                              | clave                   | ciclo |
    ##@externaldata@./src/test/resources/Data/Data_CuadreYConciliacion.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"1"|


