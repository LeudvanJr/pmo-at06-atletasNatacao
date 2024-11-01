package br.edu.fateczl.atletasnatacao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.fateczl.atletasnatacao.model.AtletaConcreto;
import br.edu.fateczl.atletasnatacao.model.AtletaJovem;

public class AtletaJovemFragment extends Fragment {

    private View view;
    private EditText etNomeAJ;
    private EditText etDataNascAJ ;
    private EditText etBairroAJ ;
    private EditText etAnosPraticaAJ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atleta_jovem, container, false);

        etNomeAJ = view.findViewById(R.id.etNomeAJ);
        etDataNascAJ = view.findViewById(R.id.etDataNascAJ);
        etBairroAJ = view.findViewById(R.id.etBairroAJ);
        etAnosPraticaAJ = view.findViewById(R.id.etAnosPraticaAJ);
        Button btnCadastrarAJ = view.findViewById(R.id.btnCadastrarAJ);

        btnCadastrarAJ.setOnClickListener(op -> cadastrarAJ());

        return view;
    }

    private void cadastrarAJ() {
        AtletaJovem atleta = new AtletaJovem();
        atleta.setNome(etNomeAJ.getText().toString());
        atleta.setDataNasc(etDataNascAJ.getText().toString());
        atleta.setBairro(etBairroAJ.getText().toString());
        atleta.setAnosPratica(Integer.parseInt(etAnosPraticaAJ.getText().toString()));

        limparCampos();
        Toast.makeText(view.getContext(),atleta.toString(),Toast.LENGTH_LONG).show();
    }

    private void limparCampos() {
        etNomeAJ.setText("");
        etDataNascAJ.setText("");
        etBairroAJ.setText("");
        etAnosPraticaAJ.setText("");
    }
}