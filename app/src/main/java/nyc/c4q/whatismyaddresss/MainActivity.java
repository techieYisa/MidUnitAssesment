package nyc.c4q.whatismyaddresss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "address_shared_preferences";
    private EditText email;
    private Button submitButton, intentButton;
    private SharedPreferences login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email_edittext);
        submitButton = (Button) findViewById(R.id.submitButton);
        intentButton = (Button) findViewById(R.id.intentButton);

        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        intentButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
            startActivity(intent);
        });
        }
    }
}

