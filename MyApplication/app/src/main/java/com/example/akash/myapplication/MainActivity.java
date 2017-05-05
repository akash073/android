package com.example.akash.myapplication;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonClickCancel(View view) {
        String token=FirebaseInstanceId.getInstance().getToken();
        System.out.println("MainActivity.onCreate: " + token);
        Toast.makeText(this, "JRebel are you working", Toast.LENGTH_LONG).show();

    }
}
