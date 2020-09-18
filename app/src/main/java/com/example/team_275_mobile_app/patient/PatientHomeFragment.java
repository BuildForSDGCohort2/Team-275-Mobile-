package com.example.team_275_mobile_app.patient;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.team_275_mobile_app.R;

public class PatientHomeFragment extends Fragment {

    private FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Inflate the layout resource that'll be returned
        View view = inflater.inflate(R.layout.fragment_patient_home, container, false);

        //setting toolbar tittle for this fragment, and first you have to make the toolbar public
        ((PatientMainActivity) getActivity()).toolbar.setTitle(" ");

        // handle cardview click events
        CardView cardView1 = view.findViewById(R.id.card_p_1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PatientAppointments.class);
                startActivity(intent);
            }
        });

        CardView cardView2 = view.findViewById(R.id.card_p_2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PatientPrescriptions.class);
                startActivity(intent);
            }
        });

        CardView cardView3 = view.findViewById(R.id.card_p_3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PatientMyDoctors.class);
                startActivity(intent);
            }
        });

        CardView cardView4 = view.findViewById(R.id.card_p_4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PatientPharmacies.class);
                startActivity(intent);
            }
        });

        CardView cardView5 = view.findViewById(R.id.card_p_5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PatientMedicalRecords.class);
                startActivity(intent);
            }
        });

        CardView cardView6 = view.findViewById(R.id.card_p_6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PatientBilling.class);
                startActivity(intent);
            }
        });


        return view;
    }
}