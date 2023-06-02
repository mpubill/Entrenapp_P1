package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class selecc_parte_gymActivity extends AppCompatActivity {
    private ImageButton btn_sup_gym, btn_inf_gym;
    private RadioButton btn_experto, btn_principiante;
    private String valor_nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecc_parte_gym);
        btn_inf_gym = findViewById(R.id.btn_gym_pInf);
        btn_sup_gym = findViewById(R.id.btn_gym_pSup);
        btn_principiante = findViewById(R.id.radioButton1);
        btn_experto = findViewById(R.id.radioButton2);


    }

    public void AbrirParteInfGym(View view) {
        if(btn_experto.isChecked())
            valor_nivel = btn_experto.getText().toString();
        else if (btn_principiante.isChecked())
            valor_nivel = btn_principiante.getText().toString();

        Intent intent = new Intent(getApplicationContext(),
                ejercicios_inferior_gymActivity.class);
        intent.putExtra("nivel", valor_nivel);
        startActivity(intent);
    }

    public void AbrirParteSupGym(View view) {
        if(btn_experto.isChecked())
            valor_nivel = btn_experto.getText().toString();
        else if (btn_principiante.isChecked())
            valor_nivel = btn_principiante.getText().toString();

        Intent intent = new Intent(getApplicationContext(),
                ejercicios_superior_gymActivity.class);
        intent.putExtra("nivel", valor_nivel);
        startActivity(intent);
    }
}