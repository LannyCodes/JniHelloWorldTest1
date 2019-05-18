package lanny.com.so;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnShowMessage = findViewById(R.id.button);
        btnShowMessage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnShowMessage.setText(new JniUtils().getString());
            }
        });
    }
}
