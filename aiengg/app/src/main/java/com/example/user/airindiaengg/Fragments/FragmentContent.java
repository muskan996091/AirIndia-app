package com.example.user.airindiaengg.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.airindiaengg.R;
import com.example.user.airindiaengg.home;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.util.zip.Inflater;

public class FragmentContent extends Fragment {

    private int[] mImages =new int[]{
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5
    };

    private String[] mImageTitle=new String[]{
            "Major maintenance",
            "Line maintenance",
            "Engine",
            "Landing gear",
            "Avionics"

    };

    //-------------------------------------------------------------------

    private static final String KEY_TITLE="Content";

    public FragmentContent() {
        // Required empty public constructor

    }


    public static FragmentContent newInstance(String param1) {
        FragmentContent fragment = new FragmentContent();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, param1);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //View view=getView();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        //----------------------------------------------
        return inflater.inflate(R.layout.fragment_fragment_content, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        //View view1 =  inflater.inflate(R.layout.fragment_fragment_content, container, false);
        CarouselView carouselView= view.findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });


        String title= getArguments().getString(KEY_TITLE);
        ((TextView)view.findViewById(R.id.title)).setText(title);


    }

}
