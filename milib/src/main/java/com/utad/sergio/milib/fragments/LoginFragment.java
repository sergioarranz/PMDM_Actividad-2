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
public class LoginFragment extends Fragment {

    public LoginFragmentEvents loginFragmentEvents;
    public LoginFragmentListener loginFragmentListener;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void setLoginFragmentListener(LoginFragmentListener loginFragmentListener) {
        this.loginFragmentListener=loginFragmentListener;
    }

}

class LoginFragmentEvents implements View.OnClickListener {

    @Override
    public void onClick(View view) {

    }
}
