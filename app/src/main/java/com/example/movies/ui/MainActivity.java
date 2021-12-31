package com.example.movies.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.movies.models.Movie;
import com.example.movies.adapters.MovieAdapter;
import com.example.movies.adapters.MovieItemClickListener;
import com.example.movies.R;
import com.example.movies.models.Slide;
import com.example.movies.adapters.SliderPagerAdapter;
import com.example.movies.utils.DataSource;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements MovieItemClickListener
{

    private List<Slide> lstslide;
    private ViewPager sliderpage;
    private TabLayout indicator;
    private RecyclerView MovieRv,rvMoviesWeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         iniViews();
         iniSlider();
         iniPopularMovies();
         iniWeekMovies();
    }

    private void iniWeekMovies() {

        MovieAdapter weekMovieAdapter = new MovieAdapter(this,DataSource.getWeekMovies(),this);
        rvMoviesWeek.setAdapter(weekMovieAdapter);
        rvMoviesWeek.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void iniPopularMovies(){
        //recycler view setup


        MovieAdapter movieAdapter = new MovieAdapter(this, DataSource.getPopularMovies(),this);
        MovieRv.setAdapter(movieAdapter);
        MovieRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void iniSlider(){
        lstslide = new ArrayList<>();
        lstslide.add(new Slide(R.drawable.slide1,"SpiderMan-No Way Home"));
        lstslide.add(new Slide(R.drawable.slide2,"IronMan"));
        lstslide.add(new Slide(R.drawable.slide3,"Red Notice"));
        lstslide.add(new Slide(R.drawable.slide4,"The Whicher"));

        SliderPagerAdapter adapter = new SliderPagerAdapter(this,lstslide);

        sliderpage.setAdapter(adapter);

        //setup time
        Timer timer= new Timer();
        timer.scheduleAtFixedRate(new MainActivity.SliderTimer(),3500,3500);
        indicator.setupWithViewPager(sliderpage,true);
    }

    private void iniViews(){
        sliderpage = findViewById(R.id.sliderPager);
        indicator = findViewById(R.id.indicator);
        MovieRv = findViewById(R.id.rvMovies);
        rvMoviesWeek = findViewById(R.id.rvMoviesWeek);
    }

    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {
        //send movie Information to detail activity
        //create transition animation between the two activity

        Intent intent= new Intent(this, MovieDetailActivity.class);
        //send movie Information to the detailActivity
        intent.putExtra("title",movie.getTitle());
        intent.putExtra("imgURL",movie.getThumbnail());
        intent.putExtra("imgCover",movie.getCoverphoto());
        startActivity(intent);

        //create Animation
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,movieImageView,"sharedName");

        startActivity(intent,options.toBundle());

        Toast.makeText(this,"item clicked "+ movie.getTitle(), Toast.LENGTH_SHORT).show();

    }

    class SliderTimer extends TimerTask {

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (sliderpage.getCurrentItem()<lstslide.size()-1)
                    {
                        sliderpage.setCurrentItem(sliderpage.getCurrentItem()+1);
                    }
                    else {
                        sliderpage.setCurrentItem(0);
                    }
                }
            });
        }
    }
}