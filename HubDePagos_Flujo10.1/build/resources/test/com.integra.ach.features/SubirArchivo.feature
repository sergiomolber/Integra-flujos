@ModuloDeTransferencia
Feature: Prueba de operaciones de ciclo y subir archivo

  @EditarUnCiclohoraMas5Minutos
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |

      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"5"|

  @CargaArchivoExitoso
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <nombreArchivo> <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          | nombreArchivo   |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "POPULAR(BANPOPULAR)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\danielpinilla\Documents\como quiera\apis-fsfb-creacion-data\ACH\ACH\0001002.001.1" | "0001002.001.1" |

  @EditarUnCiclo
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |

      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"5"|

  @CierreDeCicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |





