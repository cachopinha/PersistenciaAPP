package br.com.zottesso.persistenciaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.common.collect.ForwardingIterator;

import java.util.List;

public class ProdutosActivity extends AppCompatActivity {

    private ListView textProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        textProdutos = (ListView) findViewById(R.id.ListaProd);
        List<Produto> produtos = Produto.listAll(Produto.class);


        ArrayAdapter<Produto> adapter = new ArrayAdapter<Produto>(this, android.R.layout.simple_list_item_1, produtos);
        textProdutos.setAdapter(adapter);

    }
}
