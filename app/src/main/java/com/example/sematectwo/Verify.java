package com.example.sematectwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Verify extends AppCompatActivity {
    TextView getFirstNameOne;
    TextView getLastNameOne;
    TextView getAgeOne;
    TextView getCountryOne;
    TextView getMailOne;
    TextView getPhoneNumberOne;
    Button btnVerify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);


        Bundle getData = getIntent().getExtras();

        String FirstName = getData.getString("First Name");
        String LastName = getData.getString("Last Name");
        String Age = getData.getString("Age");
        String Country = getData.getString("Country");
        String Mail = getData.getString("Mail");
        String PhoneNumber = getData.getString("PhoneNumber");

        Log.d("tagtagtag", "Las:" + LastName);

        getFirstNameOne = findViewById(R.id.getFirstName);
        getLastNameOne = findViewById(R.id.getLastName);
        getAgeOne = findViewById(R.id.getAge);
        getMailOne = findViewById(R.id.getMail);
        getPhoneNumberOne = findViewById(R.id.getPhoneNumber);
        getCountryOne = findViewById(R.id.getCountry);

        getFirstNameOne.setText(FirstName);
        getLastNameOne.setText(LastName);
        getAgeOne.setText(Age);
        getMailOne.setText(Mail);
        getCountryOne.setText(Country);
        getPhoneNumberOne.setText(PhoneNumber);


        btnVerify = findViewById(R.id.btnVerify);
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Verify.this, "Registration is Successfull", Toast.LENGTH_LONG).show();
            }
        });

    }
}
