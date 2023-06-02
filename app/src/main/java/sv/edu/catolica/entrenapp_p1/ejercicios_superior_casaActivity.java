package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ejercicios_superior_casaActivity extends AppCompatActivity {
    private ImageButton btn_calentamiento_casa, btn_espalda_casa, btn_pecho_casa,
        btn_hombros_casa, btn_abdomen_casa, btn_biceps_casa, btn_triceps_casa, btn_estiramiento_casa;
    private TextView nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios_superior_casa);
        btn_calentamiento_casa = findViewById(R.id.btn_calentamiento_casa);
        btn_espalda_casa = findViewById(R.id.btn_espalda_casa);
        btn_pecho_casa = findViewById(R.id.btn_pecho_casa);
        btn_hombros_casa = findViewById(R.id.btn_hombros_casa);
        btn_abdomen_casa = findViewById(R.id.btn_abdomen_casa);
        btn_biceps_casa = findViewById(R.id.btn_biceps_casa);
        btn_triceps_casa = findViewById(R.id.btn_triceps_casa);
        btn_estiramiento_casa = findViewById(R.id.btn_estiramiento_casa);

        nivel = findViewById(R.id.nivel_casa_superior);

        Intent intent = getIntent();
        String nivel_txt = intent.getStringExtra("nivel");

        nivel.setText(nivel_txt);

        if(nivel_txt.equals("Experto")){

            btn_calentamiento_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_espalda_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_pecho_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_hombros_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_pecho_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_hombros_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_abdomen_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_biceps_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_triceps_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej7casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej8casa_expertoActivity.class);
                    startActivity(intent);
                }
            });

        } else if (nivel_txt.equals("Principiante")) {
            btn_calentamiento_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_espalda_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_pecho_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_hombros_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_pecho_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_hombros_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_abdomen_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_biceps_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_triceps_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej7casa_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej8casa_principianteActivity.class);
                    startActivity(intent);
                }
            });
        }


    }
}