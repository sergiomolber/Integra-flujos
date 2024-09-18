@logs
Feature: Prueba Logs Eventos

  @ConsultaTiposDeEventos
  Scenario Outline: Consultar por tipo de evento
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a logs de eventos y buscar por <evento>
    #Then Valido mensaje de busqueda por evento exitoso
    When generar reporte de log de eventos

    Examples:
      | tipoDeEntidad | usuario                              | clave            | evento       |
       ##@externaldata@./src/test/resources/Data/Data_LogDeEvento.xlsx@ConsultaTipoDeEventos
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Crear Ciclo Tiempo"|


  @ConsultaPorUsuario
  Scenario Outline: Consultar por usuario
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a logs de eventos y consulto por usuario <usuarioEvento>
    #Then Valido mensaje de busqueda por usuario exitoso
    #When generar reporte de log de eventos
    Examples:
      | tipoDeEntidad | usuario                              | clave            | usuarioEvento |
       ##@externaldata@./src/test/resources/Data/Data_LogDeEvento.xlsx@ConsultaPorUsuario
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"useradminapp@gmail.com"|


  @ConsultaPorCorreo
  Scenario Outline: Consultar por correo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a logs de eventos y consulto por correo <correo>
    #Then Valido mensaje de busqueda por correo exitoso
    When generar reporte de log de eventos

    Examples:
      | tipoDeEntidad | usuario                              | clave            | correo|
       ##@externaldata@./src/test/resources/Data/Data_LogDeEvento.xlsx@ConsultaPorCorreo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"vivigavicely@gmail.com"|
