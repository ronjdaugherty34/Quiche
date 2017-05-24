package com.gocaptain.ronalddaugherty.quiche.fragments;

import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import com.gocaptain.ronalddaugherty.quiche.R;


/**
 * Created by ronalddaugherty on 5/22/17.
 */

public class LoginFragment extends Fragment {

    private EditText inputEmail, inputPassword;
    private FirebaseAuth auth;
    private ProgressBar progressBar;
    private Button sign_up_button, sign_in_button, button_reset;


    public LoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.login_fragment, container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();


        inputEmail = (EditText) getView().findViewById(R.id.email);
        inputPassword = (EditText) getView().findViewById(R.id.password);
        progressBar = (ProgressBar) getView().findViewById(R.id.progressBar);
        sign_up_button = (Button) getView().findViewById(R.id.sign_up_button);
        sign_in_button = (Button) getView().findViewById(R.id.sign_in_button);
        button_reset = (Button) getView().findViewById(R.id.button_reset_password);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("are you there","Please work");
                auth.signInWithEmailAndPassword(inputEmail.getText().toString(), inputPassword.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                      Log.d("that thing", "createUserWithEmail:success");

                                    FirebaseUser user = auth.getCurrentUser();
                                    Log.d("your name", user.getDisplayName());

                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w("TAG", "fail", task.getException());


                                }
                            }
                        });

            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}


