package projectman.com.projectman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonA, buttonB, buttonC;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = (Button) findViewById(R.id.btn1);
        buttonB = (Button) findViewById(R.id.btn2);
        buttonC = (Button) findViewById(R.id.btn3);
        txtview = (TextView) findViewById(R.id.text);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn1) {
           txtview.setText("A is clicked");
        }
        if (view.getId() == R.id.btn2) {
           txtview.setText("B is clicked");
        }
        if(view.getId()==R.id.btn3){
            txtview.setText("C is clicked");
        }
    }
}