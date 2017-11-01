package br.usjt.andresantosfernandesrenedeoliveiramachadointsi3anbua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText editNomeId;
    private EditText editAssuntoId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNomeId = (EditText) findViewById(R.id.editNomeId);
        editAssuntoId = (EditText) findViewById(R.id.editAssuntoId);
    }

    public void enviaDados(View v){
        Intent intent = new Intent (this, MensagemActivity.class);
        intent.putExtra("nome", editNomeId.getText().toString());
        intent.putExtra("assunto", editAssuntoId.getText().toString());
        startActivity(intent);
    }
}