package com.example.salman.customadapter3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = (ListView) findViewById(R.id.listView);
        //Data Source

        ArrayList<User> arrayList = new ArrayList<User>();
        arrayList.add(new User(1,"u1","r1","n1"));
        for (int i=1;i<100;i++){

            arrayList.add(new User(i+1, "u"+ i, "r"+ i,"n" +i));
        }

        UserAdapter userAdapter = new UserAdapter(MainActivity.this,arrayList);
        l.setAdapter(userAdapter);






    }
}
