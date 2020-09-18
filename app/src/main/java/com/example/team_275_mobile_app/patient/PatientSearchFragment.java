package com.example.team_275_mobile_app.patient;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.team_275_mobile_app.R;


public class PatientSearchFragment extends Fragment {

    private FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Inflate the layout resource that'll be returned
        View view = inflater.inflate(R.layout.fragment_patient_search, container, false);
        //setting toolbar tittle for this fragment, and first you have to make the toolbar public
        ((PatientMainActivity) getActivity()).toolbar.setTitle("Search");

        return view;
    }
}