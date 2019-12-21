package com.example.student_profile___diu;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Currency_Converter extends Fragment {
    TextView result;
    EditText e1;
    Button btn;
    RadioButton r1,r2;

    public Currency_Converter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v =inflater.inflate(R.layout.fragment_currency__converter, container, false);
        result=(TextView) v.findViewById(R.id.tv1);
        e1=(EditText)v.findViewById(R.id.e1);
        btn=(Button)v.findViewById(R.id.btn);
        r1=(RadioButton)v.findViewById(R.id.r1);
        r2=(RadioButton)v.findViewById(R.id.r2);

        //Button b =(Button) v.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                Double b=Double.parseDouble(s);
                if (r1.isChecked()){
                    b=b*(1/84.4);
                    String ans=Double.toString(b);
                    result.setText(ans);
                }
                if (r2.isChecked()){
                    b=b*(1/64.6);
                    String ans=Double.toString(b);
                    result.setText(ans);
                }
            }
        });

        return v;
    }

}
