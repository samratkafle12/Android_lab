package com.example.mydbms2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private DBAdapter db;
    private Button bt_add;
    private EditText et_name;
    private EditText et_number;
    private EditText et_class;
    private ListView listview;
    private Student student;
    private int position;
    private SimpleAdapter simpleAdapter;
    Map<String, Object> item = new HashMap<String, Object>();
    private List<Map<String, Object>> Datas = new ArrayList<Map<String, Object>>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_add = (Button) findViewById(R.id.bt_add);
        et_name = (EditText) findViewById(R.id.et_name);
        et_number = (EditText) findViewById(R.id.et_number);
        et_class = (EditText) findViewById(R.id.et_class);
        listview = findViewById(R.id.listview);
        this.registerForContextMenu(listview);

        db = new DBAdapter(MainActivity.this);
        db.open();

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cl = et_class.getText().toString();
                String num = et_number.getText().toString();
                String na = et_name.getText().toString();
                student = new Student(cl, num, na);
                long colunm = db.insert(student);

                Datas.clear();
                display();
                Toast.makeText(MainActivity.this, "Added Successful", Toast.LENGTH_SHORT).show();
            }
        });

        display();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo
            menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 1, 0, "Delete");

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        position = info.position;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int pos = (int) listview.getAdapter().getItemId(menuInfo.position);

        Map<String, Object> stu = Datas.get(pos);
        switch (item.getItemId()) {
            case 1:
                db.deleteOneData((Integer) stu.get("id"));
                Datas.remove(pos);
                simpleAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "ID:" + stu.get("id") + "Delete Successful", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onContextItemSelected(item);
    }

    public void display() {

        String[] from = {"id", "class", "number", "name"};

        int[] to = {R.id.tv_id, R.id.tv_class, R.id.tv_number, R.id.tv_name};

        simpleAdapter = new SimpleAdapter(this, Datas, R.layout.item_view, from, to);
        listview.setAdapter(simpleAdapter);
        Student[] students = db.queryAllData();
        if (students == null) {
            return;
        }

        String cl;
        String num;
        String na;
        int id;
        for (int i = 0; i < students.length; i++) {
            cl = students[i].getClas();
            num = students[i].getNumber();
            na = students[i].getName();
            id = students[i].getID();
            //Toast.makeText(MainActivity.this,cl+num+na,Toast.LENGTH_SHORT).show();
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("id", id);
            item.put("class", cl);
            item.put("number", num);
            item.put("name", na);
            Datas.add(item);
            simpleAdapter.notifyDataSetChanged();
        }



    }
}