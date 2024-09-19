@PruebasUsuarios
Feature: Pruebas Usuarios

  @CPL001
  Scenario Outline: CPL001 Creación de Entidad exitosamente
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingreso al modulo de creación de entidades y creo entidad <CodigoEntidad> <Entidad> <NombreEntidad> <TipoEntidad> <SoportaULyingCust> <IdentificadorExternodelaEntidad> <NumeroCuenta> <CodigoCalendario> <Direccion> <Ciudad> <Pais> <Correo> <Telefono> <NIT> <UltimoValorPSE> <DigitoChequeo> <DominioCorreo> <SufijoUsuario> <FAAutenticacion> <Cifrado> <TipoAutenticacion> <XMLFavorACH> <NITCuentaXML> <Portafolio> <Estado>  <ActivoHasta>
    Then Valido creación exitosa de la entidad

    Examples:
      |  tipoDeEntidad | usuario | clave |CodigoEntidad |Entidad | NombreEntidad | TipoEntidad |SoportaULyingCust|IdentificadorExternodelaEntidad | NumeroCuenta |CodigoCalendario|Direccion|Ciudad|Pais|Correo|Telefono|NIT|UltimoValorPSE|DigitoChequeo|DominioCorreo| SufijoUsuario |FAAutenticacion|Cifrado|TipoAutenticacion|XMLFavorACH|NITCuentaXML|Portafolio|Estado|ActivoHasta|
  ##@externaldata@./src/test/resources/Data/Data.xlsx@CPL001
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"3092129000"|"Automatización2109123"|"Automatización2109123"|"Automatización2109123"|"No"|"Automatización2109123"|"15555552"|"Calendario Colombiano"|"258"|"Bogota"|"COLOMBIA"|"pruebasautomatizacion@pruebasautomatizacion.com"|"3162320589"|"123456789"|"12345678"|"50"|"pruebasautomatización.com"|"15555552"|"312569885"|"258"|"321245687"|"No"|"123456"|"1234567"|"ACTIVE"|"20250807"|

  @CPL002
  Scenario Outline: CPL002 Creación de Entidad fallida por codigo de entidad existente
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingreso al modulo de creación de entidades y creo entidad <CodigoEntidad> <Entidad> <NombreEntidad> <TipoEntidad> <SoportaULyingCust> <IdentificadorExternodelaEntidad> <NumeroCuenta> <CodigoCalendario> <Direccion> <Ciudad> <Pais> <Correo> <Telefono> <NIT> <UltimoValorPSE> <DigitoChequeo> <DominioCorreo> <SufijoUsuario> <FAAutenticacion> <Cifrado> <TipoAutenticacion> <XMLFavorACH> <NITCuentaXML> <Portafolio> <Estado>  <ActivoHasta>
    Then Valido creación con codigo de entidad existente

    Examples:
      |  tipoDeEntidad | usuario | clave |CodigoEntidad |Entidad | NombreEntidad | TipoEntidad |SoportaULyingCust|IdentificadorExternodelaEntidad | NumeroCuenta |CodigoCalendario|Direccion|Ciudad|Pais|Correo|Telefono|NIT|UltimoValorPSE|DigitoChequeo|DominioCorreo| SufijoUsuario |FAAutenticacion|Cifrado|TipoAutenticacion|XMLFavorACH|NITCuentaXML|Portafolio|Estado|ActivoHasta|
  ##@externaldata@./src/test/resources/Data/Data.xlsx@CPL002
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"122015"|"Automatización201"|"Automatización201"|"Automatización201"|"No"|"PruebasAutomatización1"|"15555552"|"Calendario Colombiano"|"258"|"Bogota"|"COLOMBIA"|"pruebasautomatizacion@pruebasautomatizacion.com"|"3162320589"|"123456789"|"12345678"|"50"|"pruebasautomatización.com"|"15555552"|"312569885"|"258"|"321245687"|"No"|"123456"|"1234567"|"ACTIVE"|"20241107"|

  @CPL003
  Scenario Outline: CPL003 Edición de Entidad exitosamente
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingreso al modulo de creación de entidades y edito entidad <EntidadABuscar> <Entidad> <NombreEntidad>  <IdentificadorExternodelaEntidad> <NumeroCuenta> <Direccion> <Ciudad> <Correo> <Telefono> <NIT> <UltimoValorPSE> <DigitoChequeo> <DominioCorreo><SufijoUsuario> <NITCuentaXML> <Portafolio> <Estado> <ActivoHasta>
    Then Valido edición de entidad exitosa

    Examples:
      |  tipoDeEntidad | usuario | clave | EntidadABuscar | NombreEntidad | Entidad |IdentificadorExternodelaEntidad | NumeroCuenta |Direccion|Ciudad|Correo|Telefono|NIT|UltimoValorPSE|DigitoChequeo|DominioCorreo| SufijoUsuario |NITCuentaXML|Portafolio|Estado|ActivoHasta|
  ##@externaldata@./src/test/resources/Data/Data.xlsx@CPL003
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Automatización2109123"|"Automatización2109123"|"Automatización2109123"|"Automatización2102"|"15555553"|"258"|"Bogota"|"pruebasautomatizacion@pruebasautomatizacion.com"|"3162320589"|"123456789"|"12345678"|"50"|"pruebasautomatización.com"|"15555552"|"123456"|"1234567"|"ACTIVE"|"20251102"|

  @CPL004
  Scenario Outline: CPL004 Eliminacion de Entidad exitosamente
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingreso al modulo de creación de entidades y elimino entidad <Entidad>
    Then Valido eliminación de entidad exitosa

    Examples:
      |  tipoDeEntidad | usuario | clave | Entidad |
  ##@externaldata@./src/test/resources/Data/Data.xlsx@CPL004
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Automatización2109123"|
