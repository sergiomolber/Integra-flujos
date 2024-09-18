@ModuloDeTransferencia
Feature: Prueba de operaciones de ciclo y subir archivo

  @EditarUnCiclohoraMas5Minutos
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|

  @SubirArchivoExitosoPrenotificacion
  Scenario Outline: Subir Varios archivos Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Subir archivo y diligenciar formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Segundo archivo y diligenciar formulario <entidad2> <servicio> <formato> <urlArchivo2>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>

    Examples:
      | tipoDeEntidad | usuario                  | clave          | entidad                 | entidad2                  | servicio                             | formato  | urlArchivo                                                                                                                                                    | urlArchivo2                                                                                          |
      | "EF"          | "useradminapp@gmail.com" | "Ach.2022*$AU" | "OCCIDENTE(BANOCCIDEN)" | "OCCIDENTE(BANOCCIDEN)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo13.1\Archivo\0001023.001.1" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo13.1\Archivo\0001023.002.1" |

  @EditarUnCiclo
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|


  @CierreDeCicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |

  @EditarUnCiclohoraMas5MinutosPrenotificacion1
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"4"|

  @SubirArchivoExitosoPrenotificacion1
  Scenario Outline: Subir Varios archivos Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Subir archivo y diligenciar formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Segundo archivo y diligenciar formulario <entidad2> <servicio> <formato> <urlArchivo2>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>

    Examples:
      | tipoDeEntidad | usuario                  | clave          | entidad                 | entidad2                  | servicio                             | formato  | urlArchivo                                                                                                                                                    | urlArchivo2                                                                                          |
      | "EF"          | "useradminapp@gmail.com" | "Ach.2022*$AU" | "SERFINANZA(BANSERFINANZA)" | "SERFINANZA(BANSERFINANZA" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo13.1\Archivo\0001069.001.1" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo13.1\Archivo\0001069.002.1" |

  @EditarUnCicloPrenotificacion1
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|


  @CierreDeCicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |