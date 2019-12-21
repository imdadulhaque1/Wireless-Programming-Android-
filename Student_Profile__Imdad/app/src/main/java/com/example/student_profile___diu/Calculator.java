package com.example.student_profile___diu;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends Fragment {
    TextView display;
    Button btn_0, btn_1, btn_2, btn_3,btn_4, btn_5, btn_6, btn_7,btn_8, btn_9, btn_add, btn_sub,btn_multi,btn_div,btn_equal,btn_clear;
    double firstNum, secondNum, result;
    String operation;
    public Calculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_calculator, container, false);

        display=(TextView)v.findViewById(R.id.display);

        btn_0=(Button)v.findViewById(R.id.btn_0);
        btn_1=(Button)v.findViewById(R.id.btn_1);
        btn_2=(Button)v.findViewById(R.id.btn_2);
        btn_3=(Button)v.findViewById(R.id.btn_3);
        btn_4=(Button)v.findViewById(R.id.btn_4);
        btn_5=(Button)v.findViewById(R.id.btn_5);
        btn_6=(Button)v.findViewById(R.id.btn_6);
        btn_7=(Button)v.findViewById(R.id.btn_7);
        btn_8=(Button)v.findViewById(R.id.btn_8);
        btn_9=(Button)v.findViewById(R.id.btn_9);
        btn_add=(Button)v.findViewById(R.id.btn_add);
        btn_sub=(Button)v.findViewById(R.id.btn_sub);
        btn_multi=(Button)v.findViewById(R.id.btn_multi);
        btn_div=(Button)v.findViewById(R.id.btn_div);
        btn_equal=(Button)v.findViewById(R.id.btn_equal);
        btn_clear=(Button)v.findViewById(R.id.btn_clear);

        //btn_0 =(Button) v.findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"0";
                display.setText(input);
            }
        });

        //btn_0 =(Button) v.findViewById(R.id.btn_0);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"1";
                display.setText(input);
            }
        });

        //btn_2 =(Button) v.findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"2";
                display.setText(input);
            }
        });
        //Button b_3 =(Button) v.findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"3";
                display.setText(input);
            }
        });

        //Button btn_4 =(Button) v.findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"4";
                display.setText(input);
            }
        });
        //Button btn_5 =(Button) v.findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"5";
                display.setText(input);
            }
        });
        //Button btn_6 =(Button) v.findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"6";
                display.setText(input);
            }
        });

        //Button btn_7 =(Button) v.findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"7";
                display.setText(input);
            }
        });
        //Button btn_8 =(Button) v.findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"8";
                display.setText(input);
            }
        });
        //Button btn_9 =(Button) v.findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=display.getText()+"9";
                display.setText(input);
            }
        });
        Button b_add =(Button) v.findViewById(R.id.btn_add);
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(display.getText().toString());
                display.setText("");
                operation="+";
            }
        });

        //Button btn_sub =(Button) v.findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(display.getText().toString());
                display.setText("");
                operation="-";
            }
        });

        //Button btn_multi =(Button) v.findViewById(R.id.btn_multi);
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(display.getText().toString());
                display.setText("");
                operation="*";
            }
        });
        //Button btn_div =(Button) v.findViewById(R.id.btn_div);
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(display.getText().toString());
                display.setText("");
                operation="/";
            }
        });
        //Button btn_clear =(Button) v.findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(display.getText().toString());
                display.setText("");
                operation="c";
            }
        });

         //btn_equal =(Button) v.findViewById(R.id.btn_equal);
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans;
                secondNum=Double.parseDouble(display.getText().toString());
                switch(operation){
                    case "+":
                        result=firstNum + secondNum;
                        ans=String.format("%.0f",result);
                        display.setText(ans);
                        break;
                    case "-":
                        result=firstNum - secondNum;
                        ans=String.format("%.0f",result);
                        display.setText(ans);
                        break;
                    case "*":
                        result=firstNum * secondNum;
                        ans=String.format("%.0f",result);
                        display.setText(ans);
                        break;
                    case "/":
                        result=firstNum / secondNum;
                        ans=String.format("%.0f",result);
                        display.setText(ans);
                        break;
                    case "c":
                        ans="";
                        display.setText(ans);
                        break;
                }
            }
        });
        return v;
    }
}
