package rdnasim.com.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpart expart = new BeerExpart();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void FindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner colors = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(colors.getSelectedItem());
        List<String> brandsList = expart.getBrands(beerType);

        StringBuilder bransFormeted = new StringBuilder();
        for (String brand : brandsList) {
            bransFormeted.append(brand).append("\n");
        }
        brands.setText(bransFormeted);
    }
}
