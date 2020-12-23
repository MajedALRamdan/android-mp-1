package com.example.gradeclaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //defining a var q=quizes, hw=homework , md=midterm , f= final
        // multiply 0.300 by usd to get KWD converter
        //System.out.println(); same as cout in c++
        //convert to string (name of the string + "");

        EditText q= findViewById(R.id.q);
        EditText hw= findViewById(R.id.hw);
        EditText md= findViewById(R.id.md);
        EditText f= findViewById(R.id.f);
        TextView r=findViewById(R.id.r);
        Button c=findViewById(R.id.cal);
        Button res=findViewById(R.id.res);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText("RESULT");
                r.setTextColor(Color.BLACK);
                q.setText("");
                hw.setText("");
                md.setText("");
                f.setText("");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Q= Double.parseDouble(  q.getText().toString());
                double HW= Double.parseDouble( hw.getText().toString());
                double MD= Double.parseDouble( md.getText().toString());
                double F= Double.parseDouble(  f.getText().toString());
                double R=((Q)+(F)+(MD)+(HW));

                if(R>=101){
                    r.setText("wrong input");
                    r.setTextColor(Color.BLACK);
                }
                    else if(R>=90 && R<=100){
                    r.setText("A");
                    r.setTextColor(Color.BLUE);
                }
                    else if(R>=80&&R<=90){
                    r.setText("B");
                    r.setTextColor(Color.GREEN);
                }
                else if(R>69 && R<80){
                    r.setText("c");
                    r.setTextColor(Color.CYAN);
                }
                else if(R>59 && R<70){
                    r.setText("D");
                    r.setTextColor(Color.DKGRAY);
                }
                else{
                    r.setText("F");
                    r.setTextColor(Color.RED);
                }
            }
        });



    }
}