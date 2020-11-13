package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class EmployeeHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);
        Bundle extras =getIntent().getExtras();
        String[] temp = extras.getString("data").split("~~");
        ListView child = findViewById(R.id.child);
        ArrayAdapter<String> employeeData = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,temp){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the current item from ListView
                View view = super.getView(position,convertView,parent);
                if(position %2 == 1)
                {
                    // Set a background color for ListView regular row/item
                    view.setBackgroundResource(R.color.white);
                }
                else
                {
                    // Set the background color for alternate row/item
                    view.setBackgroundResource(R.color.lightblue);
                }
                return view;
            }
        };
        child.setAdapter(employeeData);
        Integer size = temp.length;
        Log.v("datasent",size.toString());
    }
}