package in.pvishnu.greeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String GREETER_NAME_KEY = "MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, GreeterActivity.class);
        intent.putExtra(GREETER_NAME_KEY, name);
        startActivity(intent);
    }
}
