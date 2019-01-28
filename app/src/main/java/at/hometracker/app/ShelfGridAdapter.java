package at.hometracker.app;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import at.hometracker.R;
import at.hometracker.database.datamodel.Shelf;
import at.hometracker.utils.FileUtils;

public class ShelfGridAdapter extends BaseAdapter {
    private Context mContext;
    private List<Shelf> shelves;

    public ShelfGridAdapter(Context mContext, List<Shelf> shelves) {
        this.mContext = mContext;
        this.shelves = shelves;
    }

    @Override
    public int getCount() {
        return shelves.size();
    }

    @Override
    public Object getItem(int position) {
        return shelves.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View thumbnailView;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            thumbnailView = inflater.inflate(R.layout.single_shelf_preview, null);
        } else {
            thumbnailView = convertView;
        }

        Shelf shelf = shelves.get(position);
        Log.v("misc", "Creating view for: " + shelf);
        TextView textView = thumbnailView.findViewById(R.id.thumbnail_txt);
        ImageView imageView = thumbnailView.findViewById(R.id.thumbnail_img);
        textView.setText(shelf.name);
        FileUtils.setImageViewWithByteArray(imageView, shelf.picture);

        return thumbnailView;
    }



    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}