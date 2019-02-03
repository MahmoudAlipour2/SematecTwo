package com.example.sematectwo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Registration extends AppCompatActivity {
    Button btnClicktoVerify;
    EditText etFirstName;
    EditText etLastName;
    EditText etAge;
    EditText etCountry;
    EditText etMail;
    EditText etPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btnClicktoVerify = findViewById(R.id.btnClicktoVerify);


        btnClicktoVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etFirstName = findViewById(R.id.etFirstName);
                final String txtFirstName = etFirstName.getText().toString();


                etLastName = findViewById(R.id.etLastName);
                final String txtLastName = etLastName.getText().toString();


                etAge = findViewById(R.id.etAge);
                final String txtetAge = etAge.getText().toString();


                etCountry = findViewById(R.id.etCountry);
                final String txtetCountry = etCountry.getText().toString();


                etMail = findViewById(R.id.etMail);
                final String txtetMail = etMail.getText().toString();


                etPhoneNumber = findViewById(R.id.etPhoneNumber);
                final String txtetPhoneNumber = etPhoneNumber.getText().toString();


                if (txtetAge.length() == 0 ||
                        txtetCountry.length() == 0 ||
                        txtetMail.length() == 0 ||
                        txtetPhoneNumber.length() == 0 ||
                        txtFirstName.length() == 0 ||
                        txtLastName.length() == 0) {

                    Toast.makeText(Registration.this, "Please Fill Empty Fields!", Toast.LENGTH_LONG).show();
                } else {
                    Intent intentbtntoVerify = new Intent(Registration.this, Verify.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("First Name", txtFirstName);
                    bundle.putString("Last Name", txtLastName);
                    bundle.putString("Age", txtetAge);
                    bundle.putString("Country", txtetCountry);
                    bundle.putString("Mail", txtetMail);
                    bundle.putString("PhoneNumber", txtetPhoneNumber);
                    intentbtntoVerify.putExtras(bundle);
                    startActivity(intentbtntoVerify);

                }
            }
        });


    }
}
