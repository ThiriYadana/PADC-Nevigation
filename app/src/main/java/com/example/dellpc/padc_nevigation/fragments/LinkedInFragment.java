package com.example.dellpc.padc_nevigation.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dellpc.padc_nevigation.R;



/**
 * A placeholder fragment containing a simple view.
 */
public class LinkedInFragment extends Fragment {

    public LinkedInFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_linkedin, container, false);
        return view;
    }

    public static LinkedInFragment newInstance() {
        LinkedInFragment linkedInFragment = new LinkedInFragment();
        return linkedInFragment;
    }
}
