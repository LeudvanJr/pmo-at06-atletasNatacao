/*
 *@author: Leudvan Guedes
 */

package br.edu.fateczl.atletasnatacao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Date;
import java.time.LocalDate;

import br.edu.fateczl.atletasnatacao.model.AtletaConcreto;

public class AtletaFragment extends Fragment {

    private View view;
    private EditText etNomeAt;
    private EditText etDataNascAt ;
    private EditText etBairroAt ;
    private EditText etRecordePessoalAt ;
    private EditText etAcademiaAt ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atleta, container, false);

        etNomeAt = view.findViewById(R.id.etNomeAt);
        etDataNascAt = view.findViewById(R.id.etDataNascAt);
        etBairroAt = view.findViewById(R.id.etBairroAt);
        etRecordePessoalAt = view.findViewById(R.id.etRecordePessoalAt);
        etAcademiaAt = view.findViewById(R.id.etAcademiaAt);
        Button btnCadastrarAt = view.findViewById(R.id.btnCadastrarAt);

        btnCadastrarAt.setOnClickListener(op -> cadastrarAt());

        return view;
    }

    private void cadastrarAt() {
        AtletaConcreto atleta = new AtletaConcreto();
        atleta.setNome(etNomeAt.getText().toString());
        atleta.setDataNasc(etDataNascAt.getText().toString());
        atleta.setBairro(etBairroAt.getText().toString());
        atleta.setAcademia(etAcademiaAt.getText().toString());
        atleta.setRecordePessoal(Float.parseFloat(etRecordePessoalAt.getText().toString()));

        limparCampos();
        Toast.makeText(view.getContext(),atleta.toString(),Toast.LENGTH_LONG*3).show();
    }

    private void limparCampos() {
        etNomeAt.setText("");
        etDataNascAt.setText("");
        etBairroAt.setText("");
        etRecordePessoalAt.setText("");
        etAcademiaAt.setText("");
    }
}