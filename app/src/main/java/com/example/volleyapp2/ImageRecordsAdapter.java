package com.example.volleyapp2;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class ImageRecordsAdapter extends ArrayAdapter<ImageRecord> {
    public ImageRecordsAdapter(Context context, List<ImageRecord> objects) {
        super(context, R.layout.image_list_item, objects);
    }
}
