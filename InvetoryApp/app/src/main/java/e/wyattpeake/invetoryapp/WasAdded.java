package e.wyattpeake.invetoryapp;

import android.os.Bundle;

public class WasAdded extends AddProduct  {
    DataBaseHelper helper = new DataBaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.was_added);
    }

}
