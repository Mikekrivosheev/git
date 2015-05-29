package com.example.mike.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Mike on 27.05.2015.
 */
public class MainActivity extends Activity {
    CharSequence save;
    EditText editText1;
    EditText editText2;
    TextView textView1;
    View.OnClickListener click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.d(MainActivity.class.getName(), "HELLO FROM LOGCAT");

        Log.e(MainActivity.class.getName(), "HELLO FROM LOGCAT");

        Log.w(MainActivity.class.getName(), "HELLO FROM LOGCAT");

        textView1 = (TextView) findViewById(R.id.textView1);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();
                textView1.setText(text1 + " " + text2);
                startActivity(new Intent(MainActivity.this, AcitivityTwo.class));
                //finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MainActivity.class.getName(), "HELLO FROM ONSTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MainActivity.class.getName(), "HELLO FROM ONRESUME");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MainActivity.class.getName(), "HELLO FROM ONSTOP");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MainActivity.class.getName(), "HELLO FROM ONPAUSE");
    }
}