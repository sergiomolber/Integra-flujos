@ModuloDeTransferencia
Feature: Prueba de operaciones de ciclo y subir archivo

  @EditarUnCiclohoraMas5Minutos
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2"|
  @AdjuntarDocumentoOrigen
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "POPULAR(BANPOPULAR" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo12 - copia\Archivo\0001002.002.1" |

  @AdjuntarDocumentoDevolucion
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "OCCIDENTE(BANOCCIDEN)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo12 - copia\Archivo\0001023.004.1" |



  @EditarUnCiclo
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
   |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2"|

  @CierreDeCicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |

  @EditarUnCiclohoraMas5Minutosciclo3
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|

  @EditarUnCiclo3
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|

  @CierreDeCicloExitoso3
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |
