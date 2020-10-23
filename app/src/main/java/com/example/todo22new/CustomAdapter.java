package com.example.todo22new;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.widget.LinearLayoutCompat;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Todo> todo;

    public CustomAdapter(Context context, ArrayList<Todo> todo) {
        this.context = context;
        this.todo = todo;

    }


    @Override
    public int getCount() {
        if (todo != null && todo.size() > 0) {
            return todo.size();
        } else {
            return 0;
        }

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return todo.get(position);
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.todo_list, viewGroup, false);
        }

//        LinearLayoutCompat mainTodoLayout = view.findViewById(R.id.mainTodoLayout);


        TextView txtTodo = view.findViewById(R.id.item_text);
        CheckBox checkBox = view.findViewById(R.id.item_checkbox);

        txtTodo.setText("Todo" + todo.get(position).getName());
        checkBox.setChecked(false);

        return view;
    }
}
