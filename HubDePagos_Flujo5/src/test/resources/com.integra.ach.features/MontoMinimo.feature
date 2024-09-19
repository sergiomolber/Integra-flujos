@PruebasUsuarios
Feature: Pruebas Usuarios

  @MontoMinimo
  Scenario Outline: CPL001 Creación de Entidad exitosamente
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingreso al modulo de creación de entidades y creo entidad <CodigoEntidad> <Entidad> <NombreEntidad> <TipoEntidad> <SoportaULyingCust> <IdentificadorExternodelaEntidad> <NumeroCuenta> <CodigoCalendario> <Direccion> <Ciudad> <Pais> <Correo> <Telefono> <NIT> <UltimoValorPSE> <DigitoChequeo> <DominioCorreo> <SufijoUsuario> <FAAutenticacion> <Cifrado> <TipoAutenticacion> <XMLFavorACH> <NITCuentaXML> <Portafolio> <Estado> <ActivoDesde> <ActivoHasta>
    Then Valido creación exitosa de la entidad

    Examples:
      |  tipoDeEntidad | usuario | clave |CodigoEntidad |Entidad | NombreEntidad | TipoEntidad |SoportaULyingCust|IdentificadorExternodelaEntidad | NumeroCuenta |CodigoCalendario|Direccion|Ciudad|Pais|Correo|Telefono|NIT|UltimoValorPSE|DigitoChequeo|DominioCorreo| SufijoUsuario |FAAutenticacion|Cifrado|TipoAutenticacion|XMLFavorACH|NITCuentaXML|Portafolio|Estado|ActivoDesde|ActivoHasta|

      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"74649"|"Automatización2105"|"Automatización2105"|"Automatización2105"|"No"|"Automatización2105"|"15555552"|"Calendario Colombiano"|"258"|"Bogota"|"COLOMBIA"|"pruebasautomatizacion@pruebasautomatizacion.com"|"3162320589"|"123456789"|"12345678"|"50"|"pruebasautomatización.com"|"15555552"|"312569885"|"258"|"321245687"|"No"|"123456"|"1234567"|"ACTIVE"|"20240904"|"20240906"|


  @CrearUnContrato
  Scenario Outline: Crear un Contrato
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a contratos y creo un contrato <descripcionAsociacion> <codigoEntidad> <codigoServicio> <codigoProceso> <productoSoportado> <codigoSucursal> <derivarCodigoSucursal> <instruccionDeAcuerdo> <nombreFormatoEntrada> <archivosDuplicados> <lotesDuplicados> <pagosDuplicados> <procesamientoParaleloDePagos> <PSAPredeterminado> <mecanismoDeUso> <estado>
    Then Valido mensaje de creacion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | descripcionAsociacion    | codigoEntidad           | codigoServicio                         | codigoProceso   | productoSoportado          | codigoSucursal | derivarCodigoSucursal | instruccionDeAcuerdo | nombreFormatoEntrada | archivosDuplicados | lotesDuplicados | pagosDuplicados | procesamientoParaleloDePagos | PSAPredeterminado | mecanismoDeUso | estado   |

      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Prueba Auto V00"|"74649"|"Compensación de Pagos Interbancarios"|"Payment settlement ACH"|"Automated Clearing House"|"Colombia BR"|"No"|"No"|"Nacham"|"No"|"No"|"No"|"No"|"No"|"UI"|"ACTIVE"|


  @ConsultarReporteMinimoXEF
  Scenario Outline: CPL001 Creación de Entidad exitosamente
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingreso al modulo de Reporte Minimo X Ef <CodigoEntidad>
    Then Valido Consulta de Monto

    Examples:
      |  tipoDeEntidad | usuario | clave |CodigoEntidad |

      |"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"74649"|
