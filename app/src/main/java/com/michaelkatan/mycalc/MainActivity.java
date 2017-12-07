package com.michaelkatan.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{
    int a;
    int b;
    int result;
    boolean Plus = true;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resultView = findViewById(R.id.Result_tv);
        Button b1 = findViewById(R.id.btn_1);
        Button b2 = findViewById(R.id.btn_2);
        Button b3 = findViewById(R.id.btn_3);
        Button b4 = findViewById(R.id.btn_4);
        Button b5 = findViewById(R.id.btn_5);
        Button b6 = findViewById(R.id.btn_6);
        Button b7 = findViewById(R.id.btn_7);
        Button b8 = findViewById(R.id.btn_8);
        Button b9 = findViewById(R.id.btn_9);

        Button bPlus = findViewById(R.id.btn_plus);
        Button bMinus = findViewById(R.id.btn_minus);
        Button bEqual = findViewById(R.id.btn_equal);


        resultView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                resultView.setText("");
                a = 0;
                b = 0;
                result = 0;

            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String temp = "";
                resultView.setText(resultView.getText() + "1");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                resultView.setText(resultView.getText()+"9");
            }
        });


        bPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                a = Integer.parseInt(resultView.getText().toString());
                resultView.setText("");
                Plus = true;
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                a = Integer.parseInt(resultView.getText().toString());
                resultView.setText("");
                Plus = false;

            }
        });

        bEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                b = Integer.parseInt(resultView.getText().toString());
                if(Plus)
                {
                    result = a+ b;
                }else
                {
                    result = a - b;
                }

                resultView.setText(result + "");
            }
        });

    }
}
