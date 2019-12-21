package com.example.adavancedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_add,b_sub,b_multi,b_div,b_equal,b_clear;
    double fNum,sNum,result;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView)findViewById(R.id.display);

        b_0=(Button)findViewById(R.id.b_0);
        b_1=(Button)findViewById(R.id.b_1);
        b_2=(Button)findViewById(R.id.b_2);
        b_3=(Button)findViewById(R.id.b_3);
        b_4=(Button)findViewById(R.id.b_4);
        b_5=(Button)findViewById(R.id.b_5);
        b_6=(Button)findViewById(R.id.b_6);
        b_7=(Button)findViewById(R.id.b_7);
        b_8=(Button)findViewById(R.id.b_8);
        b_9=(Button)findViewById(R.id.b_9);
        b_add=(Button)findViewById(R.id.b_add);
        b_sub=(Button)findViewById(R.id.b_sub);
        b_multi=(Button)findViewById(R.id.b_multi);
        b_div=(Button)findViewById(R.id.b_div);
        b_equal=(Button)findViewById(R.id.b_equal);
        b_clear=(Button)findViewById(R.id.b_clear);
    }

    public void m_0(View v){
        String ans=display.getText()+"0";
        display.setText(ans);
    }
    public void m_1(View v){
        String ans=display.getText()+"1";
        display.setText(ans);
    }
    public void m_2(View v){
        String ans=display.getText()+"2";
        display.setText(ans);
    }
    public void m_3(View v){
        String ans=display.getText()+"3";
        display.setText(ans);
    }
    public void m_4(View v){
        String ans=display.getText()+"4";
        display.setText(ans);
    }
    public void m_5(View v){
        String ans=display.getText()+"5";
        display.setText(ans);
    }
    public void m_6(View v){
        String ans=display.getText()+"6";
        display.setText(ans);
    }
    public void m_7(View v){
        String ans=display.getText()+"7";
        display.setText(ans);
    }
    public void m_8(View v){
        String ans=display.getText()+"8";
        display.setText(ans);
    }
    public void m_9(View v){
        String ans=display.getText()+"9";
        display.setText(ans);
    }
    public void m_add(View v){
        fNum=Double.parseDouble(display.getText().toString());
        display.setText("");
        operation="+";
    }
    public void m_sub(View v){
        fNum=Double.parseDouble(display.getText().toString());
        display.setText("");
        operation="-";
    }
    public void m_multi(View v){
        fNum=Double.parseDouble(display.getText().toString());
        display.setText("");
        operation="*";
    }
    public void m_div(View v){
        fNum=Double.parseDouble(display.getText().toString());
        display.setText("");
        operation="/";
    }
    public void m_clear(View v){
            int len=display.getText().length();
            int num=display.getText().length() -1;
            String store;
            if(len>0)
            {
                StringBuilder back=new StringBuilder(display.getText());
                back.deleteCharAt(num);
                store=back.toString();
                display.setText(store);

            }
    }
    public void m_equal(View v){
        String ans;
        sNum=Double.parseDouble(display.getText().toString());
        switch(operation){
            case "+":
                result=fNum+sNum;
                ans=String.format("%.0f",result);
                display.setText(ans);
                break;
            case "-":
                result=fNum-sNum;
                ans=String.format("%.0f",result);
                display.setText(ans);
                break;
            case "*":
                result=fNum*sNum;
                ans=String.format("%.0f",result);
                display.setText(ans);
                break;
            case "/":
                result=fNum/sNum;
                ans=String.format("%.0f",result);
                display.setText(ans);
                break;
            case "c":
                ans="";
                display.setText(ans);
                break;
        }

    }
}
