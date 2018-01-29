package com.rvadapt;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Riad on 1/22/2018.
 */

public class TestAdapter extends BaseRvAdapter<Model, RvClickListener<Model>, TestAdapter.TestViewHolder> {

    public TestAdapter(@NonNull List<Model> dataList, @Nullable RvClickListener<Model> clickListener) {
        super(dataList, clickListener);
    }

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new TestViewHolder(v);
    }

    public class TestViewHolder extends BaseRvHolder<Model, RvClickListener<Model>> {

        public TestViewHolder(View itemView) {
            super(itemView);
            //initialize your views in item
        }

        @Override
        void bind(@NonNull Model item, @Nullable RvClickListener<Model> listener) {
            //Do what you gotta do with the view
        }
    }
}
