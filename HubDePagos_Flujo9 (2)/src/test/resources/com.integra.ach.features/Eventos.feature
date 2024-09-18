@Eventos
Feature: Prueba Eventos

  @CrearUnEvento
  Scenario Outline: Crear un evento
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a eventos y diligenciar formulario de creacion de un evento <contacto> <inicioyFinalizacionDeCiclo> <generacionArchivoDeSalida> <liberacionDeArchivosDeSalida> <errorEnCierreDeCiclo> <estado> <activoHasta> <destinoCorreo>
    Then Valido mensaje de creacion de evento exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | contacto                   | inicioyFinalizacionDeCiclo | generacionArchivoDeSalida | liberacionDeArchivosDeSalida | errorEnCierreDeCiclo | estado | activoHasta | destinoCorreo |
    ##@externaldata@./src/test/resources/Data/Data_Eventos.xlsx@CrearEventoExitoso
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Realizando la prueba"|"Si"|"Si"|"Si"|"No"|"ACTIVE"|"2025-11-03"|"lion950313@gmail.com"|

  @EditarUnEvento
  Scenario Outline: Editar un evento
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a eventos y edito la informacion del evento <eventoAEditar> <contacto> <inicioyFinalizacionDeCiclo> <generacionArchivoDeSalida> <liberacionDeArchivosDeSalida> <errorEnCierreDeCiclo> <estado> <activoHasta> <destinoCorreo>
    Then Valido mensaje de edicion de evnto exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | eventoAEditar            | contacto                  | inicioyFinalizacionDeCiclo | generacionArchivoDeSalida | liberacionDeArchivosDeSalida | errorEnCierreDeCiclo | estado | activoHasta | destinoCorreo |
    ##@externaldata@./src/test/resources/Data/Data_Eventos.xlsx@EditarEvento
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Realizando la prueba"|"Realizando la prueba"|"No"|"No"|"No"|"Si"|"ACTIVE"|"2024-11-04"|"buelvasss@gmail.com"|

  @EliminarUnEvento
  Scenario Outline: Eliminar un evento
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a eventos y busca el evento a eliminar <eventoAEliminar>
    Then Valido mensaje de eliminacion de evento exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | eventoAEliminar          |
    ##@externaldata@./src/test/resources/Data/Data_Eventos.xlsx@EliminarEvento
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Realizando la prueba"|
