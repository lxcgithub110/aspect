package aspect.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import aspect.annotation.Duration;
import aspect.annotation.MainThread;
import aspect.annotation.SubThread;

/**
 * @author yuansui
 * @since 2018/5/31
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testSubThread();
        testMainThread();
        testDuration();
    }

    @SubThread
    public void testSubThread() {
        Log.d(TAG, "testSubThread");
    }

    @MainThread
    public void testMainThread() {
        Log.d(TAG, "testMainThread");
    }

    @Duration
    public void testDuration() {
        Log.d(TAG, "testDuration");
    }
}
