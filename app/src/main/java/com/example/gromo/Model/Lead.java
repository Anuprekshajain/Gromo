package com.example.gromo.Model;

import com.example.gromo.R;

import java.util.ArrayList;

public class Lead {
    String name;
    String loan;
    String status;
    String leadId;
    int drawable;

    public Lead(String name, String loan, String status, String leadId, int drawable) {
        this.name = name;
        this.loan = loan;
        this.status = status;
        this.leadId = leadId;
        this.drawable = drawable;
    }

    public String getName() {
        return name;
    }

    public String getLoan() {
        return loan;
    }

    public String getStatus() {
        return status;
    }

    public String getLeadId() {
        return leadId;
    }

    public int getDrawable() {
        return drawable;
    }

    public static ArrayList<Lead> getData(){
        ArrayList<Lead> lead = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            lead.add(new Lead("Ajay Sharma", "Car loan", "Pending", "Lead-12345", R.drawable.ic_directions_car_black_24dp));
            lead.add(new Lead("Vijay Singh", "Education loan", "Approved", "Lead-12346", R.drawable.ic_school_black_24dp));
            lead.add(new Lead("Richa Seth", "Home loan", "Rejected", "Lead-12347", R.drawable.ic_home_black_24dp));
            lead.add(new Lead("Nishant Agrawal", "Two Wheeler loan", "New User", "Lead-123478", R.drawable.ic_directions_bike_black_24dp));
        }
        return lead;
    }
}
