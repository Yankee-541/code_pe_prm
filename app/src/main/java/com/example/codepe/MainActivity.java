package com.example.codepe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.codepe.DOB.DataHelper;

public class MainActivity extends AppCompatActivity {

    LinearLayout list;
    Button btAdd, btUpdate, btDelete, btList;
    EditText txtId, txtName, txtDOB, txtCore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAdd = findViewById(R.id.btAdd);
        btUpdate = findViewById(R.id.btUpdate);
        btDelete = findViewById(R.id.btDelete);
        btList = findViewById(R.id.btList);
        list = findViewById(R.id.list);
        txtId = findViewById(R.id.txtId);
        txtName = findViewById(R.id.txtName);
        txtDOB = findViewById(R.id.txtDOB);
        txtCore = findViewById(R.id.txtCore);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataHelper db = new DataHelper(MainActivity.this);
                db.addStudent(txtName.getText().toString().trim(),txtDOB.getText().toString().trim(),txtCore.getText().toString().trim());
            }
        });

    }



}