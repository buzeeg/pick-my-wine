package com.remifayolle.android;

import android.app.Activity;
import android.os.Bundle;

public class PickMyWineActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // init global view to add content
        
        
        // get cellars
        Cave currentCave = new Cave();
        currentCave.setId(0);
        currentCave.setName("Arboretum");
        currentCave.setTempMax(16);
        currentCave.setTempMin(12);
        
        // get racks for first cellar
        BottleRack currentRack = new BottleRack();
        currentRack.setId(0);
        currentRack.setDesc("Gauche");
        currentRack.setNbRows(8);
        currentRack.setNbColumns(12);
        
        // get info on first rack
        int NUMBER_OF_ROWS = currentRack.getNbRows();
        int NUMBER_OF_COLUMNS = currentRack.getNbRows();
        
        // generate view of first rack
    }
}