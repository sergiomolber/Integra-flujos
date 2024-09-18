@MensajeRecibidos
Feature: Pruebas Mensajes Recibidos

  @ConsultaMensajesRecibidos
  Scenario Outline: Consulta en Mensajes Recibidos
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a catalogos luego modulo mensajes recibidos y se realiza una consulta <opcionDeBusqueda> <palabraABuscar>
    Then Valido consulta

    Examples:
      | tipoDeEntidad | usuario                       | clave            | opcionDeBusqueda | palabraABuscar |
    ##@externaldata@./src/test/resources/Data/Data_ConsultaMensajes.xlsx@ConsultaMensajesRecibidos
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Importancia"|"INFO"|
