package br.edu.fateczl.atletasnatacao.model;

import androidx.annotation.NonNull;

public class AtletaSenior extends Atleta{
    private boolean possuiProblemasCardiacos;

    public boolean isPossuiProblemasCardiacos() {
        return possuiProblemasCardiacos;
    }

    public void setPossuiProblemasCardiacos(boolean possuiProblemasCardiacos) {
        this.possuiProblemasCardiacos = possuiProblemasCardiacos;
    }

    @Override
    public String toString() {
        return "AtletaSenior{" +
                "possuiProblemasCardiacos=" + possuiProblemasCardiacos +
                "} " + super.toString();
    }
}
