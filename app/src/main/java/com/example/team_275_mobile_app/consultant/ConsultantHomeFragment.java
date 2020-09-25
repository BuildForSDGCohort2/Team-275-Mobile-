package com.example.team_275_mobile_app.consultant;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.team_275_mobile_app.R;
import com.example.team_275_mobile_app.patient.PatientAppointments;
import com.example.team_275_mobile_app.patient.PatientBilling;
import com.example.team_275_mobile_app.patient.PatientMainActivity;
import com.example.team_275_mobile_app.patient.PatientMedicalRecords;
import com.example.team_275_mobile_app.patient.PatientMyDoctors;
import com.example.team_275_mobile_app.patient.PatientPharmacies;
import com.example.team_275_mobile_app.patient.PatientPrescriptions;

public class ConsultantHomeFragment extends Fragment {

    private FragmentTransaction fragmentTransaction;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout resource that'll be returned
        View view = inflater.inflate(R.layout.fragment_consultant_home, container, false);

        //setting toolbar tittle for this fragment, and first you have to make the toolbar public
        ((ConsultantMainActivity) getActivity()).toolbar.setTitle("Online Health Therapy");

        // handle cardview click events
        CardView cardView1 = view.findViewById(R.id.card_c_1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConsultantAppointments.class);
                startActivity(intent);
            }
        });

        CardView cardView2 = view.findViewById(R.id.card_c_2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConsultantScheduleTimings.class);
                startActivity(intent);
            }
        });

        CardView cardView3 = view.findViewById(R.id.card_c_3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConsultantMyPatients.class);
                startActivity(intent);
            }
        });

        CardView cardView4 = view.findViewById(R.id.card_c_4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConsultantMyPharmacies.class);
                startActivity(intent);
            }
        });

        CardView cardView5 = view.findViewById(R.id.card_c_5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConsultantBilling.class);
                startActivity(intent);
            }
        });

        CardView cardView6 = view.findViewById(R.id.card_c_6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConsultantReviews.class);
                startActivity(intent);
            }
        });


        return view;
    }
}