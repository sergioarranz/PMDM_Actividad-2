package com.utad.sergio.pmdm_actividad2;

import android.app.Activity;
import android.os.Bundle;

import com.utad.sergio.milib.fragments.LoginFragment;
import com.utad.sergio.milib.fragments.RegisterFragment;

public class MainActivity extends Activity {

    public LoginFragment loginFragment;
    public RegisterFragment registerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
