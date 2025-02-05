package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result;
    TextView winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = findViewById(R.id.textView2);
        winner = findViewById(R.id.textView3);
//        score = findViewById(R.id.textView4);

        Bundle extras = getIntent().getExtras();
        int homeResult = extras.getInt("homeScore");
        int awayResult = extras.getInt("awayScore");
        String homeName = extras.getString("homeName");
        String awayName = extras.getString("awayName");

        if(extras != null ){
            result.setText(String.valueOf(homeResult) + " - " + String.valueOf(awayResult));
            if(homeResult > awayResult){
                winner.setText("Pemenangnya adalah tim "+homeName + " !");
            }else if(awayResult > homeResult){
                winner.setText("Pemenangnya adalah tim "+awayName + " !");
            }else{
                winner.setText("Pertandingan Berakhir Seri");
            }
        }
    }
}
