package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alan on 01/07/2016.
 */
public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Get the drink from the intent
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = Drink.drinks[drinkNo];

        // Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo); // crea el objeto photo
        photo.setImageResource(drink.getImageResourceId()); // obtiene el id de la imagen para mostrar en photo
        photo.setContentDescription(drink.getName()); // obtiene la descripción de la imagen (nombre)

        // Populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        // Populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

    }
}
