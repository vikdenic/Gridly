package com.nektarlabs.gridly.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nektarlabs.gridly.Adapters.ProductAdapter;
import com.nektarlabs.gridly.R;
import com.nektarlabs.gridly.model.Product;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private Product[] mProducts;

    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Product bike = new Product("Mountain bike");
        Product snowboard = new Product("Snowboard");
        Product tesla = new Product("Tesla");

        mProducts = new Product[] {bike, snowboard, tesla};

        ProductAdapter adapter = new ProductAdapter(this, mProducts);
        mRecyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);
    }
}
