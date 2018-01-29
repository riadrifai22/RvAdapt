package com.rvadapt;

/**
 * Created by Riad on 1/22/2018.
 */

/**
 * A sample click listener for recycler view items. To add your own methods, extend {@link RvListener}
 * @param <T> The model class of the recycler view items.
 */
public interface RvClickListener<T> extends RvListener {
    /**
     * Called when we press an item in the recyclerview.
     * @param clickedItem The clicked item
     */
    void onRvItemClick(T clickedItem);
}
