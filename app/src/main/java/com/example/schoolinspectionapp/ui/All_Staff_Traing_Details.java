package com.example.schoolinspectionapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.data.adapters.StaffTrainingAdapter;
import com.example.schoolinspectionapp.databinding.ActivityAllStaffTraingDetailsBinding;

import java.util.ArrayList;

public class All_Staff_Traing_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityAllStaffTraingDetailsBinding activityAllStaffTraingDetailsBinding= DataBindingUtil.setContentView(this, R.layout.activity_all_staff_traing_details);
        activityAllStaffTraingDetailsBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        activityAllStaffTraingDetailsBinding.recyclerView2.setLayoutManager(new LinearLayoutManager(this){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");

        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");


        activityAllStaffTraingDetailsBinding.recyclerView.setAdapter(new StaffTrainingAdapter(All_Staff_Traing_Details.this,arrayList));
        activityAllStaffTraingDetailsBinding.recyclerView2.setAdapter(new StaffTrainingAdapter(All_Staff_Traing_Details.this,arrayList2));
    }
}