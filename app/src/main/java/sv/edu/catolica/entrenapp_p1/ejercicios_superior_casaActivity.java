package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ejercicios_superior_casaActivity extends AppCompatActivity {
    private ImageButton btn_calentamiento_casa, btn_espalda_casa;
    private TextView nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios_superior_casa);
        btn_calentamiento_casa = findViewById(R.id.btn_calentamiento_casa);
        btn_espalda_casa = findViewById(R.id.btn_espalda_casa);
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
        }


    }
}