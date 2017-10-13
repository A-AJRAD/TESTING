package com.example.ar_17_6_17.test21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BanOwner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban_owner);


        TextView infoo=(TextView) findViewById(R.id.infoo);

        Intent move=getIntent();

        final Owner owner= (Owner) move.getSerializableExtra("owner");

        if(owner==null)
            finish();

        String info=Integer.toString(owner.getNumofchalet());

        info =" "+ owner.getName()+" "+" owns" + " "+info +" Chalte/s";

        infoo.setText(info);


    }
}
