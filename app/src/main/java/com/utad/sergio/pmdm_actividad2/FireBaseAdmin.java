package com.utad.sergio.pmdm_actividad2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
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

    public void registerUser(String email, String pass, Activity activity){
        mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("FirebaseAdmin", "createUserWithEmail:onComplete:" + task.isSuccessful());
                        if (task.isSuccessful()) {

                        } else {

                        }
                    }
                });

    }
}

