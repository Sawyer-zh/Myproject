package com.example.zhang.test;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

import com.example.zhang.test.Builder.Builder;
import com.example.zhang.test.Builder.Director;
import com.example.zhang.test.Builder.MacBuilder;
import com.example.zhang.test.Prototype.WordDocument;
import com.example.zhang.test.Strategy.BusStrategy;
import com.example.zhang.test.Strategy.StrategyContext;
import com.example.zhang.test.singleton.Company;
import com.example.zhang.test.singleton.Staff;
import com.example.zhang.test.singleton.VP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onResume() {
        super.onResume();

        //test singleton
      /*  Company company = new Company();
        Staff ceo1 = CEO.getInstance();
        Staff ceo2 = CEO.getInstance();

        Staff vp1 = new VP();
        Staff vp2 = new VP();

        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        company.addStaff(ceo1);
        company.addStaff(ceo2);
        company.addStaff(vp1);
        company.addStaff(vp2);
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);

        company.showAllStaff(this);*/

        //test builder
     /*   Builder builder = new MacBuilder();

        Director director = new Director(builder);

        director.construct("Intel","Retina");

        Toast.makeText(this,builder.creater().toString(),Toast.LENGTH_LONG).show();

        //省略director 的链式调用
        builder.buildDisplay("AMd").buildBoard("IPS").creater();

        Toast.makeText(this,builder.buildDisplay("AMd").buildBoard("IPS").creater().toString(),Toast.LENGTH_LONG).show();*/

        //test prototype
        /*WordDocument wordDocument = new WordDocument();

        wordDocument.addImage("111");
        wordDocument.addImage("222");
        wordDocument.addImage("333");

        wordDocument.setmText("文字");

        wordDocument.showDoc();

        wordDocument.clone().showDoc();*/

        //strategy

//        int distance = 20;
//
//        StrategyContext strategyContext = new StrategyContext();
//        strategyContext.setmCalculateStrategy(new BusStrategy());
//        strategyContext.calculatePrice(distance);
    }
}
