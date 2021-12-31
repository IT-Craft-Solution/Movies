package com.example.movies.utils;

import com.example.movies.R;
import com.example.movies.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<Movie> getPopularMovies(){

        //recycler view setup
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Black Panther", R.drawable.bpanther,R.drawable.bpanthercover));
        lstMovies.add(new Movie("Avenger Endgame",R.drawable.aendagame));
        lstMovies.add(new Movie("The Whicher",R.drawable.whicher));
        lstMovies.add(new Movie("DareDevil",R.drawable.daredevil));
        lstMovies.add(new Movie("Deadpool",R.drawable.deadpool));
        lstMovies.add(new Movie("The Defender",R.drawable.defender));
        lstMovies.add(new Movie("Doctor Strange",R.drawable.dstrange));
        lstMovies.add(new Movie("Eternals",R.drawable.eternals));
        lstMovies.add(new Movie("Fast And Furious:H&S",R.drawable.fast));
        lstMovies.add(new Movie("Guardians Of Galaxy",R.drawable.gog));
        lstMovies.add(new Movie("Ironman 3",R.drawable.ironma3));
        lstMovies.add(new Movie("Avenger Infinity War",R.drawable.iwar));
        lstMovies.add(new Movie("Spider Man-No Way Home",R.drawable.nowayhome));
        lstMovies.add(new Movie("Red Notice",R.drawable.red));
        lstMovies.add(new Movie("Shang-chi",R.drawable.shangchi));
        lstMovies.add(new Movie("Thor",R.drawable.thor));
        return lstMovies;
    }

    public  static List<Movie> getWeekMovies(){
        //recycler view setup
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Black Panther", R.drawable.bpanther,R.drawable.bpanthercover));
        lstMovies.add(new Movie("Avenger Endgame",R.drawable.aendagame,R.drawable.slide1));
        lstMovies.add(new Movie("The Whicher",R.drawable.whicher,R.drawable.slide4));
        lstMovies.add(new Movie("DareDevil",R.drawable.daredevil));
        lstMovies.add(new Movie("Deadpool",R.drawable.deadpool));
        lstMovies.add(new Movie("The Defender",R.drawable.defender));
        lstMovies.add(new Movie("Doctor Strange",R.drawable.dstrange));
        lstMovies.add(new Movie("Eternals",R.drawable.eternals));
        lstMovies.add(new Movie("Fast And Furious:H&S",R.drawable.fast));
        lstMovies.add(new Movie("Guardians Of Galaxy",R.drawable.gog));
        lstMovies.add(new Movie("Ironman 3",R.drawable.ironma3,R.drawable.slide2
        ));
        lstMovies.add(new Movie("Avenger Infinity War",R.drawable.iwar));
        lstMovies.add(new Movie("Spider Man-No Way Home",R.drawable.nowayhome));
        lstMovies.add(new Movie("Red Notice",R.drawable.red,R.drawable.slide3));
        lstMovies.add(new Movie("Shang-chi",R.drawable.shangchi));
        lstMovies.add(new Movie("Thor",R.drawable.thor));
        return lstMovies;
    }

}
