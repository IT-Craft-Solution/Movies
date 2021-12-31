package com.example.movies.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.movies.R;
import com.example.movies.models.Slide;

import java.util.List;

public class SliderPagerAdapter extends PagerAdapter {

    private Context mcontext;
    private List<Slide> mlist;


    public SliderPagerAdapter(Context mcontext, List<Slide> mlist) {
        this.mcontext = mcontext;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater= (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slideLayout = inflater.inflate(R.layout.slide_item,null);

        ImageView slideimg = slideLayout.findViewById(R.id.slideImage);
        TextView slidetext = slideLayout.findViewById(R.id.slideTitle);
        slideimg.setImageResource(mlist.get(position).getImage());
        slidetext.setText(mlist.get(position).getTitle());

        container.addView(slideLayout);
        return slideLayout;

    }

    @Override
    public int getCount() {
        return mlist.size();
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
