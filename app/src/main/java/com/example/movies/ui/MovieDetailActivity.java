package com.example.movies.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.movies.R;
import com.example.movies.adapters.CastAdapter;
import com.example.movies.models.Cast;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MovieDetailActivity extends AppCompatActivity {

    private ImageView MovieThumbnailImg,MovieCoverImg;
    private TextView tvTitle,tvDescription;
    private FloatingActionButton play_fab;
    private RecyclerView Rvcast;
    private CastAdapter castAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        iniView();

        //setup list cast
        setupRvCast();


    }

    void iniView(){
        Rvcast = findViewById(R.id.rvCast);
        play_fab = findViewById(R.id.playFab);
        String movieTitle = getIntent().getExtras().getString("title");
        int imageResourced = getIntent().getExtras().getInt("imgURL");
        int imageCover = getIntent().getExtras().getInt("imgCover");
        MovieThumbnailImg = findViewById(R.id.detailMovieImg);
        Glide.with(this).load(imageResourced).into(MovieThumbnailImg);
        MovieThumbnailImg.setImageResource(imageResourced);
        MovieCoverImg = findViewById(R.id.detailMovieCover);
        Glide.with(this).load(imageCover).into(MovieCoverImg);
        tvTitle = findViewById(R.id.detailMovieTitle);
        tvTitle.setText(movieTitle);
        getSupportActionBar().setTitle(movieTitle);
        tvDescription = findViewById(R.id.detailMovieDesc);

        //setup Animation
        MovieCoverImg.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));
        play_fab.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));
    }

    void setupRvCast(){
        List<Cast> mData = new ArrayList<>();
        mData.add(new Cast("Chadwick",R.drawable.chadwick));
        mData.add(new Cast("Michael",R.drawable.michael));
        mData.add(new Cast("Letitia",R.drawable.letitia));
        mData.add(new Cast("Lupita",R.drawable.lupita));

        castAdapter = new CastAdapter(this,mData);
        Rvcast.setAdapter(castAdapter);

        Rvcast.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}