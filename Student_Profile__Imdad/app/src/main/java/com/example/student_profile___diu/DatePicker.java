package com.example.student_profile___diu;


import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatePicker extends Fragment {
    TimePicker picker;
    Button btnGet;
    TextView tvw;

    public DatePicker() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_date_picker, container, false);

        tvw=(TextView)v.findViewById(R.id.textView1);
        picker=(TimePicker)v.findViewById(R.id.timePicker1);
        picker.setIs24HourView(true);
        btnGet=(Button)v.findViewById(R.id.button1);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour, minute;
                String am_pm;
                if (Build.VERSION.SDK_INT >= 23 ){
                    hour = picker.getHour();
                    minute = picker.getMinute();
                }
                else{
                    hour = picker.getCurrentHour();
                    minute = picker.getCurrentMinute();
                }
                if(hour > 12) {
                    am_pm = "PM";
                    hour = hour - 12;
                }
                else
                {
                    am_pm="AM";
                }
                tvw.setText("Selected Date: "+ hour +":"+ minute+" "+am_pm);
            }
        });


        return v;
    }

    //ei khane setonclicklistner er code lekhbo..?

}
