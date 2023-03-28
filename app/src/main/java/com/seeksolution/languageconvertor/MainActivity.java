package com.seeksolution.languageconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button emoployee,emoployer,business,organization;
    TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        emoployee = findViewById(R.id.btnEmployee);
        emoployer = findViewById(R.id.btnEmployer);
        business = findViewById(R.id.btnBusiness);
        organization = findViewById(R.id.btnOrganization);
        desc = findViewById(R.id.tv_desc);

        emoployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desc.setText(R.string.abtEmployee);
            }
        });


        emoployer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desc.setText(R.string.abtEmployer);
            }
        });

        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desc.setText(R.string.abtBusiness);
            }
        });

        organization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desc.setText(R.string.abtOrganization);
            }
        });
    }
}