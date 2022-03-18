package anhtuan.app.fragmentexercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ContentFrag extends Fragment {
    GridView gridview;


    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_frag, container, false);
        gridview = view.getRootView().findViewById(R.id.gridview);
        gridview.setOnItemClickListener(((adapterView, view1, i, l) -> {
            Intent intent = new Intent(getContext(),DetailPhotoActivity.class);
            intent.putExtra("id",gridview.getAdapter().getItemId(i));
            startActivity(intent);
        }));
        return view;
    }
    ArrayList<Photo> flowers = PhotoData.getPhotoByCat(PhotoData.Cat.FLOWERS);
    ArrayList<Photo> animals = PhotoData.getPhotoByCat(PhotoData.Cat.ANIMALS);
    ArrayList<Photo> foods = PhotoData.getPhotoByCat(PhotoData.Cat.FOODS);
    public void updateContent(int position){
        switch (position){
            case 0:
                gridview.setAdapter(new PhotoAdapter(getContext(),flowers));
                break;
            case 1:
                gridview.setAdapter(new PhotoAdapter(getContext(),animals));
                break;
            case 2:
                gridview.setAdapter(new PhotoAdapter(getContext(),foods));
                break;
        }
    }


}
