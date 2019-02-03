package com.example.sematectwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnClicktoRegistration ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


btnClicktoRegistration = findViewById(R.id.btnClicktoRegistration);
btnClicktoRegistration.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intnRegistration = new Intent(MainActivity.this, Registration.class);
        startActivity(intnRegistration);

    }
});




    }
}
