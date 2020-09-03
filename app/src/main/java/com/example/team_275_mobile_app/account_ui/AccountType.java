package com.example.team_275_mobile_app.account_ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.team_275_mobile_app.R;

public class AccountType extends AppCompatActivity {

    //variables
    private Button mBtnPatient;
    private Button mBtnConsultant;
    private TextView mLinkToLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_type);

        mBtnPatient = (Button) findViewById(R.id.patient_btn_link);
        mBtnConsultant = (Button) findViewById(R.id.consultant_btn_link);
        mLinkToLogin = (TextView) findViewById(R.id.have_an_account_link);

        // patient button Click Event
        mBtnPatient.setOnClickListener(new View.OnClickListener() {

            // implementing onclick. please replace with the right function
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        RegisterPatient.class);
                startActivity(i);
                finish();
            }

        });

        // consultant button Click Event
        mBtnConsultant.setOnClickListener(new View.OnClickListener() {

            // implementing onclick. please replace with the right function
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        RegisterConsultant.class);
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