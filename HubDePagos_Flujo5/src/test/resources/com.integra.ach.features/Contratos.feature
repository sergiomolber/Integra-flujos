@Contratos
Feature: Prueba Limites


  @EditarUnContrato
  Scenario Outline: Editar un Contrato
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a contratos y edito un contrato <contratoABuscar> <descripcionAsociacion> <codigoProceso> <productoSoportado> <codigoSucursal> <derivarCodigoSucursal> <instruccionDeAcuerdo> <archivosDuplicados> <lotesDuplicados> <pagosDuplicados> <procesamientoParaleloDePagos> <PSAPredeterminado> <estado>
    Then Valido mensaje de edicion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | contratoABuscar                   | descripcionAsociacion    | codigoProceso   | productoSoportado          | codigoSucursal | derivarCodigoSucursal | instruccionDeAcuerdo | archivosDuplicados | lotesDuplicados | pagosDuplicados | procesamientoParaleloDePagos | PSAPredeterminado | estado   |
    ##@externaldata@./src/test/resources/Data/DataContratos.xlsx@EditarContrato
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Prueba Auto 100"|"Prueba Auto 101"|"ACHSSS-PROCESS"|"Automated Clearing House"|"Colombia BR"|"No"|"No"|"No"|"No"|"No"|"No"|"No"|"SUSPENDED"|

  @EliminarUnContrato
  Scenario Outline: Eliminar un Contrato
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a contratos y elimino un contrato <contratoABuscar>
    Then Valido mensaje de eliminacion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | contratoABuscar     |
    ##@externaldata@./src/test/resources/Data/DataContratos.xlsx@EliminarContrato
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Prueba Auto 100"|
