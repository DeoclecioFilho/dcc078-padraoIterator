package padroescomportamentais;

public class Transformador {

    private String numSerie;
    private String potencia;
    private boolean queimado;

    public Transformador(String numSerie, String potencia, boolean queimado) {
        this.numSerie = numSerie;
        this.potencia = potencia;
        this.queimado = queimado;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public boolean isQueimado() {
        return queimado;
    }

    public void setQueimado(boolean queimado) {
        this.queimado = queimado;
    }
}
