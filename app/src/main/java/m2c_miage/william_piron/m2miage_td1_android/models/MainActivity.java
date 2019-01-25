package m2c_miage.william_piron.m2miage_td1_android.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import m2c_miage.william_piron.m2miage_td1_android.R;
import m2c_miage.william_piron.m2miage_td1_android.adapter.FilmAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewFilms = findViewById(R.id.list_films);
        Button button_reload = findViewById(R.id.button_reload);
        Button button_add = findViewById(R.id.button_add);

        ArrayList<Film> listeFilms = new ArrayList<Film>();
        listeFilms.add(new Film());

        FilmAdapter filmAdapter = new FilmAdapter(this, listeFilms);
        listViewFilms.setAdapter(filmAdapter);

        button_reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
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
