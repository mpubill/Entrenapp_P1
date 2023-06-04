package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ejercicios_inferior_casaActivity extends AppCompatActivity {
    private ImageButton btn_calentamiento_casa, btn_cuadri_casa, btn_femoral_casa,
            btn_glu_casa, btn_pantorrilla_casa, btn_estiramiento_casa;
    private TextView nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios_inferior_casa);
        btn_calentamiento_casa = findViewById(R.id.btn_calentamiento_casa_inf);
        btn_cuadri_casa = findViewById(R.id.btn_cuadri_casa_inf);
        btn_femoral_casa = findViewById(R.id.btn_femoral_casa_inf);
        btn_glu_casa = findViewById(R.id.btn_glu_casa_inf);
        btn_pantorrilla_casa = findViewById(R.id.btn_pantorilla_casa_inf);
        btn_estiramiento_casa = findViewById(R.id.btn_estiramiento_casa_inf);
        nivel = findViewById(R.id.txt_nivel_inf_casa);

        Intent intent = getIntent();
        String nivel_txt = intent.getStringExtra("nivel");

        nivel.setText(nivel_txt);

        if(nivel_txt.equals("Experto")){

            btn_calentamiento_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1casainf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_cuadri_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2casainf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_femoral_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3casainf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_glu_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4casainf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_pantorrilla_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5casainf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6casainf_expertoActivity.class);
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

            btn_cuadri_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2casainf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_femoral_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3casainf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_glu_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4casainf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_pantorrilla_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5casainf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_casa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6casainf_principianteActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}