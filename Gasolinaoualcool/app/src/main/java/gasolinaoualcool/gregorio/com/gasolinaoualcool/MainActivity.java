package gasolinaoualcool.gregorio.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private  EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        precoAlcool =(EditText) findViewById(R.id.precoAlcoolld);
        precoGasolina=(EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView) findViewById(R.id.resultadoId);
        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAlcool = precoAlcool.getText().toString();
                String sGasolina = precoGasolina.getText().toString();
                if(sAlcool.isEmpty() || sGasolina.isEmpty()){
                    textoResultado.setText("Preencha os campos");
                }else {

                double vAlcool = Double.parseDouble(sAlcool);
                double vGasolina =Double.parseDouble(sGasolina);
                double resultado = vAlcool / vGasolina;
                    if (resultado >= 0.7) {
                        textoResultado.setText("Gasolina");
                    } else {
                        textoResultado.setText("alcool");
                    }
                }
            }
        });
    }
}
