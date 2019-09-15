package idadecao.gregorio.com.idadecao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText caixaTextoIdade;
    private Button botaoDescobrirIdade;
    private TextView resultadoIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caixaTextoIdade = (EditText) findViewById(R.id.IdadeCachorro);
        botaoDescobrirIdade = (Button) findViewById(R.id.BotaoDescobrirIdade);
        resultadoIdade = (TextView) findViewById(R.id.ResultadoIdade);
        botaoDescobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = caixaTextoIdade.getText().toString();
                if(textoDigitado.isEmpty()){
                    resultadoIdade.setText("Nenhum numero informado" );
                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado*7;
                    resultadoIdade.setText("A idade do cachorro em anos humanos é: "+resultadoFinal +" anos");
                }
            }
        });
    }
}
