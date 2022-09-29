package br.com.jogos.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Activity extends AppCompatActivity {

    private Button button0;
    private Button button1;
    private Button button2;

    private Button button3;
    private Button button4;
    private Button button5;

    private Button button6;
    private Button button7;
    private Button button8;

    private Button buttonVoltar;

    private char [][]matriz =  {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private int jogada = 0;
    private char m1 = matriz[0][0];

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button0 = findViewById(R.id.button_0_0);
        button1 = findViewById(R.id.button_0_1);
        button2 = findViewById(R.id.button_0_2);
        button3 = findViewById(R.id.button_1_0);
        button4 = findViewById(R.id.button_1_1);
        button5 = findViewById(R.id.button_1_2);
        button6 = findViewById(R.id.button_2_0);
        button7 = findViewById(R.id.button_2_1);
        button8 = findViewById(R.id.button_2_2);

        buttonVoltar = findViewById(R.id.button_Voltar);

        View.OnClickListener listener0 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button0.setText("X");
                    matriz[0][0] = '1';
                }
                else{
                    button0.setText("O");
                    matriz[0][0] = '2';
                }
                jogada++;

            }
        };
        View.OnClickListener listener1 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button1.setText("X");
                    matriz[0][1] = '1';
                }
                else{
                    button1.setText("O");
                    matriz[0][1] = '2';
                }
                jogada++;
            }
        };
        View.OnClickListener listener2 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button2.setText("X");
                    matriz[0][2] = '1';
                }
                else{
                    button2.setText("O");
                    matriz[0][2] = '2';
                }
                jogada++;
            }
        };
        View.OnClickListener listener3 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button3.setText("X");
                    matriz[1][0] = '1';
                }
                else{
                    button3.setText("O");
                    matriz[1][0] = '2';
                }
                jogada++;
            }
        };
        View.OnClickListener listener4 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button4.setText("X");
                    matriz[1][1] = '1';
                }
                else{
                    button4.setText("O");
                    matriz[1][1] = '2';
                }
                jogada++;
            }
        };
        View.OnClickListener listener5 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button5.setText("X");
                    matriz[1][2] = '1';
                }
                else{
                    button5.setText("O");
                    matriz[1][2] = '2';
                }
                jogada++;
            }
        };
        View.OnClickListener listener6 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button6.setText("X");
                    matriz[2][0] = '1';
                }
                else{
                    button6.setText("O");
                    matriz[2][0] = '2';
                }
                jogada++;
            }
        };
        View.OnClickListener listener7 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button7.setText("X");
                    matriz[2][1] = '1';
                }
                else{
                    button7.setText("O");
                    matriz[2][1] = '2';
                }
                jogada++;
            }
        };
        View.OnClickListener listener8 = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (jogada%2 == 0){
                    button8.setText("X");
                    matriz[2][2] = '1';
                }
                else{
                    button8.setText("O");
                    matriz[2][2] = '2';
                }
                jogada++;
            }
        };

        button0.setOnClickListener(listener0);
        button1.setOnClickListener(listener1);
        button2.setOnClickListener(listener2);
        button3.setOnClickListener(listener3);
        button4.setOnClickListener(listener4);
        button5.setOnClickListener(listener5);
        button6.setOnClickListener(listener6);
        button7.setOnClickListener(listener7);
        button8.setOnClickListener(listener8);


        buttonVoltar.setOnClickListener(
                new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {

                        for (int i=0; i<3; i++){
                            for (int j=0; j<3; j++){
                                matriz[i][j] = 0;
                            }
                        }

                        Intent intent = new Intent(
                                getApplicationContext(),
                                MainActivity.class
                        );
                        startActivity(intent);

                    }
                });

    }
}