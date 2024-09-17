@PlanillaDeCompensacion
Feature: Prueba planilla de compensacion

  @ConsultarPorFechaYCiclo
  Scenario Outline: Consultar por fecha y ciclo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a planilla de compensacion y diligenciar formulario de consulta <ciclo> <entidad>
    Then Valido la consulta

    Examples:
      | tipoDeEntidad | usuario      | clave   | ciclo | entidad |
    ##@externaldata@./src/test/resources/Data/Data_PlanillaDeCompensacion.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"1"|"CITIBANK"|


