package padroescomportamentais;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlTrafoTest {

    @Test
    void deveContarTrafoQueimadoDeposito() {

        DepositoTrafo depositoTrafo = new DepositoTrafo(
                new Transformador("15428", "150kVA" ,true),
                new Transformador("365247", "150kVA" ,true),
                new Transformador("58478", "300kVA" ,false),
                new Transformador("854698", "500kVA" ,true),
                new Transformador("447539", "75kVA" ,true),
                new Transformador("562458", "10kVA" ,true)
        );
        assertEquals(5, ControlTrafo.contarTrafosQueimadosDep(depositoTrafo));
    }

    @Test
    void deveContarTotalTrafoDeposito() {
        DepositoTrafo depositoTrafo = new DepositoTrafo(
                new Transformador("15428", "150kVA" ,true),
                new Transformador("365247", "150kVA" ,true),
                new Transformador("58478", "300kVA" ,false),
                new Transformador("854698", "500kVA" ,true),
                new Transformador("447539", "75kVA" ,true),
                new Transformador("562458", "10kVA" ,true)
        );
        assertEquals(6, ControlTrafo.contarTotalTrafosDep(depositoTrafo));
    }

}