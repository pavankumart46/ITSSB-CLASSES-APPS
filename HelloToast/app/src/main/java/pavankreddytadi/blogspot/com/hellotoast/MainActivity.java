package pavankreddytadi.blogspot.com.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView c;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = findViewById(R.id.counter);
    }

    public void showToast(View view)
    {
        Toast.makeText(this, "ITSSB WORLDSKILLS TRADE", Toast.LENGTH_SHORT).show();
         // Toast messages are very much useful for the users to see short messages.
    }


    public void showCount(View view)
    {
        count++;
        c.setText(""+count);
    }
}
