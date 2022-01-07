package com.example.messagelistener;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<MessageDataHolder> {
    int resource;
    Context context;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<MessageDataHolder> objects) {
        super(context, resource, objects);
        this.resource=resource;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource,null);

        MessageDataHolder messageDataHolder = getItem(position);
        TextView txt_from = convertView.findViewById(R.id.txt_from);
        TextView txt_msg = convertView.findViewById(R.id.txt_msg);
        txt_msg.setText(messageDataHolder.getMessage());
        txt_from.setText(messageDataHolder.getFrom());

        return convertView;
    }
}
