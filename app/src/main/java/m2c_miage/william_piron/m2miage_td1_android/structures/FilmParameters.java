package m2c_miage.william_piron.m2miage_td1_android.structures;

import android.graphics.Bitmap;

import m2c_miage.william_piron.m2miage_td1_android.adapter.FilmAdapter;
import m2c_miage.william_piron.m2miage_td1_android.models.Film;

public class FilmParameters {
    Film film;
    String url;
    FilmAdapter adapter;

    public FilmParameters(Film film, String url, FilmAdapter adapter) {
        this.film = film;
        this.url = url;
        this.adapter = adapter;
    }

    public Film getFilm() {
        return film;
    }

    public String getUrl() {
        return url;
    }

    public FilmAdapter getAdapter() {
        return adapter;
    }

    public void setImage(Bitmap bitmap){
        film.setImage(bitmap);
    }
}
