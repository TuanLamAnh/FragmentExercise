package anhtuan.app.fragmentexercise;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuFrag extends ListFragment {
    String[] menus = {"Flowers", "Animals", "Foods"};
    ListView list;
    private AdapterView.OnItemClickListener onclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        }
    };

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.menu_frag, container, false);
        list = view.findViewById(android.R.id.list);
        ArrayAdapter<String> listadapter = new ArrayAdapter<String>(view.getContext(), R.layout.menu_layout,
                (new ArrayList<String>(Arrays.asList(menus))));
        list.setAdapter(listadapter);
        list.setOnItemClickListener(onclick);
        return view;
    }
    public interface IFragmentClickListener{
        public void onMenuItemClick(int position);
    }
    IFragmentClickListener itemfragment;
    @Override public void onAttach(Context context) {
        super.onAttach(context);
        try { itemfragment = (IFragmentClickListener) context; }
        catch(ClassCastException e){e.printStackTrace();}
    }
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        itemfragment.onMenuItemClick(position);
    }

}
