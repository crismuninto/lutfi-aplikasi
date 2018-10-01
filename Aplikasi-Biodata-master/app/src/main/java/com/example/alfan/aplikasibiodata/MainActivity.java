package com.example.alfan.aplikasibiodata;

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

    public void phoneNumber(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0858801765143"));
        startActivity(intent);
    }

    public void urlWeb(View view) {
        Uri uri = Uri.parse("http://kodingsquad.blogspot.com/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void homeLocation(View view) {
        Uri uri = Uri.parse("geo:0,0?q=-6.983209,110.3999538");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}
