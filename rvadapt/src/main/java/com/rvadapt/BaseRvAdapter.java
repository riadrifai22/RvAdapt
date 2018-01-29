package com.rvadapt;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Riad on 1/22/2018.
 */

/**
 * Generic Recyclerview adapter. Extend it to skip all the boiler plate code.
 * @param <T> The model class of the recycler view items.
 * @param <L> An interface that extends {@link RvListener}
 * @param <VH> A view holder that extends {@link BaseRvHolder}
 */
public abstract class BaseRvAdapter<T, L extends RvListener, VH extends BaseRvHolder<T, L>>
        extends RecyclerView.Adapter<VH> {

    @NonNull
    private List<T> dataList;

    @Nullable
    private L clickListener;

    public BaseRvAdapter(@NonNull List<T> dataList, @Nullable L clickListener) {
        this.dataList = dataList;
        this.clickListener = clickListener;
    }

    @Override
    public abstract VH onCreateViewHolder(ViewGroup parent, int viewType);

    @Override
    public void onBindViewHolder(VH holder, int position) {
        T item = dataList.get(position);
        holder.bind(item, clickListener);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public synchronized T remove(int position) {
        T item = dataList.remove(position);
        notifyItemRemoved(position);
        return item;
    }

    public synchronized void remove(T item) {
        int position = dataList.indexOf(item);
        if (position > -1) {
            remove(position);
        }
    }

    public synchronized void add(T item) {
        dataList.add(item);
    }

    public synchronized void add(int position, T item) {
        dataList.add(position, item);
        notifyItemInserted(position);
    }
}
