package br.edu.fateczl.atletasnatacao.model;

public class AtletaConcreto extends Atleta{
    private String academia;
    private float recordePessoal;

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public float getRecordePessoal() {
        return recordePessoal;
    }

    public void setRecordePessoal(float recordePessoal) {
        this.recordePessoal = recordePessoal;
    }

    @Override
    public String toString() {
        return "AtletaConcreto{" +
                "academia='" + academia + '\'' +
                ", recordePessoal=" + recordePessoal +
                "} " + super.toString();
    }
}
