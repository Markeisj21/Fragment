package com.markeisjones.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment{
    private static final String TAG = "Home Frag";

    private Button btnNavFraghm;
    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2_layout,container, false);

        btnNavFraghm = (Button) view.findViewById(R.id.btnNavFraghm);
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        btnNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG,"onCreateView: started.");

        btnNavFraghm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Home Fragement", Toast.LENGTH_LONG).show();

                ((MainActivity)getActivity()).setViewPager(0);

            }
        });
        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Home Fragement", Toast.LENGTH_LONG).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Home Fragement", Toast.LENGTH_LONG).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });
        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Home Fragement", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);

            }
        });



        return view;
    }
}
