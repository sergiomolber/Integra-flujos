@CuentasAdministradoras
Feature: Prueba Cuentas Administradoras

  @CrearUnaCuentaAdministradora
  Scenario Outline: Crear una cuenta administradora
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a catalogos luego modulo cuentas administradoras y crear una <numeroCuenta> <tipoDeCuenta> <codigoAdministradora> <NITAdministradora> <codigoDeServicio> <nombreDeServicio> <tipoDeSuscripcion> <EFOriginadora> <EFReceptora> <estado>  <activoHasta>
    Then Valido mensaje de creacion exitosa
    Then Regresar index
    When Ingresar a catalogos luego modulo cuentas administradoras y editar una <numeroCuenta> <tipoDeCuenta> <codigoAdministradora> <NITAdministradora> <codigoDeServicio> <nombreDeServicio> <tipoDeSuscripcion> <EFOriginadora> <EFReceptora> <estado> <activoHasta1>
    Then Valido mensaje de edicion exitosa
    Then Regresar index
    When Ingresar a catalogos luego modulo cuentas administradoras y eliminar una <numeroCuenta>
    Then Valido mensaje de eliminacion exitosa
    Examples:
      | tipoDeEntidad | usuario                              | clave            | numeroCuenta | tipoDeCuenta                | codigoAdministradora | NITAdministradora | codigoDeServicio | nombreDeServicio | tipoDeSuscripcion | EFOriginadora | EFReceptora | estado     | activoHasta |activoHasta1|
   ##@externaldata@./src/test/resources/Data/Data_CuentasAdministradoras.xlsx@CrearCuentasAdministradoras
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"237498423"|"17890001"|"1239001"|"147001"|"145671"|"1245002"|"1243002"|"1103"|"1101"|"ACTIVE"|"2024-11-03"|"2025-11-03"|


