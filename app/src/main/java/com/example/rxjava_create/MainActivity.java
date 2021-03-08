package com.example.rxjava_create;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModel;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        prepareObservables();

        makeToast("<< Observables are visible in Terminal >>");


    }

    private void makeToast(String message) {

        Toast.makeText(this , message , Toast.LENGTH_SHORT).show();
    }

    private void prepareObservables() {

        mainViewModel.prepareObserVable(addTasks());
    }

    public List<Task> addTasks() {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Study English" , 5 , false));
        tasks.add(new Task("Do Mathematical Exercises" , 4 , false));
        tasks.add(new Task("Enroll in English Exam" , 5 , true));

        return tasks;
    }
}