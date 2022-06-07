package com.example.schoolinspectionapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.data.adapters.Student_PresenceAdapter;
import com.example.schoolinspectionapp.databinding.ActivityStudentPresenceBinding;

import java.util.ArrayList;

public class Student_Presence extends AppCompatActivity {

Student_PresenceAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityStudentPresenceBinding activityStudentPresenceBinding= DataBindingUtil.setContentView(this,R.layout.activity_student_presence);
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");

        adapter=new Student_PresenceAdapter(this,arrayList2);
        activityStudentPresenceBinding.recyclerViewStudentpresence.setLayoutManager(new LinearLayoutManager(this));
        activityStudentPresenceBinding.recyclerViewStudentpresence.setAdapter(adapter);

    }
}