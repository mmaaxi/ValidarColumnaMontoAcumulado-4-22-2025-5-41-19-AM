Feature: Validar inclusión de columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Verificar que la columna y la fórmula de monto acumulado estén presentes en el reporte
    Given el usuario exporta el reporte
    When el usuario abre el archivo Excel exportado
    Then la columna 'Monto (reserva)' se encuentra presente
    And a la derecha se encuentra la columna 'Monto acumulado Folio Reserva 5401'
    And la fórmula suma correctamente los valores