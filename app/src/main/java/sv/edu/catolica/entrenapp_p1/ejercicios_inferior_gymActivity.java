package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ejercicios_inferior_gymActivity extends AppCompatActivity {

    private ImageButton btn_calentamiento_gym, btn_cuadri_gym, btn_femoral_gym,
            btn_glu_gym, btn_pantorrilla_gym, btn_estiramiento_gym;
    private TextView nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios_inferior_gym);
        btn_calentamiento_gym = findViewById(R.id.btn_calentamiento_gym);
        btn_cuadri_gym = findViewById(R.id.btn_cuadri_gym);
        btn_femoral_gym = findViewById(R.id.btn_femoral_gym);
        btn_glu_gym = findViewById(R.id.btn_gluteos_gym);
        btn_pantorrilla_gym = findViewById(R.id.btn_pantorrilla_gym);
        btn_estiramiento_gym = findViewById(R.id.btn_estiramiento_gym);
        nivel = findViewById(R.id.txt_nivel_inf_gym);

        Intent intent = getIntent();
        String nivel_txt = intent.getStringExtra("nivel");

        nivel.setText(nivel_txt);

        if(nivel_txt.equals("Experto")){
            btn_calentamiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1gyminf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_cuadri_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2gyminf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_femoral_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3gyminf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_glu_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4gyminf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_pantorrilla_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5gyminf_expertoActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6gyminf_expertoActivity.class);
                    startActivity(intent);
                }
            });

        }else if (nivel_txt.equals("Principiante")){
            btn_calentamiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1gyminf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_cuadri_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej2gyminf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_femoral_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej3gyminf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_glu_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej4gyminf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_pantorrilla_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej5gyminf_principianteActivity.class);
                    startActivity(intent);
                }
            });

            btn_estiramiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej6gyminf_principianteActivity.class);
                    startActivity(intent);
                }
            });

        }
    }
}