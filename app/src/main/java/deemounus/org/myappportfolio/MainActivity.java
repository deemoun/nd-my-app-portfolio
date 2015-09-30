package deemounus.org.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my ";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text + message + " app!", duration);
        toast.show();
    }

    public void buttonClicked(View v) {

        switch (v.getId()) {
            case R.id.btn1:
                displayToast("spotify streamer");
                break;
            case R.id.btn2:
                displayToast("football scores");
                break;
            case R.id.btn3:
                displayToast("library");
                break;
            case R.id.btn4:
                displayToast("build it bigger");
                break;
            case R.id.btn5:
                displayToast("XYZ reader");
                break;
            case R.id.btn6:
                displayToast("capstone");
                break;
        }
    }
}
