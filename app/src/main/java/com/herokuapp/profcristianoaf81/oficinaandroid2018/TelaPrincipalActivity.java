package com.herokuapp.profcristianoaf81.oficinaandroid2018;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TelaPrincipalActivity extends Activity {

    private EditText EditTextNome;
    private TextView MensagemTextView;
    private String mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);
        EditTextNome = (EditText) findViewById(R.id.nomeEditText);
        MensagemTextView = (TextView) findViewById(R.id.mensagemTextView);
    }

    public void surpreender(View v){
        mensagem = "Seja Bem Vindo(a)! ";
        if(EditTextNome.getText().toString().equals("")){
            String aviso = "Você deve preencher o campo acima!!!";
            Toast.makeText(this,aviso,Toast.LENGTH_SHORT).show();
            EditTextNome.requestFocus();
        }else{
            mensagem+= EditTextNome.getText().toString();
            MensagemTextView.setText(mensagem);
        }
    }
}
