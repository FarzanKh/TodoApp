package com.example.todo22new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list_fragment);

        listView = findViewById(R.id.list_view);

        CustomAdapter adapter = new CustomAdapter(this, getTodo());
        listView.setAdapter(adapter);

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