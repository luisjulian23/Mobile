package umn.ac.id.uts_28770;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TampilanAwal extends AppCompatActivity {
    Button profil, Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profil = (Button)findViewById(R.id.user);
        Login = (Button)findViewById(R.id.login);


        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TampilanAwal.this ,User.class);
                startActivity(i);
            }

        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TampilanAwal.this ,Login.class);
                startActivity(i);
            }
        });

    }

}
