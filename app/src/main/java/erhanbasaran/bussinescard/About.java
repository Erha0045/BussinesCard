package erhanbasaran.bussinescard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class About extends AppCompatActivity {

    private ImageView UnicefLogo;
    private TextView textView2;
    private TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        textView = findViewById(R.id.textViewLabelAbout);
        textView.setText("About ");
        UnicefLogo = findViewById(R.id.UnicefLogo);
        textView2 = findViewById(R.id.textView2);
        textView2.setText("UNICEF works in the world’s toughest places to reach the most disadvantaged children and adolescents – and to protect the rights of every child, everywhere. Across more than 190 countries and territories, we do whatever it takes to help children survive, thrive and fulfill their potential, from early childhood through adolescence. \n" +
                "\n" +
                "The world’s largest provider of vaccines, we support child health and nutrition, safe water and sanitation, quality education and skill building, HIV prevention and treatment for mothers and babies, and the protection of children and adolescents from violence and exploitation.\n" +
                "\n" +
                "Before, during and after humanitarian emergencies, UNICEF is on the ground, bringing lifesaving help and hope to children and families. Non-political and impartial, we are never neutral when it comes to defending children’s rights and safeguarding their lives and futures. \n" +
                "\n" +
                "And we never give up. ");

    }
}