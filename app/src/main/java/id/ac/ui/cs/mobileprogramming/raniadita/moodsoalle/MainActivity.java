package id.ac.ui.cs.mobileprogramming.raniadita.moodsoalle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private OpenGLView openGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1 = (Button)findViewById(R.id.buttonBreathe);
        button_1.setOnClickListener((View.OnClickListener) this);
//        openGLView = (OpenGLView) findViewById(R.id.openGLView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        openGLView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        openGLView.onPause();
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.buttonBreathe: {
                openGLView = (OpenGLView) findViewById(R.id.openGLView);
                break;
            }
        }
    }
}