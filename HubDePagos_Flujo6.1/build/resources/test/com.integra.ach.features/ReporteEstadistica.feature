@ReporteEstadistica
Feature: Pruebas Reporte Reintegros

  @GenerarReporteEstadisticoAcumulado
  Scenario Outline: Generar reporte estaditico acumulado
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar reportes luego al modulo de estadistica y generar un reporte estadistico acumulado <entidadOrigenAcumulado> <entidadDestinoAcumulado> <tipoDeTransaccionAcumulado> <agruparPorAcumulado> <añoReporte> <formatoAcumulado>
    Then Valido generacion Reporte acumulado

    Examples:
      | tipoDeEntidad | usuario                               | clave            | entidadOrigenAcumulado | entidadDestinoAcumulado | tipoDeTransaccionAcumulado | agruparPorAcumulado | añoReporte |formatoAcumulado |
    ##@externaldata@./src/test/resources/Data/Data_GenerarResportesEstadisticos.xlsx@GeneracionReporteAcumulado
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"RAPPIPAY"|"COTRAFA"|"CrÃ©dito a cuenta corriente"|"Mes"|"2024"|"TXT"|

  @GenerarReporteEstadisticoArchivoDeSalida
  Scenario Outline: Generar reporte estaditico de archivo de salida
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar reportes luego al modulo de estadistica y generar un reporte estadistico de archivo de salida <entidadFinanciera> <formatoArchivoSalida>
    Then Valido generacion Reporte estadistico de archivo de salida

    Examples:
      | tipoDeEntidad | usuario                               | clave            | entidadFinanciera |  formatoArchivoSalida |
    ##@externaldata@./src/test/resources/Data/Data_GenerarResportesEstadisticos.xlsx@GeneracionReporteArchivDeSalida
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"COTRAFA"|"TXT"|

  @GenerarReporteEstadisticoDescripcionLote
  Scenario Outline: Generar reporte estaditico descripcion de lote
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar reportes luego al modulo de estadistica y generar un reporte estadistico descripcion de lote <entidadOrigenDescripcionLote> <entidadDestinoDescripcionLote>  <descripcionLote> <formatoDescripcionLote>
    Then Valido generacion Reporte acumulado

    Examples:
      | tipoDeEntidad | usuario                               | clave            | entidadOrigenDescripcionLote | entidadDestinoDescripcionLote |  descripcionLote | formatoDescripcionLote |
    ##@externaldata@./src/test/resources/Data/Data_GenerarResportesEstadisticos.xlsx@GeneracionReporteDesDeLote
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"RAPPIPAY"|"COTRAFA"|"AHORROS"|"TXT"|

  @GenerarReporteEstadisticoDiario
  Scenario Outline: Generar reporte estaditico
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar reportes luego al modulo de estadistica y consultar un reporte estadistico diario <entidadOrigenDiario> <entidadDestinoDiario> <tipoTransaccionDiario> <agruparPorDiario> <añoReporte> <formatoDiario>
    Then Valido generacion Reporte acumulado

    Examples:
      | tipoDeEntidad | usuario                               | clave            | entidadOrigenDiario | entidadDestinoDiario |  tipoTransaccionDiario |agruparPorDiario |añoReporte | formatoDiario |
    ##@externaldata@./src/test/resources/Data/Data_GenerarResportesEstadisticos.xlsx@GeneracionReporteDiario
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"RAPPIPAY"|"COTRAFA"|"CrÃ©dito cuenta de ahorros"|"Entidad Origen"|"2024"|"TXT"|
