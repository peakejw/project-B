package e.wyattpeake.invetoryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<Product>{

    private LayoutInflater mInflator;
    private ArrayList<Product> products;
    private int mViewResourceID;

    public MyListAdapter(Context context, int textViewResourceID, ArrayList<Product> products){
        super(context,textViewResourceID,products);
        this.products = products;

        mInflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceID = textViewResourceID;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflator.inflate(mViewResourceID, null);

        Product product = products.get(position);

        if (product != null) {
            TextView name = (TextView) convertView.findViewById(R.id.Lname);
            TextView location = (TextView) convertView.findViewById(R.id.Llocation);
            TextView quantity = (TextView) convertView.findViewById(R.id.Lquantity);
            TextView price = (TextView) convertView.findViewById(R.id.Lprice);
            if (name != null) {
                name.setText(product.getProductName());
            }
            if (location != null) {
                location.setText((product.getLocation()));
            }
            if (quantity != null) {
                quantity.setText((product.getQuantity()));
            }
            if (price != null) {
                price.setText((product.getPrice()));
            }
        }

        return convertView;
    }
}
