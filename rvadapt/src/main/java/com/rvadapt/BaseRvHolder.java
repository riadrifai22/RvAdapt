package com.rvadapt;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Riad on 1/22/2018.
 */

/**
 * Base view holder for {@link BaseRvAdapter}. If you wish to register a ViewHolder to {@link BaseRvAdapter}
 * you must extend this class.
 * @param <T> The model class of the recycler view items.
 * @param <L> An interface that extends {@link RvListener}
 */
public abstract class BaseRvHolder<T, L extends RvListener> extends RecyclerView.ViewHolder {

    /**
     * Holder constructor. You could initialize your item's views here.
     * @param itemView The layout of the recycler view item.
     */
    public BaseRvHolder(View itemView) {
        super(itemView);
    }

    /**
     * This is called inside {@link BaseRvAdapter#onBindViewHolder(BaseRvHolder, int)}
     * So binding your view happens here, after they have been initialized in the holder's constructor.
     * @param item The current model being binded
     * @param listener An interface that extends {@link RvListener}. In case you want to notifiy click events,
     *                 here is a good place to do it.
     */
    abstract void bind(@NonNull T item, @Nullable L listener);
}
