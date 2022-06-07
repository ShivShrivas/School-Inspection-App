package com.example.schoolinspectionapp.data.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.data.models.AttendanceStaff;
import com.example.schoolinspectionapp.ui.Staff_Attendance_Inspection;

import java.util.ArrayList;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder> {
    Context context;
    ArrayList<AttendanceStaff> arrayList;
    public AttendanceAdapter(Context context, ArrayList<AttendanceStaff> arrayList) {
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public AttendanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recview_attendance_card,parent,false);
        return new AttendanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttendanceViewHolder holder, int position) {
        holder.staffname.setText(arrayList.get(position).getStaffName());
        holder.staffDeg.setText(arrayList.get(position).getStaffDesignation());
        holder.textView5.setText(String.valueOf(position+1));

        try{
            if (arrayList.get(position).getAttendenceStatusID().equals("1")){
                holder.editGrantUnderScheme.setText("Present");
                holder.editGrantUnderScheme.setTextColor(context.getResources().getColor(R.color.green));
            }else if (arrayList.get(position).getAttendenceStatusID().equals("2")){
                holder.editGrantUnderScheme.setText("Absent");
                holder.editGrantUnderScheme.setTextColor(context.getResources().getColor(R.color.red));

            }else if (arrayList.get(position).getAttendenceStatusID().equals("3")){
                holder.editGrantUnderScheme.setText("Leave");
                holder.editGrantUnderScheme.setTextColor(context.getResources().getColor(R.color.blue));
            }else if (arrayList.get(position).getAttendenceStatusID().equals("4")){
                holder.editGrantUnderScheme.setText("Transfer");
                holder.editGrantUnderScheme.setTextColor(context.getResources().getColor(R.color.aqua));
            }else if (arrayList.get(position).getAttendenceStatusID().equals("5")){
                holder.editGrantUnderScheme.setText("Retire");
                holder.editGrantUnderScheme.setTextColor(context.getResources().getColor(R.color.cyan));
            }else if (arrayList.get(position).getAttendenceStatusID().equals("6")){
                holder.editGrantUnderScheme.setText("Removal");
                holder.editGrantUnderScheme.setTextColor(context.getResources().getColor(R.color.gray));
            }
        }catch (Exception e){
            holder.editGrantUnderScheme.setText("Not Taken");
            holder.editGrantUnderScheme.setTextColor(context.getResources().getColor(R.color.purple_700));

        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class AttendanceViewHolder extends RecyclerView.ViewHolder{
        Spinner spinnerGrantUnderScheme;
        TextView editGrantUnderScheme;
        ArrayAdapter<String> arrayAdapter1;
        TextView staffname,staffDeg,textView5;
        public AttendanceViewHolder(@NonNull View itemView) {
            super(itemView);

            spinnerGrantUnderScheme= itemView.findViewById(R.id.spinnerGrantUnderScheme);
            staffDeg=itemView.findViewById(R.id.staffDeg);
            staffname=itemView.findViewById(R.id.staffname);
            editGrantUnderScheme=itemView.findViewById(R.id.editGrantUnderScheme);
            textView5=itemView.findViewById(R.id.textView5);
            ArrayList<String> arrayListLevellingStatus=new ArrayList<>();
            arrayListLevellingStatus.add("Present");
            arrayListLevellingStatus.add("Absent");
            arrayListLevellingStatus.add("Leave");
            arrayListLevellingStatus.add("Retire");
            arrayListLevellingStatus.add("Removal");

            arrayAdapter1=new ArrayAdapter(context, android.R.layout.simple_spinner_item,arrayListLevellingStatus);
            arrayAdapter1.setDropDownViewResource(R.layout.custom_text_spiiner);
            spinnerGrantUnderScheme.setAdapter(arrayAdapter1);

        }
    }
}
