package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_004Page;

public class tc_004Steps {
    
    tc_004Page page = new tc_004Page();

    @Given("el usuario exporta el reporte")
    public void el_usuario_exporta_el_reporte() {
        page.exportReport();
    }

    @When("el usuario abre el archivo Excel exportado")
    public void el_usuario_abre_el_archivo_excel_exportado() {
        page.openExportedExcel();
    }

    @Then("la columna 'Monto (reserva)' se encuentra presente")
    public void la_columna_monto_reserva_se_encuentra_presente() {
        page.verifyMontoReservaColumn();
    }

    @Then("a la derecha se encuentra la columna 'Monto acumulado Folio Reserva 5401'")
    public void a_la_derecha_se_encuentra_la_columna_monto_acumulado_folio_reserva_5401() {
        page.verifyMontoAcumuladoFolioReserva5401Column();
    }

    @Then("la fórmula suma correctamente los valores")
    public void la_fórmula_suma_correctamente_los_valores() {
        page.verifyMontoAcumuladoFormula();
    }
}