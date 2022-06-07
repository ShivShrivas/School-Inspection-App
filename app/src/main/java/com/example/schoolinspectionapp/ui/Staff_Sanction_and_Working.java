package com.example.schoolinspectionapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.databinding.ActivityStaffSanctionAndWorkingBinding;

public class Staff_Sanction_and_Working extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityStaffSanctionAndWorkingBinding activityStaffSanctionAndWorkingBinding= DataBindingUtil.setContentView(this, R.layout.activity_staff_sanction_and_working);

    }
}