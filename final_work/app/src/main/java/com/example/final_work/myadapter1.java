package com.example.final_work;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class myadapter1 extends RecyclerView.Adapter {

    ArrayList<mid> pArray;
    Context c;

    public myadapter1(ArrayList<mid> pArray, Context c) {
        this.pArray = pArray;
        this.c = c;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mid_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).midname.setText(pArray.get(position).getName());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c, details.class);
                i.putExtra("mid", pArray.get(position));
                c.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

   public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView midname;

       public View view;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           view =itemView;
           midname =itemView.findViewById(R.id.textView);


       }
   }
}



