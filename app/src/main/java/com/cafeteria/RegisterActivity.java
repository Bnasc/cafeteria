package com.cafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    FirebaseAuth autenticacao;
   User user;
    EditText emailText, nameText, phoneText, passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_register);

    }

    public void initialize(){



    }

    public void register(View view){

        emailText = findViewById(R.id.email);
        nameText = findViewById(R.id.name);
        phoneText = findViewById(R.id.telephone);
        passwordText = findViewById(R.id.password);

        autenticacao = Connection.Fireautenticacao();
String email = emailText.getText().toString();
String password = passwordText.getText().toString();
String phone = phoneText.getText().toString();
String name = nameText.getText().toString();


user = new User(name, email, password, phone);
        autenticacao.createUserWithEmailAndPassword(user.getEmail(), user.getPassword()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this,  "Sucesso ao cadastrar!", Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(RegisterActivity.this, "Erro ao cadastrar!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void login(View view) {

        startActivity(new Intent(this, LoginActivity.class));
    }


}
