package com.factorybyte.demosc1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.factorybyte.demosc1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OptionCFragment extends Fragment {


    public OptionCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_option_c, container, false);
    }

}
