package com.example.team_275_mobile_app.account_ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.team_275_mobile_app.R;
import com.example.team_275_mobile_app.patient.PatientMainActivity;

public class Login extends AppCompatActivity {

    //variables
    private Button mBtnLogin;
    private TextView mLinkToRegister;
    private TextView mForgotPassword;
    private EditText mInputEmail;
    private EditText mInputPassword;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mInputEmail = (EditText) findViewById(R.id.email_address);
        mInputPassword = (EditText) findViewById(R.id.password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mLinkToRegister = (TextView) findViewById(R.id.signup_link);

        // Progress dialog

        // Login button Click Event
        mBtnLogin.setOnClickListener(new View.OnClickListener() {

            // implementing onclick. please replace with the right function
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        PatientMainActivity.class);
                startActivity(i);
                finish();
            }

        });

        // Link to Register Screen
        mLinkToRegister.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        AccountType.class);
                startActivity(i);
                finish();
            }
        });

        // launch dialog for reset password.
        TextView resetPassword = (TextView) findViewById(R.id.forgot_password);
        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PasswordResetDialog dialog = new PasswordResetDialog();
                dialog.show(getSupportFragmentManager(), "dialog_password_reset");
            }
        });

        hideSoftKeyboard();

    }
    private void hideSoftKeyboard() {
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}