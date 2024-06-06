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
        initialize();
    }

    public void initialize(){
        emailText = findViewById(R.id.email);
        nameText = findViewById(R.id.name);
        phoneText = findViewById(R.id.telephone);
        passwordText = findViewById(R.id.password);


    }

    public void register(View view){


        autenticacao = Connection.Fireautenticacao();

        autenticacao.createUserWithEmailAndPassword(emailText.getText().toString(), passwordText.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this,  "Sucesso ao cadastrar!", Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(RegisterActivity.this, "Erro ao cadastrar!", Toast.LENGTH_SHORT).show();
                }
            }
        });

       // startActivity(new Intent(this, ProductsActivity.class));
    }

    public void login(View view) {

        startActivity(new Intent(this, LoginActivity.class));
    }


}
