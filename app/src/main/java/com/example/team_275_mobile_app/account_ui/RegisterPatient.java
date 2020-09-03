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

public class RegisterPatient extends AppCompatActivity {

    //variables
    private Button mBtnRegister;
    private TextView mLinkToLogin;
    private EditText mInputFullName;
    private EditText mInputUserName;
    private EditText mInputEmail;
    private EditText mInputPassword;
    private EditText mConfirmPassword;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_patient);

        mInputFullName = (EditText) findViewById(R.id.full_name);
        mInputUserName = (EditText) findViewById(R.id.username);
        mInputEmail = (EditText) findViewById(R.id.email_address);
        mInputPassword = (EditText) findViewById(R.id.phone_number);
        mConfirmPassword = (EditText) findViewById(R.id.password);
        mBtnRegister = (Button) findViewById(R.id.btn_register);
        mLinkToLogin = (TextView) findViewById(R.id.login_link);

        // Progress dialog

        // Register button Click Event
        mBtnRegister.setOnClickListener(new View.OnClickListener() {

            // implementing onclick. please replace with the right function
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Login.class);
                startActivity(i);
                finish();
            }

        });

        // Link to Register Screen
        mLinkToLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Login.class);
                startActivity(i);
                finish();
            }
        });

        hideSoftKeyboard();

    }

    private void hideSoftKeyboard() {
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}