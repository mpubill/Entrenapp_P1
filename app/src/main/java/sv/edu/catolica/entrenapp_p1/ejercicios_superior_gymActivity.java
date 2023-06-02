package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ejercicios_superior_gymActivity extends AppCompatActivity {
    private ImageButton btn_calentamiento_gym;
    private TextView nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios_superior_gym);
        btn_calentamiento_gym = findViewById(R.id.btn_calentamiento_gym);
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

        } else if (nivel_txt.equals("Principiante")) {
            btn_calentamiento_gym.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),
                            ej1gym_principianteActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}