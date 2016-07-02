package com.example.dellpc.padc_nevigation.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dellpc.padc_nevigation.R;


public class WinZinFragment extends Fragment {

    public static WinZinFragment newInstance() {
        WinZinFragment fragment = new WinZinFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_win_zin, container, false);
        return view;
    }

}
