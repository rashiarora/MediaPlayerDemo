package com.rashi.mediaplayerdemo;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 28-03-2017.
 */

public class FilesAdapter extends ArrayAdapter<FilesBean> {
    Context context;
    int resource;
    ArrayList<FilesBean> fileList;

    public FilesAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<FilesBean> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        fileList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;
        view = LayoutInflater.from(context).inflate(resource,parent,false);

        ImageView image = (ImageView)view.findViewById(R.id.imageView);
        TextView txtTitle = (TextView)view.findViewById(R.id.textViewTitle);

        FilesBean fb = fileList.get(position);

        image.setBackgroundResource(fb.getImage());
        txtTitle.setText(fb.getTitle());

        return view;

    }
}
