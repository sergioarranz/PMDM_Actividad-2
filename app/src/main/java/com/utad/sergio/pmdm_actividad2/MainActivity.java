package com.utad.sergio.pmdm_actividad2;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
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

        MainActivityEvents mainActivityEvents = new MainActivityEvents(this);

        loginFragment.setLoginFragmentListener(mainActivityEvents);
        registerFragment.setRegisterFragmentListener(mainActivityEvents);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
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
    public void loginFragmentLogBtnClicked(String sUser,String sPass) {

    }

    // Transaction Login -> Register
    @Override
    public void loginFragmentRegBtnClicked() {
        FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.hide(mainActivity.loginFragment);
        transaction.show(mainActivity.registerFragment);
        transaction.hide(mainActivity.meFragment);
        transaction.commit();
    }

    // Register & Login Firebase
    @Override
    public void regFragmentBtnAccClicked() {

    }

    // Transaction Register -> Login (return)
    @Override
    public void regFragmentBtnCancelClicked() {
        FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.show(mainActivity.loginFragment);
        transaction.hide(mainActivity.registerFragment);
        transaction.hide(mainActivity.meFragment);
        transaction.commit();
    }
}

