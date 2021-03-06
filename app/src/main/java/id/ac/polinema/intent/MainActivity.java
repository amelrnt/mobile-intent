package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent i = new Intent(this, ExplicitIntentActivity.class);
        startActivity(i);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent intent = new Intent(this,ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleBundleIntent(View view) {
        Intent intent = new Intent(this,BundleActivity.class);
        startActivity(intent);
    }

    public void handleParcleabel(View view) {
        Intent intent = new Intent(this, ParcelableActivity.class);
        startActivity(intent);
    }
}
