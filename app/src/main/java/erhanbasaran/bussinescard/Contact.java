package erhanbasaran.bussinescard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        textView = findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView2Unicef4);
    }
}