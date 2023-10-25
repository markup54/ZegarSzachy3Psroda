package pl.zabrze.zs10.szachyzegar3psroda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CountDownTimer timer;
    private int sekundy =180;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        timer = new CountDownTimer(sekundy*1000,1000) {
            @Override
            public void onTick(long l) {
                sekundy = (int)l/1000;
                textView.setText(String.valueOf(sekundy));
            }

            @Override
            public void onFinish() {
                textView.setText("Koniec czasu");
            }
        };
        timer.start();
    }
}