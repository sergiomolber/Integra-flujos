@ModuloDeTransferencia
Feature: Prueba de operaciones de ciclo y subir archivo

    @ConsultaTableroDePagos
  Scenario Outline: Hacer una consulta de cierre de ciclo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
      When Ingresar a modulo de Tablero de pagos luego filtro por fecha
      Then Valido la informacion de la consulta luego oprime Exportar
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |

