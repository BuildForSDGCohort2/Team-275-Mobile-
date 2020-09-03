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

public class AdditionalRegistrationDetails extends AppCompatActivity {

    private Button mBtnSubmit;
    private TextView mBackLink;
    private EditText mInputClinic;
    private EditText mInputOccupationNumber;
    private EditText mInputDepartmentName;
    private EditText mInputLicenseNumebr;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_registration_details);

        mInputClinic = (EditText) findViewById(R.id.clinic_hospital_name);
        mInputOccupationNumber = (EditText) findViewById(R.id.occupation_number);
        mInputDepartmentName = (EditText) findViewById(R.id.department_name);
        mInputLicenseNumebr = (EditText) findViewById(R.id.license_number);
        mBtnSubmit = (Button) findViewById(R.id.submit_extra_fields);
        mBackLink = (TextView) findViewById(R.id.back_link);

        // Progress dialog

        // Register button Click Event
        mBtnSubmit.setOnClickListener(new View.OnClickListener() {

            // implementing onclick. please replace with the right function
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Login.class);
                startActivity(i);
                finish();
            }

        });

        // Link to Register Screen
        mBackLink.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        RegisterConsultant.class);
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