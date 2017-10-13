package com.example.ar_17_6_17.test21;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OwnersList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owners_list);


        final ArrayList<Owner> chalets= new ArrayList<>();
        chalets.add(new Owner("Abo jammel" , 2));
        chalets.add(new Owner("Abo Malki" , 1));
        chalets.add(new Owner("Abo kHonin" , 1));
        chalets.add(new Owner("Abo Sadh" , 2));

        ChaletAdapter adapter = new ChaletAdapter(this,chalets);
        ListView listView= (ListView) findViewById(R.id.chalet_list);
       listView.setAdapter(adapter);





       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Toast.makeText(getApplicationContext(), " Hi" , Toast.LENGTH_SHORT).show();
               Owner c=chalets.get(i);
               Intent move =new Intent(OwnersList.this , OwnerInfo.class);
               move.putExtra("owner" , c);

               startActivity(move);






           }
       });




    }
}
