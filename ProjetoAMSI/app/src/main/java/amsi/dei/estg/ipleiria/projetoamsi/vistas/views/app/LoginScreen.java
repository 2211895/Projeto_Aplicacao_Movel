package amsi.dei.estg.ipleiria.projetoamsi.vistas.views.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import amsi.dei.estg.ipleiria.projetoamsi.R;

public class LoginScreen extends AppCompatActivity {

    private Button btn_login, btn_registerpage;
    private EditText etUsernameLogin, etPasswordLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        btn_registerpage = findViewById(R.id.btn_registerpage);

        etUsernameLogin = findViewById(R.id.etUsernameLogin);
        etPasswordLogin = findViewById(R.id.etPasswordLogin);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(LoginScreen.this, MainActivity.class);
                startActivity(intentMain);
            }
        });

        btn_registerpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegisterPage = new Intent(LoginScreen.this, RegisterPage.class);
                startActivity(intentRegisterPage);
            }
        });

    }
}