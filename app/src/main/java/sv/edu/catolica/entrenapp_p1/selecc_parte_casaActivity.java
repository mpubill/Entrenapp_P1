package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class selecc_parte_casaActivity extends AppCompatActivity {
    private ImageButton btn_casa_inf, btn_casa_sup;

    private RadioButton btn_experto, btn_principiante;
    private String valor_nivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecc_parte_casa);
        btn_casa_inf = findViewById(R.id.btn_casa_pInf);
        btn_casa_sup = findViewById(R.id.btn_casa_pSup);
        btn_experto = findViewById(R.id.radioButton2);
        btn_principiante = findViewById(R.id.radioButton1);

    }

    public void AbrirParteSupCasa(View view) {
        if(btn_experto.isChecked())
            valor_nivel = btn_experto.getText().toString();
        else if (btn_principiante.isChecked())
            valor_nivel = btn_principiante.getText().toString();

        Intent intent = new Intent(getApplicationContext(),
                ejercicios_superior_casaActivity.class);
        intent.putExtra("nivel", valor_nivel);
        startActivity(intent);
    }

    public void AbrirParteInfCasa(View view) {
        if(btn_experto.isChecked())
            valor_nivel = btn_experto.getText().toString();
        else if (btn_principiante.isChecked())
            valor_nivel = btn_principiante.getText().toString();

        Intent intent = new Intent(getApplicationContext(),
                ejercicios_inferior_casaActivity.class);
        intent.putExtra("nivel", valor_nivel);
        startActivity(intent);
    }
}