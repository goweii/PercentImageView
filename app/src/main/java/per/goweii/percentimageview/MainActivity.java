package per.goweii.percentimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

import per.goweii.percentimageview.percentimageview.PercentImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PercentImageView piv_1 = findViewById(R.id.piv_1);
        piv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piv_1.setPercent(PercentImageView.BASICS_WIDTH, getRandomPercent());
            }
        });
        PercentImageView piv_2 = findViewById(R.id.piv_2);
        piv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piv_2.setPercent(PercentImageView.BASICS_WIDTH, getRandomPercent());
            }
        });
        PercentImageView piv_3 = findViewById(R.id.piv_3);
        piv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piv_3.setPercent(PercentImageView.BASICS_WIDTH, getRandomPercent());
            }
        });
        PercentImageView piv_4 = findViewById(R.id.piv_4);
        piv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piv_4.setPercent(PercentImageView.BASICS_HEIGHT, getRandomPercent());
            }
        });
        PercentImageView piv_5 = findViewById(R.id.piv_5);
        piv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piv_5.setPercent(PercentImageView.BASICS_HEIGHT, getRandomPercent());
            }
        });
        PercentImageView piv_6 = findViewById(R.id.piv_6);
        piv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piv_6.setPercent(PercentImageView.BASICS_HEIGHT, getRandomPercent());
            }
        });
    }

    private float getRandomPercent(){
        Random random = new Random();
        return random.nextFloat() + random.nextFloat();
    }
}
