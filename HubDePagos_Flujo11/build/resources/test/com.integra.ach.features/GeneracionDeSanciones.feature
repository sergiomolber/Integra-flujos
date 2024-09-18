@GeneracionDeSanciones
Feature: Prueba de consulta de una sancion

  @EditarUnCiclohoraMas5Minutos
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"1"|

  @AdjuntarDocumentoOrigenSancion7-9-10
  Scenario Outline: Subir un archivo Nacham Sancion7, Sancion9 y Sancion10 en el ciclo 1
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    #Cargar archivo sancion 10 banco citibank ORIGINAL "0001009.005.1"
    When Subir archivo y diligenciar formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    #Cargar archivo sancion 9 banco AV-Villas "0001052.031.1"
    When Subir Segundo archivo y diligenciar formulario <entidad2> <servicio> <formato> <urlArchivo2>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    #Cargar archivo sancion 7 banco citibank "0001009.004.1"
    When Subir Tercer archivo y diligenciar formulario <entidad3> <servicio> <formato> <urlArchivo3>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>

    Examples:
      | tipoDeEntidad | usuario                  | clave          | entidad            | entidad2                  | entidad3                | servicio                               | formato  | urlArchivo                                                                                           | urlArchivo2                                                                                          | urlArchivo3                                                                                          |
      | "EF"          | "useradminapp@gmail.com" | "Ach.2022*$AU" | "CITIBANK(BANCITIBAN)" | "AV VILLAS(BANAVVILLA)" | "CITIBANK(BANCITIBAN)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo11\Archivo\SANCION 10\ORIGINAL\0001009.005.1" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo11\Archivo\SANCION 9\ORIGINAL\0001052.031.1" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo11\Archivo\SANCION 7\0001009.004.1" |

  @EditarUnCiclo
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"1"|

  @CierreDe1CicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca los ciclos a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |


# Cargar archivos ciclo 2
  @EditarUnCiclo2
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2"|

  @CierreDeCiclo2Exitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |
# Cargar archivos ciclo 3

  @EditarUnCiclohoraMas5MinutosCiclo3
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|


  @AdjuntarDocumentoDevolucionSancion9
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    # Cargar devolucion sancion 9 banco Sudameris " 0001012.004.1"
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "SUDAMERIS(BANSUDAMER)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo11\Archivo\SANCION 9\DEVOLUCION\0001012.004.1" |

  @EditarUnCiclo3
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|

  @CierreDeCiclo3Exitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |

 #Cargar ciclo 4:

  @EditarUnCiclohoraMas5MinutosCiclo4
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"4"|

  @AdjuntarDocumentoDevolucionSancion10
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    # Cargar devolucion sancion 10 banco Bancamia "0001059.001.1"
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "BANCAMIA(BANBANCAMI)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo11\Archivo\SANCION 10\DEVOLUCION\0001059.001.1" |

  @EditarUnCiclo4
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3"|

  @CierreDeCiclo4Exitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |

    # Cargar ciclo 5

  @EditarUnCiclohoraMas5MinutosCiclo5
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"5"|

  @AdjuntarDocumentoOrigenSancion500
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
   # Cargar devolucion sancion 500 banco Citibank "0001009.006.1"
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "CITIBANK(BANCITIBAN)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\sergiomolina\Downloads\AutomatizacionIntegraACH (2)\Automatizacion\HubDePagos_Flujo11\Archivo\SANCION 500\0001009.006.1" |

  @EditarUnCiclo5
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"4"|

  @CierreDeCiclo5Exitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |
