package com.example.movies.adapters;

import android.widget.ImageView;

import com.example.movies.models.Movie;

public interface MovieItemClickListener {
    void onMovieClick(Movie movie, ImageView movieImageView);
}
