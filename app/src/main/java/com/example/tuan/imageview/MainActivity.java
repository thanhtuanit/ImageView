package com.example.tuan.imageview;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtViewCountDownTimer;
    ImageView imgShow;
    Button btnShow;
    RelativeLayout rloLayOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = (Button)findViewById(R.id.btnShowImage);
        rloLayOut = (RelativeLayout)findViewById(R.id.activity_main);
        txtViewCountDownTimer=(TextView)findViewById(R.id.textView);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetBackGround();
            }
        });
        new CountDownTimer(10000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                txtViewCountDownTimer.setText(txtViewCountDownTimer.getText().toString() +"*");
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"Hoàn tất",Toast.LENGTH_LONG).show();
            }
        }.start();
    }


    private  void SetImage()
    {
        imgShow.setImageResource(R.drawable.testimage);
    }

    private void SetBackGround()
    {
        rloLayOut.setBackgroundResource(R.drawable.testimage);
    }
}
