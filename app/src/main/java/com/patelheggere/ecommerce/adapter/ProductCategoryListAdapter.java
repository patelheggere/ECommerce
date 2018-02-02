package com.patelheggere.ecommerce.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.patelheggere.ecommerce.R;
import com.patelheggere.ecommerce.datamodel.ResultModel;


import java.util.List;


public class ProductCategoryListAdapter extends RecyclerView.Adapter<ProductCategoryListAdapter.ViewHolder>
{
    private  final String TAG = "NotificationAdapter";
    public Context mContext;
    public List<ResultModel> mNotifications;

    public ProductCategoryListAdapter(Context mContext, List<ResultModel> mNotifications)
    {
        this.mContext = mContext;
        this.mNotifications = mNotifications ;
        if(mNotifications!=null)
        System.out.println("NameLdf:"+mNotifications.get(0).getCategories().get(0).getName());
    }

    @Override
    public ProductCategoryListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_category_listitem, parent, false);
        return new ProductCategoryListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductCategoryListAdapter.ViewHolder holder, int position)
    {


    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return mNotifications.size();
    }


   public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView mSchoolName;


        public ViewHolder(View v) {
            super(v);
            mSchoolName = v.findViewById(R.id.tvCategory) ;

        }
    }
}
