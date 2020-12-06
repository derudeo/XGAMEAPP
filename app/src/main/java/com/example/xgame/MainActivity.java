package com.example.xgame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSend_onClick(View v){
    Intent i = new Intent(this,com.example.xgame.SubActivity.class);
    startActivity(i);
    }

    public void btnSend_onClick2(View v){
        Intent i = new Intent(this,com.example.xgame.SubActivity2.class);
        EditText txtName = findViewById(R.id.txtName);
        i.putExtra("txtName",txtName.getText().toString());
        startActivity(i);
    }
}
