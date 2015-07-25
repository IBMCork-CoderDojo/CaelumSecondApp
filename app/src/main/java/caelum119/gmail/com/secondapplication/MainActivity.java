package caelum119.gmail.com.secondapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class MainActivity extends Activity {
    CheckBox checkBox;
    CheckBox checkBox1;

    public void onButtonClick(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        Log.d("SecondApp", "" + checkBox.isChecked());
        Log.d("SecondApp", "" + checkBox1.isChecked());
        if(checkBox.isChecked() && checkBox1.isChecked()) {
            Log.d("SecondApp", "SDFSDFDSFDSFDSFDSFSDFDS");
        }
        if(checkBox.isChecked())
        {
            intent.putExtra("image", R.drawable.android);
        }
        else
        {
            intent.putExtra("image", R.drawable.og);
        }

        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox2);
        Button button = (Button) findViewById(R.id.button);
//        checkBox.setChecked(false);
//        checkBox1.setChecked(false);


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
}
