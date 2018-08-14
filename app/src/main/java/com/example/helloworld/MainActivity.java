package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private static final String ACTIVITY_TAG="MainActivity";
    private Button bt;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过findViewById找到Button资源
        bt = (Button)findViewById(R.id.bt);
        //增加事件响应
        bt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tx=(TextView )findViewById(R.id.textView3);
                tx.setText("hi hj");
                Log.v(MainActivity.ACTIVITY_TAG, "This is Verbose.");
                Log.d(MainActivity.ACTIVITY_TAG, "This is Debug.");
                Log.i(MainActivity.ACTIVITY_TAG, "This is Information");
                Log.w(MainActivity.ACTIVITY_TAG, "This is Warnning.");
                Log.e(MainActivity.ACTIVITY_TAG, "This is Error.");
            }

        });
    }

}
