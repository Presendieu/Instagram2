package com.example.instagram.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.instagram.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComposeFragment extends Fragment {


    public ComposeFragment() {
        // Required empty public constructor

    }

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_compose, container, false);
    }

}