@PruebasParametro
Feature: Pruebas Parametro

  @CP001
  Scenario Outline: CP001 Crear una notificación
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingreso configuración de aplicacion y creo una notificación <severidad> <tipo> <asunto> <mensaje> <entidad> <estado>  <fechaHasta>
    Then Valido creación exitosa de una notificación
    Then Recargar pagina
    When Ingreso configuración de aplicacion y edito una notificación <severidad> <tipo>  <asunto> <mensaje> <entidad> <estado> <fechaHasta>
    Then Valido edición exitosa de una notificación
    Then Recargar pagina
    When Ingreso configuración de aplicacion y elimino una notificación <asunto>
    Then Valido eliminación exitosa de una notificación

    Examples:
      |  tipoDeEntidad | usuario | clave | severidad | tipo |  asunto |  mensaje |  entidad |estado |  fechaHasta |
     ##@externaldata@./src/test/resources/Data/Data_Notificaciones.xlsx@CP001
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"INFO (Informativo)"|"Broadcast (Difusión)"|"Prueba Auto30"|"10"|"BANCAMIA"|"ACTIVE"|"2025-11-03"|


#  PARA EJECUTAR INDEPENDIENTEMENTE
#  @CP002
#  Scenario Outline: CP002 Editar una notificación
#    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
#    When Ingreso configuración de aplicacion y edito una notificación <severidad> <tipo> <asuntoABuscar> <asunto> <mensaje> <entidad> <estado> <fechaDesde> <fechaHasta>
#    Then Valido edición exitosa de una notificación
#
#    Examples:
#      |  tipoDeEntidad | usuario | clave | severidad | tipo |  asunto | asuntoABuscar | mensaje |  entidad |estado |  fechaDesde | fechaHasta |
#
#|"EF"|"useradminapprover1@gmail.com"|"Ach.2022*$AU"|"WARM (Advertencia)"|"Alert (Alerta)"|"Prueba Auto30"|"Prueba Auto31"|"10"|"BANCO AGRARIO"|"ACTIVE"|"2023-11-02"|"2023-11-07"|
#
#  @CP003
#  Scenario Outline: CP003 Eliminar una notificación
#    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
#    When Ingreso configuración de aplicacion y elimino una notificación <asuntoABuscar>
#    Then Valido eliminación exitosa de una notificación
#
#    Examples:
#      |  tipoDeEntidad | usuario | clave | asuntoABuscar |
#
#|"EF"|"useradminapprover1@gmail.com"|"Ach.2022*$AU"|"Prueba Auto31"|
#
#  @CP004
#  Scenario Outline: CP003 Validación de alerta
#    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
#    When Ingreso configuración de aplicacion y valido notificación INFO BROADCAST
#    Then Valido alerta en aplicación INFO BROADCAST <asuntoABuscar>
#
#    Examples:
#      |  tipoDeEntidad | usuario | clave | asuntoABuscar |
#
#|"EF"|"useradminapprover1@gmail.com"|"Ach.2022*$AU"|"Prueba Auto31"|
