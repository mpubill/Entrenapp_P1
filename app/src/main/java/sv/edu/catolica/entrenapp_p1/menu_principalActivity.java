package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu_principalActivity extends AppCompatActivity {

    private ImageButton btn_casa, btn_gym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        btn_casa = findViewById(R.id.btn_casa);
        btn_gym = findViewById(R.id.btn_gym);

        btn_casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selecc_parte_casaActivity.class);
                startActivity(intent);
            }
        });

        btn_gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selecc_parte_gymActivity.class);
                startActivity(intent);
            }
        });
    }
}