package com.utad.sergio.milib.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utad.sergio.milib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    public RegisterFragmentEvents registerFragmentEvents;
    public RegisterFragmentListener registerFragmentListener;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    public void setRegisterFragmentListener(RegisterFragmentListener registerFragmentListener) {
        this.registerFragmentListener=registerFragmentListener;
    }

}

class RegisterFragmentEvents implements View.OnClickListener {

    @Override
    public void onClick(View view) {

    }

}
