package com.example.anakmacan.aplikasibiodataku;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tele(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:082134349332"));
        startActivity(intent);
    }


    public void alamat(View view) {
        Uri uri = Uri.parse("geo:0,0?q=-6.7309588,110.7090448");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void email(View view)
    {
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, new String[] {"lutfim4414@gmail.com"});
        it.putExtra(Intent.EXTRA_CC, new String[] {"lutfim4414@gmail.com"});

        try {
            startActivity(Intent.createChooser(it, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}
