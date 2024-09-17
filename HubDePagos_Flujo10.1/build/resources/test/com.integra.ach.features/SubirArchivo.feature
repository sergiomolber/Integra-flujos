@ModuloDeTransferencia
Feature: Prueba de operaciones de ciclo y subir archivo

  @SubirArchivoExitoso
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <nombreArchivo> <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          | nombreArchivo   |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "POPULAR(BANPOPULAR)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\danielpinilla\Documents\como quiera\apis-fsfb-creacion-data\ACH\ACH\0001002.001.1" | "0001002.001.1" |

  @SubirVariosArchivosExitosos
  Scenario Outline: Subir Varios archivos Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Subir archivo y diligenciar formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Segundo archivo y diligenciar formulario <entidad2> <servicio> <formato> <urlArchivo2>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Tercer archivo y diligenciar formulario <entidad3> <servicio> <formato> <urlArchivo3>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Cuarto archivo y diligenciar formulario <entidad4> <servicio> <formato> <urlArchivo4>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>

    Examples:
      | tipoDeEntidad | usuario                  | clave          | entidad            | entidad2                  | entidad3                | entidad4                | servicio                               | formato  | urlArchivo                                                                                           | urlArchivo2                                                                                          | urlArchivo3                                                                                          | urlArchivo4                                                                                          |
      | "EF"          | "useradminapp@gmail.com" | "Ach.2022*$AU" | "POPULAR(BANPOPULAR)" | "CITIBANK(BANCITIBAN)" | "OCCIDENTE(BANOCCIDEN)" | "DAVIVIENDA(BANDAVIVIE)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001051.002.1" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001009.005.1" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001023.002.1" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001051.002.1" |


  @AdjuntarDocumentoOrigen
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <nombreArchivo> <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          | nombreArchivo   |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "OCCIDENTE(BANOCCIDEN)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\danielpinilla\Documents\como quiera\apis-fsfb-creacion-data\ACH\ACH\0001023.002.1" | "0001023.002.1" |

  @AdjuntarDocumentoDevolucion
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <nombreArchivo> <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          | nombreArchivo   |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "POPULAR(BANPOPULAR)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\danielpinilla\Documents\como quiera\apis-fsfb-creacion-data\ACH\ACH\0001023.002.1" | "0001023.002.1" |

  @SubirArchivoExitosoPrenotificacion
  Scenario Outline: Subir Varios archivos Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Subir archivo y diligenciar formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Segundo archivo y diligenciar formulario <entidad2> <servicio> <formato> <urlArchivo2>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>

    Examples:
      | tipoDeEntidad | usuario                  | clave          | entidad            | entidad2                  | servicio                               | formato  | urlArchivo                                                                                           | urlArchivo2                                                                                          |
      | "EF"          | "useradminapp@gmail.com" | "Ach.2022*$AU" | "POPULAR(BANPOPULAR)" | "CITIBANK(BANCITIBAN)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001002.005.1" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001009.005.1" |

  @SubirArchivoExitoso.RET
  Scenario Outline: Subir Varios archivos Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Subir archivo y diligenciar formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>

    Examples:
      | tipoDeEntidad | usuario                  | clave          | entidad            | servicio                               | formato  | urlArchivo                                                                                           |
      | "EF"          | "useradminapp@gmail.com" | "Ach.2022*$AU" | "POPULAR(BANPOPULAR)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001002.005.1" |



  @CierreDeCiclo
    @ConsultaDeCierresDeCiclo
  Scenario Outline: Hacer una consulta de cierre de ciclo
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a modulo de ciclo luego cierre de ciclo y digita
    Then Valido el estado
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |

  @CierreDeCicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |


  @CierreDeTodosLosCiclo
  Scenario Outline: Hacer cierre de todos los ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo Para el ciclo a cerrar
    Then El sistema cierra todos los ciclos del dia

    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |


