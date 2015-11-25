package pl.rafalmanka.memoryleaks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MemoryLeakActivity extends Activity {

    private static final String TAG = MemoryLeakActivity.class.getSimpleName();
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private static final ArrayList<Object> container = new ArrayList<>();

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_leak);

        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MemoryLeakActivity.newIntent(MemoryLeakActivity.this));
            }
        });

        container.add(this);
        findViewById(R.id.prev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.remove(this);
                finish();
            }
        });

        findViewById(R.id.gc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
            }
        });

        MockImageGenerator.next();

        Picasso.with(this)
                .load(MockImageGenerator.image())
                .fit()
                .centerCrop()
                .into((ImageView) findViewById(R.id.background));

        id = MockImageGenerator.id();
        String txt = "id=" + id;
        TextView label = (TextView) findViewById(R.id.label);
        label.setText(txt);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy=" + id);
    }

    @Override
    protected void finalize() throws Throwable {
        Log.i(TAG, "finalize=" + id);
        super.finalize();
    }

    //-- STATIC

    private static Intent newIntent(Activity activity) {
        return new Intent(activity, MemoryLeakActivity.class);
    }

}
