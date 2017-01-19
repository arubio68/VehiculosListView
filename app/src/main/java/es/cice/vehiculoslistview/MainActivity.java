package es.cice.vehiculoslistview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import es.cice.vehiculoslistview.adapters.CarAdapter;
import es.cice.vehiculoslistview.model.Vehiculo;

public class MainActivity extends AppCompatActivity {
    private String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Vehiculo> data=getData();
        CarAdapter adapter=new CarAdapter(this,R.layout.car_row,data);
        ListView carLV= (ListView) findViewById(R.id.carLV);
        carLV.setAdapter(adapter);
        carLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG,"click en item "  + i + "...");
                Toast.makeText(MainActivity.this,"click en item "  + i + "...",Toast.LENGTH_LONG).show();
            }
        });
    }


    private List<Vehiculo> getData() {
        List<Vehiculo> list=new ArrayList<>();
        list.add(new Vehiculo("bla bla bla","Peugeot",R.drawable.vehiculo1,R.drawable.vehiculo1_thumb,
                "307"));
        list.add(new Vehiculo("bla bla bla","Renault",R.drawable.vehiculo2,R.drawable.vehiculo2_thumb,
                "Megane"));
        list.add(new Vehiculo("bla bla bla","Peugeot",R.drawable.vehiculo3,R.drawable.vehiculo3_thumb,
                "3008"));
        list.add(new Vehiculo("bla bla bla","MVW",R.drawable.vehiculo4,R.drawable.vevhiculo4_thumb,
                "401"));
        list.add(new Vehiculo("bla bla bla","Peugeot",R.drawable.vehiculo5,R.drawable.vehiculo5_thumb,
                "407"));
        return list;
    }
}
