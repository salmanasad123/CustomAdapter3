package com.example.salman.customadapter3;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Salman on 10/1/2017.
 */

class UserAdapter extends ArrayAdapter<User> {

    Activity context;
    ArrayList<User> data;

    public UserAdapter(Activity context, ArrayList<User> data){
        super(context,R.layout.user_item_list, (List<User>) data);
        this.context=context;
        this.data=data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View v=LayoutInflater.from(getContext()).inflate(R.layout.user_item_list,parent,false);

        TextView tvUsername =(TextView) v.findViewById(R.id.tvUsername);
        TextView tvRollNumber = (TextView) v.findViewById(R.id.tvRollNumber);
        User u=getItem(position);
        tvUsername.setText(u.getUsername());
        tvRollNumber.setText(u.getRollnumber());


        return v;

    }
}
