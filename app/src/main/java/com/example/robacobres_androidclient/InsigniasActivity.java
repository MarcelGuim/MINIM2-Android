package com.example.robacobres_androidclient;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.robacobres_androidclient.adapters.MyAdapter;
import com.example.robacobres_androidclient.adapters.MyChatIndividualAdapter;
import com.example.robacobres_androidclient.adapters.MyInsigniasAdapter;
import com.example.robacobres_androidclient.adapters.MyItemsAdapter;
import com.example.robacobres_androidclient.callbacks.InsigniasCallback;
import com.example.robacobres_androidclient.models.Insignia;
import com.example.robacobres_androidclient.models.Item;
import com.example.robacobres_androidclient.services.ServiceBBDD;

import java.util.ArrayList;
import java.util.List;

public class InsigniasActivity extends AppCompatActivity {
    List<Insignia> insignia;
    ServiceBBDD serviceREST;
    private RecyclerView recyclerView;
    private Button btnClose;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_insignias);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        context=InsigniasActivity.this;
        this.insignia = (List<Insignia>) getIntent().getSerializableExtra("insignias");
        mAdapter = new MyInsigniasAdapter(context, insignia);
        recyclerView.setAdapter(mAdapter);
    }
}
