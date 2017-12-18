package com.utad.sergio.pmdm_actividad2;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by sergio on 30/11/17.
 */

public class FireBaseAdmin {

    private FirebaseAuth mAuth;
    public FirebaseAdminListener firebaseAdminListener;
    //private FirebaseAuth.AuthStateListener mAuthListener;

    public FireBaseAdmin(){
        mAuth = FirebaseAuth.getInstance();
    }

    public void setFirebaseAdminListener(FirebaseAdminListener firebaseAdminListener){
        this.firebaseAdminListener=firebaseAdminListener;
    }

    public void loginFirebase(String email,String pass){

    }
}

