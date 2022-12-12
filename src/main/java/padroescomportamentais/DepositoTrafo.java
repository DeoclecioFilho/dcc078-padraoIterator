package padroescomportamentais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DepositoTrafo implements Iterable<Transformador>{

    private List<Transformador> trafos = new ArrayList<Transformador>();

    public DepositoTrafo(Transformador... trafos) {
        this.trafos = Arrays.asList(trafos);
    }

    @Override
    public Iterator<Transformador> iterator() {
        return trafos.iterator();
    }
}
