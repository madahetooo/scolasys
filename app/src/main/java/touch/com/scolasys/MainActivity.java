package touch.com.scolasys;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnEnglish, btnArabic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Typeface fontType = Typeface.createFromAsset(getAssets(), "fonts/Century Gothic.ttf");
        btnEnglish = findViewById(R.id.btn_En);
        btnArabic = findViewById(R.id.btn_Ar);
        btnEnglish.setTypeface(fontType);
        btnArabic.setTypeface(fontType);
        btnEnglish.setOnClickListener(this);
        btnArabic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_En:
                Intent englishContent = new Intent(getApplicationContext(), Home.class);
                startActivity(englishContent);
                break;

            case R.id.btn_Ar:
                Intent arabicContent = new Intent(getApplicationContext(), Home.class);
                startActivity(arabicContent);
                break;
        }
    }
}
