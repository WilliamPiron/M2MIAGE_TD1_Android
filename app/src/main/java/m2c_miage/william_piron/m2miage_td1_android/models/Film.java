package m2c_miage.william_piron.m2miage_td1_android.models;

import android.graphics.Bitmap;

public class Film {
    private Bitmap image;
    private String filmName;
    private String releaseDate;
    private String director;

    public Film(Bitmap image, String name, String releaseDate, String director) {
        this.image = image;
        this.filmName = name;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public Film() {
        image = null;
        filmName = "";
        releaseDate = "01-01-1900";
        director = "";
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String name) {
        this.filmName = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
