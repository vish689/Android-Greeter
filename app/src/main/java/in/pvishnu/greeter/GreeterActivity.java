package in.pvishnu.greeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GreeterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeter);

        TextView textView = (TextView) findViewById(R.id.greeter_view);

        textView.setText("Hello, " + getIntent().getStringExtra(MainActivity.GREETER_NAME_KEY));
    }
}
