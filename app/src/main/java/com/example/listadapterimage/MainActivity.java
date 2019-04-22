package com.example.listadapterimage;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES={R.drawable.dali,R.drawable.emploie,R.drawable.logo,R.drawable.oursql,R.drawable.placeholder,
            R.drawable.pray,R.drawable.roman};
    String[] NAMES={"Dali","mouti","ahmed","wafa","sarra","nada","rafik"};
    String[] PRENOMS={"Bellili","ben abeda","Aouida","Mbarek","ben slimen","nada","hechmi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        CustomeAdapter customeAdapter = new CustomeAdapter();
        listView.setAdapter(customeAdapter);

    }
    class CustomeAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);

            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_prenom=(TextView)view.findViewById(R.id.textView_prenom);

            imageView.setImageResource(IMAGES[i]);

            textView_name.setText(NAMES[i]);
            textView_prenom.setText(PRENOMS[i]);

            return view;
        }
    }



    }

