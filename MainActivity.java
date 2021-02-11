package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView) findViewById(R.id.txt);
        button=(Button) findViewById(R.id.btn);
        //create listener
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                text.setText("You have clicked the button");
            }
        });

}
}