package com.example.myapplication.MyGoalPost;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;

public class MyGoalPost extends Fragment {

    public String string;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_goal_post, container, false);
        textView = (TextView)view.findViewById(R.id.textview);
        textView.setText(string);

        return view;
    }
}