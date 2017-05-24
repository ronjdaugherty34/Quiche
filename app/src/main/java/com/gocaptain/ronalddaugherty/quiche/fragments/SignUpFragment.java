package com.gocaptain.ronalddaugherty.quiche.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gocaptain.ronalddaugherty.quiche.R;

/**
 * Created by ronalddaugherty on 5/23/17.
 */

public class SignUpFragment extends Fragment{

    public SignUpFragment () {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.signup_fragment,container,false);

        return rootView;
    }
}
