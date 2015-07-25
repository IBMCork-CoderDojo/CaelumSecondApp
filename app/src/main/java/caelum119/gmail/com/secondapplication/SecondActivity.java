package caelum119.gmail.com.secondapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by ibm on 25/07/15.
 */
public class SecondActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(getIntent().getIntExtra("image", 0));
    }
}
