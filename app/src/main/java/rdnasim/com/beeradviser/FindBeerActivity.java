package rdnasim.com.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void FindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner colors = (Spinner) findViewById(R.id.color);
        String brandType = String.valueOf(colors.getSelectedItem());
        brands.setText(brandType);
    }
}
