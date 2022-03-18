package anhtuan.app.fragmentexercise;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PhotoAdapter extends BaseAdapter {
    private final ArrayList<Photo> photo_list;
    private final Context context;

    public PhotoAdapter(Context context, ArrayList<Photo> photo_list) {
        this.photo_list = photo_list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return photo_list.size();
    }

    @Override
    public Object getItem(int position) {
        return photo_list.get(position).getSource_photo();
    }

    @Override
    public long getItemId(int position) {
        return photo_list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView view = (ImageView) convertView;
        if(null == convertView){
            view = new ImageView(context);
        }
        String url = (String) getItem(position);

        Picasso.get()
                .load(url)
                .resize(1000, 1000)
                .into(view);
        return view;
    }
}