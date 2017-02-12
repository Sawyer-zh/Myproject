package com.example.zhang.test.singleton;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by zhang on 1/4/2017.
 */
public class Company {

    private ArrayList<Staff> mStaffList = new ArrayList<>();

    public void addStaff(Staff per){
        mStaffList.add(per);
    }

    public void showAllStaff(Context context){
        for (Staff per:mStaffList) {
            Toast.makeText(context, per.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
