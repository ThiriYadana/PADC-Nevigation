package com.example.dellpc.padc_nevigation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dellpc.padc_nevigation.R;

/**
 * Created by dellpc on 28-Jun-16.
 */
public class PulseFragment extends Fragment {

    public static PulseFragment newInstance(){
        PulseFragment pulseFragment = new PulseFragment();
        return pulseFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pulse, container, false);
        return view;
    }
}
