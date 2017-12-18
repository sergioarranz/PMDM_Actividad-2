package com.utad.sergio.pmdm_actividad2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by sergio on 30/11/17.
 */

public class FireBaseAdmin {

    private FirebaseAuth mAuth;
    public FirebaseAdminListener firebaseAdminListener;
    public FirebaseUser user;
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
                        Log.v("FirebaseAdmin", "createUserWithEmail:onComplete:" + task.isSuccessful());
                        if (task.isSuccessful()) {
                            user = FirebaseAuth.getInstance().getCurrentUser();
                            firebaseAdminListener.firebaseAdmin_RegisterOK(true);
                        } else {
                            firebaseAdminListener.firebaseAdmin_RegisterOK(false);
                        }
                    }
                });

    }

    public void loginUser(String email, String pass, Activity activity){
        mAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.v("FirebaseAdmin", "createUserWithEmail:onComplete:" + task.isSuccessful());
                        if (task.isSuccessful()) {
                            user = FirebaseAuth.getInstance().getCurrentUser();
                            firebaseAdminListener.firebaseAdmin_LoginOK(true);
                        } else {
                            firebaseAdminListener.firebaseAdmin_LoginOK(false);
                        }
                    }
                });

    }
}

