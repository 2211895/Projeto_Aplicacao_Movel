package amsi.dei.estg.ipleiria.projetoamsi.vistas.mvc.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import amsi.dei.estg.ipleiria.projetoamsi.R;

public class RegisterPage extends AppCompatActivity {

    private Button btnRegister;
    private EditText etUsername, etEmail, etPassword, etRua, etLocalidade, etCodigoPostal, etNumTel, etNif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btnRegister);
        etUsername = findViewById(R.id.etUsernameRegister);
        etEmail = findViewById(R.id.etEmailRegister);
        etPassword = findViewById(R.id.etPasswordRegister);
        etRua = findViewById(R.id.etRuaRegister);
        etLocalidade = findViewById(R.id.etRuaRegister);
        etCodigoPostal = findViewById(R.id.etCodigopostalRegister);
        etNumTel = findViewById(R.id.etNumTelemovelRegister);
        etNif = findViewById(R.id.etNifRegister);


        //dropdown com os valores para os generos
        Spinner GeneroDropdown = findViewById(R.id.spinnerGenero);

        String[] Generos = new String[]{"Maculino", "Feminino", "Outro"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Generos);
        GeneroDropdown.setAdapter(adapter);

    }
}