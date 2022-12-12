package padroescomportamentais;

import java.util.Iterator;

public class ControlTrafo {

    public static Integer contarTrafosQueimadosDep(DepositoTrafo depositoTrafo) {
        int quantidade = 0;
        for (Transformador trafo : depositoTrafo) {
            if (trafo.isQueimado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalTrafosDep(DepositoTrafo depositoTrafo) {
        int quantidade = 0;
        for (Iterator trafo = depositoTrafo.iterator(); trafo.hasNext(); ) {
            quantidade++;
            trafo.next();
        }
        return quantidade;
    }
}
