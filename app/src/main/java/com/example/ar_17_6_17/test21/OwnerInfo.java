package com.example.ar_17_6_17.test21;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OwnerInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_info);

        Intent move=getIntent();

        final Owner owner= (Owner) move.getSerializableExtra("owner");

        if(owner==null)
            finish();



        Button ban =(Button) findViewById(R.id.ban);
        TextView name=(TextView) findViewById(R.id.NameofOwner);
        TextView number=(TextView) findViewById(R.id.NumofChalets);
        String num=Integer.toString(owner.getNumofchalet());
          num="This Owner own "+" "+ num +" "+ "Chalet/s";

          name.setText(owner.getName());
          number.setText(num);

          ban.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  Intent move = new Intent(OwnerInfo.this , BanOwner.class);


                  move.putExtra("owner" , owner);

                  startActivity(move);
              }
          });




    }
}
