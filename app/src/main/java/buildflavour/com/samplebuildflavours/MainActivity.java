package buildflavour.com.samplebuildflavours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.txt);
        if(Constants.Type.FREE== Constants.type){
            txt.setText("Free Application");
        }else{
            txt.setText("Pain Application");
        }
    }
}
