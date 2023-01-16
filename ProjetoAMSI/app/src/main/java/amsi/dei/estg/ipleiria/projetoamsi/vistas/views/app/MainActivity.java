package amsi.dei.estg.ipleiria.projetoamsi.vistas.views.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import amsi.dei.estg.ipleiria.projetoamsi.R;
import amsi.dei.estg.ipleiria.projetoamsi.vistas.views.evaluation.Selecao_avaliacao;
import amsi.dei.estg.ipleiria.projetoamsi.vistas.views.messages.Selecao_mensagens;
import amsi.dei.estg.ipleiria.projetoamsi.vistas.views.nutrition.Selecao_nutricao;
import amsi.dei.estg.ipleiria.projetoamsi.vistas.views.workout.Selecao_treino;

public class MainActivity extends AppCompatActivity {
    private Button btn_treino, btn_nutricao, btn_avaliacao, btn_salas, btn_mensagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_treino = findViewById(R.id.btn_treino);
        btn_nutricao = findViewById(R.id.btn_nutricao);
        btn_avaliacao = findViewById(R.id.btn_avaliacao);
        btn_salas = findViewById(R.id.btn_salas);
        btn_mensagens = findViewById(R.id.btn_mensagens);

        btn_treino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intentTreino = new Intent(MainActivity.this, Selecao_treino.class);
            startActivity(intentTreino);
            }
        });

        btn_nutricao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNutricao = new Intent(MainActivity.this, Selecao_nutricao.class);
                startActivity(intentNutricao);
            }
        });

        btn_avaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAvaliacao = new Intent(MainActivity.this, Selecao_avaliacao.class);
                startActivity(intentAvaliacao);
            }
        });

        btn_salas.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSalas = new Intent(MainActivity.this, Selecao_salas.class);
                startActivity(intentSalas);
            }
        }));

        btn_mensagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMensagens = new Intent(MainActivity.this, Selecao_mensagens.class);
                startActivity(intentMensagens);
            }
        });
    }
}