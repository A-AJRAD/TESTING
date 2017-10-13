package com.example.ar_17_6_17.test21;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AR-17-6-17 on 12/10/17.
 */

public class ChaletAdapter extends ArrayAdapter<Owner> {

    public ChaletAdapter(Activity context, ArrayList<Owner> chalets){
        super(context,0,chalets);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
       if(listItemView == null)
            listItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chalet_list_item, parent, false);

        Owner chalet = getItem(position);

        TextView chaletName = (TextView) listItemView.findViewById(R.id.chaletName);
        chaletName.setText(chalet.getName());
        //  TextView chaletRating = (TextView) listItemView.findViewById(R.id.chaletRating);
        //chaletRating.setText(""+chalet.getChaletRating());
        TextView chaletLocation = (TextView) listItemView.findViewById(R.id.chaletLocation);
        String num= Integer.toString(chalet.getNumofchalet());
        num="This Owner own"+" "+ num +" "+ "Chalet/s";
        chaletLocation.setText(num);

        return listItemView;

    }
}
