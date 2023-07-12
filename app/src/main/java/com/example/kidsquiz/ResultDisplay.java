package com.example.kidsquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ResultDisplay extends Fragment {

    ListView mylistView;
    DBHelper db;
    public ResultDisplay() {
        // Required empty public constructor
    }

   // @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_result_display, container, false);
        db = new DBHelper(getActivity().getApplicationContext());
        mylistView = view.findViewById(R.id.mylistView);


        MyViewAdapter adapter = new MyViewAdapter(getActivity().getApplicationContext(), db.displayResult());
        mylistView.setAdapter(adapter);


        return view;
    }
}