package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        SharedPreferences sharedPreferences =getSharedPreferences("login", MODE_PRIVATE);
        Boolean isLoged = sharedPreferences.getBoolean("isLoged", false);

        if(isLoged == true){
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(SplashActivity.this, LogInActivity.class);
            startActivity(intent);
        }

        finish();
    }
}