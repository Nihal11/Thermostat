package nl.tue.goelstudent.n.thermostat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int dtemp = 21;
    int ntemp = 19;
    TextView dayTemp;
    TextView nightTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dayTempPlus = (Button)findViewById(R.id.dayTempPlus);
        Button dayTempMinus = (Button)findViewById(R.id.dayTempMinus);
        Button nightTempPlus = (Button)findViewById(R.id.nightTempPlus);
        Button nightTempMinus = (Button)findViewById(R.id.nightTempMinus);
        dayTemp = (TextView) findViewById(R.id.dayTemp);
        nightTemp = (TextView) findViewById(R.id.nightTemp);

        dayTempPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dtemp++;
                dayTemp.setText(dtemp + " \u2103");
            }
        });

        dayTempMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dtemp--;
                dayTemp.setText(dtemp + " \u2103");
            }
        });

        nightTempPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ntemp++;
                nightTemp.setText(ntemp + " \u2103");
            }
        });
        nightTempMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ntemp--;
                nightTemp.setText(ntemp + " \u2103");
            }
        });
    }
}
