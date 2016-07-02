package com.example.dellpc.padc_nevigation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dellpc.padc_nevigation.R;



import java.util.zip.Inflater;

/**
 * Created by dellpc on 27-Jun-16.
 */
public class JobSearchFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_jobsearch, container, false);
        return view;
    }

    public static JobSearchFragment newInstance() {
        JobSearchFragment jobSearchFragment = new JobSearchFragment();
        return jobSearchFragment;
    }
}
