package com.example.todo22new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private FloatingActionButton addFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list_fragment);

        listView = findViewById(R.id.list_view);

        CustomAdapter adapter = new CustomAdapter(this, getTodo());
        listView.setAdapter(adapter);


        // Add a new entry when clicking the FAB button
        addFab = findViewById(R.id.floatingActionButton);
        addFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Create new entry", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private ArrayList<Todo> getTodo() {
        Todo todo1 = new Todo();
        todo1.setName("Todo 1");
        todo1.setChecked(true);

        Todo todo2 = new Todo();
        todo1.setName("Todo 2");
        todo1.setChecked(true);

        Todo todo3 = new Todo();
        todo1.setName("Todo 3");
        todo1.setChecked(true);

        Todo todo4 = new Todo();
        todo1.setName("Todo 4");
        todo1.setChecked(true);

        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(todo1);
        todoList.add(todo2);
        todoList.add(todo3);
        todoList.add(todo4);

        return todoList;
    }
}