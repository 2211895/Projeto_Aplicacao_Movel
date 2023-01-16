package amsi.dei.estg.ipleiria.projetoamsi.vistas.mvc.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import amsi.dei.estg.ipleiria.projetoamsi.R;
import amsi.dei.estg.ipleiria.projetoamsi.vistas.mvc.evaluation.Selecao_avaliacao;
import amsi.dei.estg.ipleiria.projetoamsi.vistas.mvc.nutrition.Selecao_nutricao;
import amsi.dei.estg.ipleiria.projetoamsi.vistas.mvc.workout.Selecao_treino;

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
    }
}