@PlanillaConsolidada
Feature: Prueba planilla consolidada

  @ConsultarPorFechaYCicloPlanillaConsolidada
  Scenario Outline: Consultar por fecha y ciclo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a planilla consolidada y diligenciar formulario de consulta <ciclo>
    Then Valido la consulta

    Examples:
      | tipoDeEntidad | usuario      | clave |  ciclo |
    ##@externaldata@./src/test/resources/Data/Data_PlanillaConsolidada.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"1"|



