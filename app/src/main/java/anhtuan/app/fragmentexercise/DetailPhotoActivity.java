package anhtuan.app.fragmentexercise;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetailPhotoActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_layout);
        imageView = findViewById(R.id.image);
        int id = (int) getIntent().getLongExtra("id",0);
        Picasso.get().load((PhotoData.getPhotoFromId(id).getSource_photo())).resize(1800,1800).centerCrop().into(imageView);
    }
}
