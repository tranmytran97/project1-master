package com.example.acer.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListQ list = new ListQ();
    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtQ= findViewById(R.id.txtQ);
        list.InitList();
        txtQ.setText(list.question[i].q);
        Button btnTrue = findViewById(R.id.btnTrue);
        Button btnFalse = findViewById(R.id.btnFalse);
        Button btnNext = findViewById(R.id.btnNext);
        Button btnPrev = findViewById(R.id.btnPrev);
        btnTrue.setOnClickListener(this);
        btnFalse.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrev.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {
        TextView txtQ = findViewById(R.id.txtQ);
        switch (v.getId())
        {
            case R.id.btnTrue:
                if(list.question[i].Check(true)==true)
                {
                    Toast.makeText(getApplicationContext(),"Đúng rồi nhé",Toast.LENGTH_SHORT).show();
                }else Toast.makeText(getApplicationContext(),"Sai rồi nhé",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnFalse: if(list.question[i].Check(false)==true)
            {
                Toast.makeText(getApplicationContext(),"Đúng rồi nhé",Toast.LENGTH_SHORT).show();
            }else Toast.makeText(getApplicationContext(),"Sai rồi nhé",Toast.LENGTH_SHORT).show();;break;
            case R.id.btnNext: if(i<2) i++;
            txtQ.setText(list.question[i].q);
            break;
            case R.id.btnPrev: if(i>0) i--;
                txtQ.setText(list.question[i].q);break;
            default: break;
        }

    }


}
