package br.usjt.andresantosfernandesrenedeoliveiramachadointsi3anbua;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MensagemActivity extends Activity {

    private TextView exibeNomeTV;
    private ListView listaLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        Bundle bundle = getIntent().getExtras();

        String nome = bundle.getString("nome");
        String livros = bundle.getString("assunto");

        exibeNomeTV = (TextView) findViewById(R.id.exibeNomeTV);
        exibeNomeTV.setText(getString(R.string.exibeNomeTV) + " " + nome + " !");
        listaLivros = (ListView) findViewById(R.id.listViewLivros);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,obtemLivros(livros));
        listaLivros.setAdapter(arrayAdapter);

    }

    public ArrayList<String> obtemLivros(String assunto){
        boolean teste = true;
        ArrayList<String> listaAssunto = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Concrete Mathematics", "técnico"));
        livros.add(new Livro("The C++ Programming Language", "técnico"));
        livros.add(new Livro("Dom Casmurro", "literatura"));
        livros.add(new Livro("Dom Quixote", "literatura"));

        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getAssunto().toLowerCase().equals(assunto.toLowerCase())){
                listaAssunto.add(livros.get(i).getNome());
                teste = false;
            }
        }
        if(teste)
            Toast.makeText(this, getString(R.string.sem_resultados), Toast.LENGTH_LONG).show();

        return listaAssunto;
    }
}