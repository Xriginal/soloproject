package com.example.soloproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    private String user = "Zapata";
    private String pass = "Pancho";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.Username);
                EditText password = (EditText) findViewById(R.id.Password);

                String nameString = name.getText().toString();
                String passwordString = password.getText().toString();

                if (nameString.equals(user) && passwordString.equals(pass)) {
                    Intent i = new Intent(MainActivity.this, LandingPage.class);
                    startActivity(i);
                } else if (!nameString.equals(user) && !passwordString.equals(pass)) {
                    DrawableCompat.setTint(name.getBackground(), ContextCompat.getColor(getApplicationContext(), R.color.design_default_color_error));
                    DrawableCompat.setTint(password.getBackground(), ContextCompat.getColor(getApplicationContext(), R.color.design_default_color_error));
                } else if (!password.equals(pass)) {
                    DrawableCompat.setTint(password.getBackground(), ContextCompat.getColor(getApplicationContext(), R.color.design_default_color_error));
                } else {
                    DrawableCompat.setTint(name.getBackground(), ContextCompat.getColor(getApplicationContext(), R.color.design_default_color_error));
                }
            }
        });
    }
}