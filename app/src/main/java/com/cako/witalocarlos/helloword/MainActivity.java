package com.cako.witalocarlos.helloword;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText etNome;
    EditText etMatricula;
    EditText etSenha;
    Button btEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNome = (EditText) findViewById(R.id.et_nome);
        etMatricula = (EditText) findViewById(R.id.et_matricula);
        etSenha = (EditText) findViewById(R.id.et_senha);
        btEntrar = (Button) findViewById(R.id.bt_entrar);



        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMostraNome;
                TextView tvMostraMatricula;
                TextView tvMostraSenha;
                Button btVoltar;


                setContentView(R.layout.activity_vizualizar);
                tvMostraNome = (TextView) findViewById(R.id.tv_mostra_nome);
                tvMostraMatricula = (TextView) findViewById(R.id.tv_mostra_matricula);
                tvMostraSenha = (TextView) findViewById(R.id.tv_mostra_senha);
                btVoltar = (Button) findViewById(R.id.bt_voltar);

                tvMostraNome.setText(etNome.getText().toString());
                tvMostraMatricula.setText(etMatricula.getText().toString());
                tvMostraSenha.setText(etSenha.getText().toString()
                );

                btVoltar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.activity_main);
                    }
                });


            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
