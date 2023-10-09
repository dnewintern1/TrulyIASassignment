package com.base.trulyiasassignment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText signupEmail, signupPassword;
    private Button signupButton;
    private TextView loginRedirectText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor(getString(R.string.actionbarColor)));
        actionBar.setBackgroundDrawable(colorDrawable);

        auth = FirebaseAuth.getInstance();
        signupButton = findViewById(R.id.signup_button);
        signupPassword = findViewById(R.id.signup_password);
        loginRedirectText = findViewById(R.id.loginRedirectText );
        signupEmail = findViewById(R.id.signup_email);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = signupEmail.getText().toString().trim();
                String pass = signupPassword.getText().toString().trim();

                if(user.isEmpty()){
                    signupEmail.setText("email can not be empty");
                }
                if(pass.isEmpty()){
                    signupPassword.setText("password field can not be empty");
                }

                else{
                    auth.createUserWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(SignUpActivity.this, "sign up is successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUpActivity.this , Loginactivity.class));
                            }
                            else {
                                Toast.makeText(SignUpActivity.this, "Signup failed" + task.getException().getMessage() , Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }
            }
        });

        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this , Loginactivity.class));
            }
        });


    }
}