package adivinha.gregorio.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botaoJogar;
    private Button botaoVoltar;
    private TextView textoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoVoltar = (Button) findViewById(R.id.botao_voltar);
        botaoJogar = (Button) findViewById(R.id.botao_jogar_id);
        textoResultado = (TextView) findViewById(R.id.resultado_id);
        //textoResultado.setText("texto alterado");
        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(10);
                textoResultado.setText("Número: " + numeroAleatorio);
            }
        });
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoResultado.setText("nenhum número");
            }
        });
    }

}
