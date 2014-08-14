package com.example.volleyapp2;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ImageRecordsAdapter extends ArrayAdapter<ImageRecord> {
    public ImageRecordsAdapter(Context context) {
        super(context, R.layout.image_list_item);
    }
}
