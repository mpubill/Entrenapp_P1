package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ejercicios_superior_gymActivity extends AppCompatActivity {
    private ImageButton btn_calentamiento_gym, btn_espalda_gym, btn_pecho_gym, btn_hombros_gym, btn_abdomen_gym, btn_biceps_gym, btn_triceps_gym, btn_estiramiento_gym;
    private TextView nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios_superior_gym);
        btn_calentamiento_gym = findViewById(R.id.btn_calentamiento_gym);
        btn_espalda_gym = findViewById(R.id.btn_espalda_gym);
        btn_pecho_gym = findViewById(R.id.btn_pecho_gym);
        btn_hombros_gym = findViewById(R.id.btn_hombros_gym);
        btn_abdomen_gym = findViewById(R.id.btn_abdomen_gym);
        btn_biceps_gym = findViewById(R.id.btn_biceps_gym);
        btn_triceps_gym = findViewById(R.id.btn_triceps_gym);
        btn_estiramiento_gym = findViewById(R.id.btn_estiramiento_gym);
        nivel = findViewById(R.id.txt_nivel_sup_gym);

        Intent intent = getIntent();
        String nivel_txt = intent.getStringExtra("nivel");

        nivel.setText(nivel_txt);

        if(nivel_txt.equals("Experto")){

            btn_calentamiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_espalda_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_pecho_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_hombros_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_abdomen_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_biceps_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_triceps_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej7gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej8gym_expertoActivity.class);
                    startActivity(intent);
                }
            });

        } else if (nivel_txt.equals("Principiante")) {
            btn_calentamiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1gym_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_espalda_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2gym_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_pecho_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3gym_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_hombros_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4gym_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_abdomen_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5gym_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_biceps_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6gym_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_triceps_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej7gym_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej8gym_principianteActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}