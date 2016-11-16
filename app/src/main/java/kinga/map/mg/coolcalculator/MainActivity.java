package kinga.map.mg.coolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Function called when 7 is pressed
    public void buttonSevenPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.seven);
    }
}
