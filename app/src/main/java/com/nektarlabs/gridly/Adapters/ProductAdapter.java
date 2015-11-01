package com.nektarlabs.gridly.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nektarlabs.gridly.R;
import com.nektarlabs.gridly.model.Product;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by viktordenic on 11/1/15.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Product[] mProducts;
    private Context mContext;

    public ProductAdapter(Context context, Product[] products) {
        mContext = context;
        mProducts = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_list_item, parent, false);
        ProductViewHolder viewHolder = new ProductViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.bindProduct(mProducts[position]);
    }

    @Override
    public int getItemCount() {
        return mProducts.length;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{

        @Bind(R.id.nameLabel) TextView mNameLabel;

        public ProductViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }

        public void bindProduct(Product product) {
            mNameLabel.setText(product.getName());
        }
    }
}
