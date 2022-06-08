package com.example.schoolinspectionapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.data.adapters.StudentResultAdapter;

import java.util.ArrayList;

public class Student_Result_Details extends AppCompatActivity {
RecyclerView recyclerViewFOrStudentResult;
StudentResultAdapter adapter;
ArrayList<String[]> result=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_result_details);
        recyclerViewFOrStudentResult=findViewById(R.id.recyclerViewFOrStudentResult);
        result.add(new String[]{"2020", "10"});
        result.add(new String[]{"2020", "12"});
        result.add(new String[]{"2021", "10"});
        result.add(new String[]{"2021", "12"});
        result.add(new String[]{"2022", "10"});
        result.add(new String[]{"2022", "12"});

        recyclerViewFOrStudentResult.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFOrStudentResult.setAdapter(new StudentResultAdapter(this,result));


    }
}