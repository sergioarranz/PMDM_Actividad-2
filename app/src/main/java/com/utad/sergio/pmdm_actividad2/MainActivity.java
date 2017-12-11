package com.utad.sergio.pmdm_actividad2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.utad.sergio.milib.fragments.MeFragment;
import com.utad.sergio.milib.fragments.LoginFragment;
import com.utad.sergio.milib.fragments.LoginFragmentListener;
import com.utad.sergio.milib.fragments.RegisterFragment;
import com.utad.sergio.milib.fragments.RegisterFragmentListener;

public class MainActivity extends AppCompatActivity {

    public LoginFragment loginFragment;
    public RegisterFragment registerFragment;
    public MeFragment meFragment;
    private MainActivityEvents mainActivityEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLogin);
        registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentReg);
        meFragment = (MeFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentMe);

        loginFragment.setLoginFragmentListener(this.mainActivityEvents);
        registerFragment.setRegisterFragmentListener(this.mainActivityEvents);

        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.show(loginFragment);
        transaction.hide(registerFragment);
        transaction.hide(meFragment);
        transaction.commit();
    }

    //TODO implementación Setters y Getters de MainActivityEvents ¿?
}

class MainActivityEvents implements LoginFragmentListener,RegisterFragmentListener {
    private MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    // Login Firebase
    @Override
    public void onLoginClicked() {

    }

    // Transaction Login -> Register
    @Override
    public void onRegFragmentClicked() {

    }

    // Register & Login Firebase
    @Override
    public void onRegClicked() {

    }

    // Transaction Register -> Login (return)
    @Override
    public void onBackClicked() {

    }
}

