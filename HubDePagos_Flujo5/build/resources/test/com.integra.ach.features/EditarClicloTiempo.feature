@ModuloDeTransferencia
Feature: Prueba de operaciones de ciclo y subir archivo

  @EditarUnCiclohoraMas5Minutos
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos <cicloAEditar>
    Then Valido mensaje de edicion de ciclo exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
    ##@externaldata@./src/test/resources/Data/Data_CicloDeTiempo.xlsx@EditarUnCiclo
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"1"|

  @EditarUnCicloHoramenos5minutos
  Scenario Outline: Editar un ciclo de tiempo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a ciclo de tiempo y edito la informacion del ciclo <cicloAEditar>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | cicloAEditar |
      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"1"|

  @CierreDeCicloExitosociclo2
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |