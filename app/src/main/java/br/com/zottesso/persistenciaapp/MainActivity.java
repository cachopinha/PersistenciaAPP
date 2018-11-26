package br.com.zottesso.persistenciaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText valor;
    private Button salvar;

    private Button listarProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nome = (EditText) findViewById(R.id.editNome);
        valor = (EditText) findViewById(R.id.editValor);
        salvar = (Button) findViewById(R.id.btnSalvar);
        listarProdutos = (Button) findViewById(R.id.btnListar);


        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    Produto p = new Produto();

                    p.setNome( nome.getText().toString() );

                    p.setValor( Double.parseDouble( valor.getText().toString() ) );

                    p.save();

                    Toast.makeText(MainActivity.this, p.getNome() + " cadastrado!", Toast.LENGTH_SHORT).show();

                    nome.setText("");
                    valor.setText("");

                    nome.requestFocus();

                } catch (Exception e){

                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

                }

            }
        });



        listarProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity( new Intent(MainActivity.this, ProdutosActivity.class) );

            }
        });



    }
}
