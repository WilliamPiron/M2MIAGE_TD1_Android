package m2c_miage.william_piron.m2miage_td1_android.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import m2c_miage.william_piron.m2miage_td1_android.R;
import m2c_miage.william_piron.m2miage_td1_android.adapter.FilmAdapter;
import m2c_miage.william_piron.m2miage_td1_android.structures.FilmParameters;
import m2c_miage.william_piron.m2miage_td1_android.thread.GetImageTask;

public class MainActivity extends AppCompatActivity {

    private String imgUrl = "http://lorempixel.com/200/200";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewFilms = findViewById(R.id.list_films);
        Button button_reload = findViewById(R.id.button_reload);
        Button button_add = findViewById(R.id.button_add);

        final ArrayList<Film> listeFilms = new ArrayList<Film>();
        for (int i = 0; i<10; i++){
            listeFilms.add(new Film());
        }

        final FilmAdapter filmAdapter = new FilmAdapter(this, listeFilms);
        listViewFilms.setAdapter(filmAdapter);

        button_reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Film tmpfilm: listeFilms) {
                    new GetImageTask(filmAdapter).execute(new FilmParameters(tmpfilm, imgUrl, filmAdapter));
                }
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });


    }
}
