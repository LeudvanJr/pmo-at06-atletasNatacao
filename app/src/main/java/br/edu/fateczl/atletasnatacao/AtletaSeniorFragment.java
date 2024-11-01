package br.edu.fateczl.atletasnatacao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.fateczl.atletasnatacao.model.AtletaJovem;
import br.edu.fateczl.atletasnatacao.model.AtletaSenior;

public class AtletaSeniorFragment extends Fragment {

    private View view;
    private EditText etNomeAS;
    private EditText etDataNascAS ;
    private EditText etBairroAS ;
    private CheckBox cbProblemaCardiacoAS;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atleta_senior, container, false);

        etNomeAS = view.findViewById(R.id.etNomeAS);
        etDataNascAS = view.findViewById(R.id.etDataNascAS);
        etBairroAS = view.findViewById(R.id.etBairroAS);
        cbProblemaCardiacoAS = view.findViewById(R.id.cbProblemaCardiacoAS);
        Button btnCadastrarAS = view.findViewById(R.id.btnCadastrarAS);

        btnCadastrarAS.setOnClickListener(op -> cadastrarAS());

        return view;
    }

    private void cadastrarAS() {
        AtletaSenior atleta = new AtletaSenior();
        atleta.setNome(etNomeAS.getText().toString());
        atleta.setDataNasc(etDataNascAS.getText().toString());
        atleta.setBairro(etBairroAS.getText().toString());
        atleta.setPossuiProblemasCardiacos(cbProblemaCardiacoAS.isChecked());

        limparCampos();
        Toast.makeText(view.getContext(),atleta.toString(),Toast.LENGTH_LONG).show();
    }

    private void limparCampos() {
        etNomeAS.setText("");
        etDataNascAS.setText("");
        etBairroAS.setText("");
        cbProblemaCardiacoAS.setChecked(false);
    }
}