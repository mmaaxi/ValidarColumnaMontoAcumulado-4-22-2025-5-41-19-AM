package pages;

import org.openqa.selenium.WebDriver;

public class tc_004Page {

    WebDriver driver;

    // Constructor
    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportReport() {
        // Implementación para exportar el reporte
    }

    public void openExportedExcel() {
        // Implementación para abrir el archivo Excel exportado
    }

    public void verifyMontoReservaColumn() {
        // Implementación para verificar que la columna 'Monto (reserva)' está presente en el Excel
    }

    public void verifyMontoAcumuladoFolioReserva5401Column() {
        // Implementación para verificar que la columna 'Monto acumulado Folio Reserva 5401' está presente
    }

    public void verifyMontoAcumuladoFormula() {
        // Implementación para verificar que la fórmula suma correctamente los valores
    }
}