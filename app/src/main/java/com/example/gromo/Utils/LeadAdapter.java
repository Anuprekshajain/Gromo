package com.example.gromo.Utils;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gromo.Model.Lead;
import com.example.gromo.R;

import java.util.List;

public class LeadAdapter extends
    RecyclerView.Adapter<LeadAdapter.ViewHolder> {

    private List<Lead> leads;

    // Pass in the contact array into the constructor
    public LeadAdapter(List<Lead> leads) {
        this.leads = leads;
    }

    @Override
    public LeadAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.list_lead, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(LeadAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Lead lead = leads.get(position);
        viewHolder.name.setText(lead.getName());
        viewHolder.leadId.setText(lead.getLeadId());
        viewHolder.loan.setText(lead.getLoan());
        viewHolder.status.setText(lead.getStatus());
        viewHolder.icon.setImageResource(lead.getDrawable());
        switch(lead.getStatus()){
            case "Pending":
                viewHolder.status.setTextColor(Color.MAGENTA);
                break;
            case "Approved":
                viewHolder.status.setTextColor(Color.GREEN);
                break;
            case "Rejected":
                viewHolder.status.setTextColor(Color.RED);
                break;
            case "New User":
                viewHolder.status.setTextColor(Color.BLUE);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return leads.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView leadId;
        public TextView loan;
        public TextView status;
        public ImageView icon;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textViewName);
            leadId = itemView.findViewById(R.id.textViewLead);
            loan = itemView.findViewById(R.id.textViewLoan);
            status = itemView.findViewById(R.id.textViewstatus);
            icon = itemView.findViewById(R.id.icon);
        }
    }
}