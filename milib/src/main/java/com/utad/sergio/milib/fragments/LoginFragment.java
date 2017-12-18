package com.utad.sergio.milib.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.utad.sergio.milib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    public EditText etUsername, etPassword;
    public Button btnLogin, btnRegister;
    public LoginFragmentEvents events;
    public LoginFragmentListener loginFragmentListener;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        etUsername=v.findViewById(R.id.etUsername);
        etPassword=v.findViewById(R.id.etPassword);
        btnLogin=v.findViewById(R.id.btnLogin);
        btnRegister=v.findViewById(R.id.btnRegister);
        events=new LoginFragmentEvents(this);
        btnRegister.setOnClickListener(events);
        btnLogin.setOnClickListener(events);


        return v;
    }

    public void setLoginFragmentListener(LoginFragmentListener loginFragmentListener) {
        this.loginFragmentListener=loginFragmentListener;
    }

}

class LoginFragmentEvents implements View.OnClickListener {

    private LoginFragment loginFragment;

    public LoginFragmentEvents(LoginFragment fragment) {
        this.loginFragment=fragment;
    }

    @Override
    public void onClick(View view) {

    }
}
