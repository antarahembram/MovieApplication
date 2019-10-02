package com.stackroute.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Movie {



    @Id
    @Column(name = "moveId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId=0;
    private String genere;
    private String movieTitle;
    private String language;
    private String status;
    private long voteCount;
    private BigDecimal budget;

    public Movie() {
    }

    public Movie( String genere, String movieTitle, String language, String status, long voteCount, BigDecimal budget) {
       // this.movieId = movieId;
        this.genere = genere;
        this.movieTitle = movieTitle;
        this.language = language;
        this.status = status;
        this.voteCount = voteCount;
        this.budget = budget;
    }

//    public Movie( Integer movieId,String genere, String movieTitle, String language, String status, long voteCount, BigDecimal budget) {
//         this.movieId = movieId;
//        this.genere = genere;
//        this.movieTitle = movieTitle;
//        this.language = language;
//        this.status = status;
//        this.voteCount = voteCount;
//        this.budget = budget;
//    }

    public int getMovieId() {
        return movieId;
    }

    public String getGenere() {
        return genere;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getLanguage() {
        return language;
    }

    public String getStatus() {
        return status;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", genere='" + genere + '\'' +
                ", movieTitle='" + movieTitle + '\'' +
                ", language='" + language + '\'' +
                ", status='" + status + '\'' +
                ", voteCount=" + voteCount +
                ", budget=" + budget +
                '}';
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVoteCount(long voteCount) {
        this.voteCount = voteCount;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}
