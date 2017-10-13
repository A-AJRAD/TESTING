package com.example.ar_17_6_17.test21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);


        Button Owner =(Button) findViewById(R.id.owner);


        Button customer =(Button) findViewById(R.id.custmoer);
        Button chalet =(Button) findViewById(R.id.chalet);


        Owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent owners=new Intent(AdminPage.this , OwnersList.class);

                startActivity(owners);


            }
        });


//        customer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//            }
//        });
//
//        chalet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//            }
//        });

    }
}
