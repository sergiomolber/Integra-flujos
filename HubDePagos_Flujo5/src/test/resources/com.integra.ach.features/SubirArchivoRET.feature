@ModuloDeTransferencia
Feature: Prueba de operaciones de ciclo y subir archivo

  @SubirArchivoExitoso
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "RAPPIPAY(BANRAPPI)" | "Compensación de Pagos Interbancarios" | "Nacham" | "D:\Integra\Integra-flujos\HubDePagos_Flujo5\Archivo\0001811.007.1" |


  @DescargarArchivo.RET
  Scenario Outline: Descargar archivo.RET
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar al modulo de Trasnferencias luego a instrucciones distribuidas
    Then Descargar archivo.RET

    Examples:
      | tipoDeEntidad | usuario                  | clave          |
      | "EF"          | "operadorv/rappi" | "ColombiaAch.2023*" |




  @CierreDeCicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |


