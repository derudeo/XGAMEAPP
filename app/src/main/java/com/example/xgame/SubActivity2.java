package com.example.xgame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class SubActivity2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        Intent i = getIntent();
        String txtName = i.getStringExtra("txtName");
        Toast.makeText(this,String.format("こんにちは、%sさん！",txtName),Toast.LENGTH_SHORT).show();
    }

    public void btnBack_onClick(View v){
        finish();
    }
}
