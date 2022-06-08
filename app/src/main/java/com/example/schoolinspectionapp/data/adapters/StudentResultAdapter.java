package com.example.schoolinspectionapp.data.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolinspectionapp.R;
import com.example.schoolinspectionapp.ui.Student_Result_Details;

import java.util.ArrayList;

public class StudentResultAdapter extends RecyclerView.Adapter<StudentResultAdapter.StudentResultViewHolder> {
    Context context;
    ArrayList<String[]> result;
    public StudentResultAdapter(Context context, ArrayList<String[]> result) {
        this.context=context;
        this.result=result;
    }

    @NonNull
    @Override
    public StudentResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_student_result,parent,false);
        return new StudentResultViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentResultViewHolder holder, int position) {
        holder.yeartxt.setText(result.get(position)[0]);
        holder.classTxt.setText("Class: "+result.get(position)[1]+"th");
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public class StudentResultViewHolder extends RecyclerView.ViewHolder{
        TextView classTxt,yeartxt;
        public StudentResultViewHolder(@NonNull View itemView) {
            super(itemView);
            classTxt=itemView.findViewById(R.id.classTxt);
            yeartxt=itemView.findViewById(R.id.yeartxt);
        }
    }
}
