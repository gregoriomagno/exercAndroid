package frasedodia.gregorio.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String [] frases = {"feliz é aquele que não é triste",
                                "Eles falam que você não é capaz. Vá lá e mostre que eles estão certos",
                                "O segredo para evitar acidentes é começar a fazer de propósito",
                                "Azar no jogo, azar no amor, sorte no azar ",
                                "A vida é minha e eu faço dela o que minha mulher deixar",
                                "Nunca se esqueça que você não deve esquecer o inesquecível",
                                "Se ferradura desse sorte, burro não puxava carroça",
                                "Eu só tenho preguiça 3 dias na semana: ontem, hoje e amanhã",
                                "Tudo certo assim como 2+2=5",
                                };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoNovaFrase =(TextView) findViewById(R.id.textoFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int num = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[num]);
            }
        });
        //textoNovaFrase.setText(frases[0]);
    }
}
