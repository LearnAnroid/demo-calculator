package com.example.android.udemycalculartorappmasterandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText number1,number2;
    private Button btncong,btntru,btnnhan,btnchia,btnclear;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText)findViewById(R.id.edt_number1);
        number2=(EditText)findViewById(R.id.edt_number2);
        btncong=(Button)findViewById(R.id.btn_cong);
        btntru=(Button)findViewById(R.id.btn_tru);
        btnnhan=(Button)findViewById(R.id.btn_nhan);
        btnchia=(Button)findViewById(R.id.btn_chia);
        result=(TextView)findViewById(R.id.tv_timer);
        btnclear=(Button)findViewById(R.id.btn_clear);

        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().length()>0 && number2.getText().length()>0){
                    double s1=Double.parseDouble(number1.getText().toString());
                    double s2=Double.parseDouble(number2.getText().toString());
                    double theresult=s1+s2;
                    result.setText(Double.toString(theresult));
                }else{
                    Toast.makeText(MainActivity.this,"Bạn phải nhập vào hai số",Toast.LENGTH_LONG).show();
                }

            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().length()>0 && number2.getText().length()>0){
                    double s1=Double.parseDouble(number1.getText().toString());
                    double s2=Double.parseDouble(number2.getText().toString());
                    double theresult=s1-s2;
                    result.setText(Double.toString(theresult));
                }else{
                    Toast.makeText(MainActivity.this,"Bạn phải nhập vào hai số",Toast.LENGTH_LONG).show();
                }

            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().length()>0 && number2.getText().length()>0){
                    double s1=Double.parseDouble(number1.getText().toString());
                    double s2=Double.parseDouble(number2.getText().toString());
                    double theresult=s1*s2;
                    result.setText(Double.toString(theresult));
                }else{
                    Toast.makeText(MainActivity.this,"Bạn phải nhập vào hai số",Toast.LENGTH_LONG).show();
                }


            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().length()>0 && number2.getText().length()>0){
                    double s1=Double.parseDouble(number1.getText().toString());
                    double s2=Double.parseDouble(number2.getText().toString());
                    double theresult=s1/s2;
                    result.setText(Double.toString(theresult));
                }else{
                    Toast.makeText(MainActivity.this,"Bạn phải nhập vào hai số",Toast.LENGTH_LONG).show();
                }

            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText("");
                number2.setText("");
                result.setText("0.00");
                number1.requestFocus();

            }
        });

    }
}
