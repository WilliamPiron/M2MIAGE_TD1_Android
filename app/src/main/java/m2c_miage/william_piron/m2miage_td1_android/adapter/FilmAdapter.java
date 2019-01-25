package m2c_miage.william_piron.m2miage_td1_android.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

import m2c_miage.william_piron.m2miage_td1_android.models.Film;
import m2c_miage.william_piron.m2miage_td1_android.R;

public class FilmAdapter extends ArrayAdapter<Film> {

    public FilmAdapter(@NonNull Context context, @NonNull List<Film> listeFilms) {
        super(context, R.layout.activity_list_films, listeFilms);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        Film f = (Film) getItem(position);

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_films, parent, false);
        }

        LinearLayout layout = view.findViewById(R.id.linearlayout_filmView);
        ImageView image = view.findViewById(R.id.imageView_film);
        TextView name = view.findViewById(R.id.text_filmName_display);
        TextView releaseDate = view.findViewById(R.id.text_releaseDate_display);
        TextView director = view.findViewById(R.id.text_director_display);

        name.setText(f.getFilmName());
        releaseDate.setText(f.getReleaseDate());
        director.setText(f.getDirector());

        return view;

    }
}
