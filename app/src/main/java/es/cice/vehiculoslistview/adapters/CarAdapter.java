package es.cice.vehiculoslistview.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import es.cice.vehiculoslistview.R;
import es.cice.vehiculoslistview.model.Vehiculo;

/**
 * Created by cice on 19/1/17.
 */

public class CarAdapter extends ArrayAdapter<Vehiculo> {
    private Context ctx;
    private List<Vehiculo> data;

    public CarAdapter(Context context, int resource, List<Vehiculo> objects) {
        super(context, resource, objects);
        ctx=context;
        data=objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(ctx);
        View row=inflater.inflate(R.layout.car_row,null);
        ImageView carIV= (ImageView) row.findViewById(R.id.carThumbIV);
        TextView carTV= (TextView) row.findViewById(R.id.carNameTV);
        carIV.setImageResource(data.get(position).getMiniatura());
        carTV.setText(data.get(position).getFabricante() + " " + data.get(position).getModelo());
        return row;
    }
}
