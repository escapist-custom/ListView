package com.example.homeworklistview.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.homeworklistview.Person;
import com.example.homeworklistview.R;

public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, Person[] arr) {
        super(context, R.layout.adapter_item, arr);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, null);
        }

        try {
            ((ImageView) convertView.findViewById(R.id.flag)).setImageResource(person.getFlag_res());
        } catch (NullPointerException e) {
            Log.i("MY_TAG", e.getMessage());
        }
        ((TextView) convertView.findViewById(R.id.money)).setText(person.getMoney());
        ((TextView) convertView.findViewById(R.id.name)).setText(person.getName());

        return convertView;
    }
}