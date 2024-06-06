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

public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    EditText emailTxt, passwordTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_login);
        initialize();
    }

    public void initialize(){

        emailTxt = findViewById(R.id.email);
        passwordTxt  = findViewById(R.id.password);
    }

    public void login(View view){

        auth.signInWithEmailAndPassword(emailTxt.getText().toString(), passwordTxt.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
products();

                }else{
                    Toast.makeText(LoginActivity.this, "Erro ao logar!", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    public void register(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    public void products() {
        startActivity(new Intent(this, ProductsActivity.class));
    }

    public void recoverPassword(View view) {
        startActivity(new Intent(this, RecoverPasswordActivity.class));
    }
}
