package com.example.schoolinspectionapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.data.adapters.AttendanceAdapter;
import com.example.schoolinspectionapp.data.models.AttendanceStaff;
import com.example.schoolinspectionapp.databinding.ActivityStaffAttendanceInspectionBinding;

import java.util.ArrayList;

public class Staff_Attendance_Inspection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         ActivityStaffAttendanceInspectionBinding activityStaffAttendanceInspectionBinding=
                DataBindingUtil.setContentView(this,R.layout.activity_staff_attendance_inspection);

       ArrayList<AttendanceStaff> arrayList2=new ArrayList<>();
       AttendanceStaff attendanceStaff=new AttendanceStaff("2410","Pradeep Katiyar","Principal","31-05-2022","1");
       AttendanceStaff attendanceStaff1=new AttendanceStaff("2411","Vijay Shukla","Teacher","31-05-2022","2");
       AttendanceStaff attendanceStaff2=new AttendanceStaff("2412","Radha Sharma","Teacher","31-05-2022","3");
       AttendanceStaff attendanceStaff3=new AttendanceStaff("2413","Nitendra Kumar","Teacher","31-05-2022","4");
       AttendanceStaff attendanceStaff4=new AttendanceStaff("2414","Nagendra Vishwkarma","Teacher","31-05-2022","1");
       AttendanceStaff attendanceStaff5=new AttendanceStaff("2415","Rajkumar Singh","Teacher","31-05-2022","5");
       AttendanceStaff attendanceStaff6=new AttendanceStaff("2416","Pankaj Kushwaha","Teacher","31-05-2022","1");
       AttendanceStaff attendanceStaff7=new AttendanceStaff("2417","Sumit Bharti","Peon","31-05-2022","6");
       AttendanceStaff attendanceStaff8=new AttendanceStaff("2418","Ravindra Katiyar","Teacher","31-05-2022","1");
       AttendanceStaff attendanceStaff9=new AttendanceStaff("2419","Satyendra Dubey","Teacher","31-05-2022","2");

       arrayList2.add(attendanceStaff);
       arrayList2.add(attendanceStaff1);
       arrayList2.add(attendanceStaff2);
       arrayList2.add(attendanceStaff3);
       arrayList2.add(attendanceStaff4);
       arrayList2.add(attendanceStaff5);
       arrayList2.add(attendanceStaff6);
       arrayList2.add(attendanceStaff7);
       arrayList2.add(attendanceStaff8);
       arrayList2.add(attendanceStaff9);
       activityStaffAttendanceInspectionBinding.recyclerViewStaffAttendance.setLayoutManager(new LinearLayoutManager(this));

        activityStaffAttendanceInspectionBinding.recyclerViewStaffAttendance.setAdapter(new AttendanceAdapter(Staff_Attendance_Inspection.this,arrayList2));
        activityStaffAttendanceInspectionBinding.recyclerViewStaffAttendance.getViewTreeObserver().addOnPreDrawListener(
                new ViewTreeObserver.OnPreDrawListener() {

                    @Override
                    public boolean onPreDraw() {
                        activityStaffAttendanceInspectionBinding.recyclerViewStaffAttendance.getViewTreeObserver().removeOnPreDrawListener(this);

                        for (int i = 0; i < activityStaffAttendanceInspectionBinding.recyclerViewStaffAttendance.getChildCount(); i++) {
                            View v = activityStaffAttendanceInspectionBinding.recyclerViewStaffAttendance.getChildAt(i);
                            v.setAlpha(0.0f);
                            v.animate().alpha(1.0f)
                                    .setDuration(800)
                                    .setStartDelay(i * 400)
                                    .start();
                        }

                        return true;
                    }
                });

    }
}