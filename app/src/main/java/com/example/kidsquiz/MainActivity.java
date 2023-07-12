package com.example.kidsquiz;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Fragment {

    Button btnOne, btnTwo, btnThree;
   // DBHelper db;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    //List<Question> list = new ArrayList<Question>();

    public MainActivity(){}

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main, container, false);
        btnOne = view.findViewById(R.id.startButton);
        //btnTwo = view.findViewById(R.id.resultbtn);
       // db = new DBHelper(getContext().getApplicationContext());


        /*btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.clearDB();
                FRExam fragmentOne = new FRExam();
                FragmentTransaction transaction =getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();
            }
        });*/

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultDisplay fragmentOne = new ResultDisplay();
                FragmentTransaction transaction =getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();


            }
        });


        return view;

    }


}
