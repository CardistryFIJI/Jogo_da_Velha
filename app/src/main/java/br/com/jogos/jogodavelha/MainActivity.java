package br.com.jogos.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonStart;
    private TextView textViewTitle;
    private TextInputEditText textJogador1;
    private TextInputEditText textJogador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.button_Start);
        textViewTitle = findViewById(R.id.TextView_Title);

        //textJogador1 = findViewById(R.id.edit_Jogador1);
        textJogador2 = findViewById(R.id.edit_Jogador2);

        buttonStart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(
                                getApplicationContext(),
                                Second_Activity.class
                        );
                        startActivity(intent);

                    }
                });
    }

    private void saveJogador() {

        //String name1 = textJogador1.getText().toString();
        String name2 = textJogador2.getText().toString();

        //if (name1.isEmpty()) {
            //textJogador1.setError("Favor inserir o nome");
            //return;
        //}
        if (name2.isEmpty()) {
            textJogador2.setError("Favor inserir o nome");
            return;
        }

    }
}
