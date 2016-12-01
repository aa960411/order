package com.example.hyein.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    CheckBox membership;
    RadioButton pickles,source;
    RadioGroup rGroup;
    TextView pizza,spa,sal;
    ImageView img;
    TextView t1,t2,t3;
    EditText pizzawon,spawon,salwon;
    Button order;
    double  num1,num2,num3,result,price1,price2,price3;
    double result2;
    String rd,rd1,r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickles = (RadioButton) findViewById(R.id.pickles);
        source = (RadioButton) findViewById(R.id.source);
        pizzawon=(EditText) findViewById(R.id.pizzawon);
        spawon = (EditText) findViewById(R.id.spawon);
        salwon = (EditText) findViewById(R.id.salwon);
        membership = (CheckBox) findViewById(R.id.membership);
        rGroup = (RadioGroup) findViewById(R.id.rGroup);
        img = (ImageView) findViewById(R.id.img);
        pizza = (TextView) findViewById(R.id.pizza);
        spa = (TextView) findViewById(R.id.spa);
        sal = (TextView) findViewById(R.id.sal);
        order = (Button) findViewById(R.id.order);
        t1 = (TextView) findViewById(R.id.textView4);
        t2 = (TextView) findViewById(R.id.textView5);
        t3 = (TextView) findViewById(R.id.textView6);

        order.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View v){
                num1 = Integer.parseInt(pizzawon.getText().toString());
                num2 = Integer.parseInt(spawon.getText().toString());
                num3 = Integer.parseInt(salwon.getText().toString());
                result=num1+num2+num3;
                price1=num1*16000;
                price2=num2*11000;
                price3=num3*4000;
                result2=price1+price2+price3;

                rd = pickles.getText().toString();
                rd1 = source.getText().toString();
                if (rGroup.getCheckedRadioButtonId()==R.id.pickles){
                    pizza.setText("CHOICE:"+rd);
                }
                else if(rGroup.getCheckedRadioButtonId()==R.id.source){
                    pizza.setText("CHOICE:"+rd1);
                }

                t1.setText("num: "+result);
                t2.setText("price: "+result2);

                if (rGroup.getCheckedRadioButtonId() == R.id.pickles) {
                    img.setImageResource(R.drawable.pickle);
                } else if (rGroup.getCheckedRadioButtonId() == R.id.source) {
                    img.setImageResource(R.drawable.source);
                }
            }
        });



    }
}
