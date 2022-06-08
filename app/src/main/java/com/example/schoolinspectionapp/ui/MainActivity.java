package com.example.schoolinspectionapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.staffSanctionAndWorking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,Staff_Sanction_and_Working.class));
            }
        });

        activityMainBinding.staffTraningDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,All_Staff_Traing_Details.class));
            }
        });
        activityMainBinding.attendanceInspection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Staff_Attendance_Inspection.class));
            }
        });

        activityMainBinding.attendanceStudentprescense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Student_Presence.class));
            }
        });

        activityMainBinding.attendanceStudentResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Student_Result_Details.class));
            }
        });

        activityMainBinding.campusBeautification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Campusbutification.class));
            }
        });


        activityMainBinding.otherActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ExtraActivityDetails.class));
            }
        });

        activityMainBinding.attendanceStudentResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Student_Result_Details.class));
            }
        });


        activityMainBinding.CollegeWiseStudentResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,College_Student_Result.class));
            }
        });
    }
}