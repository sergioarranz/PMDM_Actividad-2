package com.utad.sergio.pmdm_actividad2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.utad.sergio.milib.fragments.LoginFragment;
import com.utad.sergio.milib.fragments.LoginFragmentListener;
import com.utad.sergio.milib.fragments.RegisterFragment;
import com.utad.sergio.milib.fragments.RegisterFragmentListener;

public class MainActivity extends AppCompatActivity {

    public LoginFragment loginFragment;
    public RegisterFragment registerFragment;
    private MainActivityEvents mainActivityEvents;
    //FirebaseAdmin firebaseAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLogin);

    }
}

class MainActivityEvents implements LoginFragmentListener,RegisterFragmentListener {
    MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void OnRegClicked() {

    }

    @Override
    public void OnLoginClicked() {

    }
    /*
    @Override
    public void fireBaseAdminUserConnected(boolean blconnected) {

    }*/
}

