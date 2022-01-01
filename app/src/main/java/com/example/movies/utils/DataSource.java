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
        lstMovies.add(new Movie("Avenger Endgame",R.drawable.aendagame,R.drawable.aendagame2));
        lstMovies.add(new Movie("The Whicher",R.drawable.whicher,R.drawable.slide4));
        lstMovies.add(new Movie("DareDevil",R.drawable.daredevil,R.drawable.daredevil2));
        lstMovies.add(new Movie("Deadpool",R.drawable.deadpool,R.drawable.deadpool2));
        lstMovies.add(new Movie("The Defender",R.drawable.defender,R.drawable.defender2));
        lstMovies.add(new Movie("Doctor Strange",R.drawable.dstrange,R.drawable.dstrange2));
        lstMovies.add(new Movie("Eternals",R.drawable.eternals,R.drawable.eternals2));
        lstMovies.add(new Movie("Fast And Furious:H&S",R.drawable.fast,R.drawable.fast2));
        lstMovies.add(new Movie("Guardians Of Galaxy",R.drawable.gog,R.drawable.gog2));
        lstMovies.add(new Movie("Ironman 3",R.drawable.ironma3,R.drawable.slide2));
        lstMovies.add(new Movie("Avenger Infinity War",R.drawable.iwar,R.drawable.iwar2));
        lstMovies.add(new Movie("Spider Man-No Way Home",R.drawable.nowayhome,R.drawable.slide1));
        lstMovies.add(new Movie("Red Notice",R.drawable.red,R.drawable.slide3));
        lstMovies.add(new Movie("Shang-chi",R.drawable.shangchi,R.drawable.shangchi2));
        lstMovies.add(new Movie("Thor",R.drawable.thor,R.drawable.thor2));
        return lstMovies;
    }

    public  static List<Movie> getWeekMovies(){
        //recycler view setup
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Black Panther", R.drawable.bpanther,R.drawable.bpanthercover));
        lstMovies.add(new Movie("Thor",R.drawable.thor,R.drawable.thor2));
        lstMovies.add(new Movie("Shang-chi",R.drawable.shangchi,R.drawable.shangchi2));
        lstMovies.add(new Movie("Red Notice",R.drawable.red,R.drawable.slide3));
        lstMovies.add(new Movie("Spider Man-No Way Home",R.drawable.nowayhome,R.drawable.slide1));
        lstMovies.add(new Movie("Avenger Infinity War",R.drawable.iwar,R.drawable.iwar2));
        lstMovies.add(new Movie("Ironman 3",R.drawable.ironma3,R.drawable.slide2));
        lstMovies.add(new Movie("Guardians Of Galaxy",R.drawable.gog,R.drawable.gog2));
        lstMovies.add(new Movie("Fast And Furious:H&S",R.drawable.fast,R.drawable.fast2));
        lstMovies.add(new Movie("Eternals",R.drawable.eternals,R.drawable.eternals2));
        lstMovies.add(new Movie("Doctor Strange",R.drawable.dstrange,R.drawable.dstrange2));
        lstMovies.add(new Movie("Deadpool",R.drawable.deadpool,R.drawable.deadpool2));
        lstMovies.add(new Movie("The Whicher",R.drawable.whicher,R.drawable.slide4));
        lstMovies.add(new Movie("Avenger Endgame",R.drawable.aendagame,R.drawable.aendagame2));
        return lstMovies;
    }

}
