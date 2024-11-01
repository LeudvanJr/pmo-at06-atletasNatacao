package br.edu.fateczl.atletasnatacao.model;

public class AtletaJovem extends Atleta{
    private int anosPratica;

    public int getAnosPratica() {
        return anosPratica;
    }

    public void setAnosPratica(int anosPratica) {
        this.anosPratica = anosPratica;
    }

    @Override
    public String toString() {
        return "AtletaJovem{" +
                "anosPratica=" + anosPratica +
                "} " + super.toString();
    }
}
