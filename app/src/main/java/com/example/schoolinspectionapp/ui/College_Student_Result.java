package com.example.schoolinspectionapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.data.adapters.StudentCollegeWiseResultAdapter;

import java.util.ArrayList;

public class College_Student_Result extends AppCompatActivity {
RecyclerView recyclerViewStudent_college_result;
StudentCollegeWiseResultAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_student_result);
        recyclerViewStudent_college_result=findViewById(R.id.recyclerViewStudent_college_result);
        recyclerViewStudent_college_result.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> classList=new ArrayList<>();
        classList.add("6");
        classList.add("7");
        classList.add("8");
        classList.add("9");
        classList.add("10");
        classList.add("11");
        classList.add("12");
        recyclerViewStudent_college_result.setAdapter(new StudentCollegeWiseResultAdapter(this,classList));

    }
}