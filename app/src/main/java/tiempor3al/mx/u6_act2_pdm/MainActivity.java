package tiempor3al.mx.u6_act2_pdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView clima = (ImageView)findViewById(R.id.clima);
        int identificador =getResources().getIdentifier("imagen_01d","drawable",getPackageName());

        clima.setImageDrawable(getResources().getDrawable(identificador,null));






    }
}
