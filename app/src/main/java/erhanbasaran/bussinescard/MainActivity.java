package erhanbasaran.bussinescard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int count = 0;
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + R.raw.unicef);
        videoView.start();
    }

    /*public void countPressed(View view){
        System.out.println("Hey");
        count++;
        textView.setText("Bla Bla.." + count);
        if (count > 4){
            Intent intent = new Intent(this,About.class);
            startActivity(intent);
        }
    }*/
    public void countPressed(View view){
        Intent intent1 = new Intent(this,About.class);
        startActivity(intent1);
    }

    public void contactPressed(View view){
        Intent intent2 = new Intent(this,Contact.class);
        startActivity(intent2);
    }
}