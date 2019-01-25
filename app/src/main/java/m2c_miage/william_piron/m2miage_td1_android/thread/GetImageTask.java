package m2c_miage.william_piron.m2miage_td1_android.thread;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import m2c_miage.william_piron.m2miage_td1_android.adapter.FilmAdapter;
import m2c_miage.william_piron.m2miage_td1_android.structures.FilmParameters;

public class GetImageTask extends AsyncTask<FilmParameters, Void, Void> {
    private FilmAdapter adapter;

    public GetImageTask(FilmAdapter adapter) {
        this.adapter = adapter;
    }



    @Override
    protected Void doInBackground(FilmParameters... filmParameters) {
        Log.i(this.getClass().getCanonicalName(), "Entre doInBackground");

        InputStream input = null;
        HttpURLConnection connection = null;
        Bitmap bitmap = null;

        try {
            URL url = new URL(filmParameters[0].getUrl());
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            input = new BufferedInputStream(connection.getInputStream());
            bitmap = BitmapFactory.decodeStream(input);

        } catch (Exception e) {
            Log.e(this.getClass().getCanonicalName(), "Erreur lors de la création de l'image");
        } finally {
            try {
                if (input != null)
                    input.close();
            } catch (IOException ignored) {
                Log.e(this.getClass().getCanonicalName(), "Erreur input");
            }
            if (connection != null)
                connection.disconnect();
        }
        Log.i(this.getClass().getCanonicalName(), "Quitte doInBackground");

        filmParameters[0].setImage(bitmap);

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        adapter.notifyDataSetChanged();
    }
}
