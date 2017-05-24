package com.gocaptain.ronalddaugherty.quiche.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gocaptain.ronalddaugherty.quiche.R;

/**
 * Created by ronalddaugherty on 5/22/17.
 */

public class SugarFragment extends Fragment {

    public SugarFragment () {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.sugar_fragment,container,false);

        return rootView;
    }
}
