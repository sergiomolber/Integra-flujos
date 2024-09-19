

################### Este escenario no se va a utilizar por el momento #####################################

@InscripcionDeCuentas
Feature: Pruebas Incripcion de cuentas
  @InscribirUnaCuenta
  Scenario Outline: Incribir una cuenta
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a catalogos luego modulo inscripcion de cuentas e inscribo una <NITEntidadReceptora> <entidadReceptora> <codigoDeTransaccion> <cuentaDestino> <NitEntidadOriginadora> <limiteAsociar> <estado> <activoDesde> <activoHasta>
    Then Valido mensaje de inscripcion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | NITEntidadReceptora | entidadReceptora | codigoDeTransaccion               | cuentaDestino | NitEntidadOriginadora | limiteAsociar | estado   | activoDesde  | activoHasta  |

|"EF"|"adminaperatorv/citibank"|"ColombiaAch.2024+"|"1234999"|"RAPPIPAY"|"22 - CrÃ©dito a cuenta corriente"|"23654710"|"1"|"Limite D"|"CREATED"|"2024-09-05"|"2024-09-05"|

    ################### Flujo de practica #####################################

  @EditarUnaCuenta
  Scenario Outline: Editar una cuenta
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a catalogos luego modulo inscripcion de cuentas y editar una <NITABuscar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | NITABuscar |

|"EF"|"operadorv/rappi"|"ColombiaAch.2023*"|"5672"|

  @AprobarUnaCuenta
  Scenario Outline: Aprobar una cuenta
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a catalogos luego modulo aprobacion de cuentas y aprobar una <NITEntidadReceptoraABuscar>
    Then Valido mensaje de aprobacion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | NITEntidadReceptoraABuscar|

|"EF"|"adminapproverv/citibank"|"ColombiaAch.2024+"|"5672"|

  @AutorizarUnaCuenta
  Scenario Outline: Eliminar una cuenta
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a catalogos luego modulo Autorizacion de cuentas <NITEntidadReceptoraABuscar>
    Then Valido mensaje exitoso


    Examples:
      | tipoDeEntidad | usuario                              | clave            | NITEntidadReceptoraABuscar|

|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"5672"|

