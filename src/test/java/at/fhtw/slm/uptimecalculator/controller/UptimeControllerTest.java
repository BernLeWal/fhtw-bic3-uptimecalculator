package at.fhtw.slm.uptimecalculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UptimeControllerTest {

    @Test
    void calculateUptimeMinutes() {
        // A - Arrange (vorbereiten, d.h. eine Instanz der Klasse anlegen die ich testen möchte)
        var controller = new UptimeController();

        // A - Act (Test ausführen, d.h. die Methode mit Testdaten ausführen)
        var result = controller.calculateUptimeMinutes(0.0);

        // A - Assert (Vergleichen, ob das Ergebnis der Erwartung entspricht)
        assertEquals(0.0, result);
    }

    @Test
    void claculateUptimeHours() {
        //assertEquals(1,0);
    }
}