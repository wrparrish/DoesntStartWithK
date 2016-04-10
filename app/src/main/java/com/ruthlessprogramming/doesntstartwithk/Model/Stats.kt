package com.ruthlessprogramming.doesntstartwithk.Model

/**
 * Created by Billy on 4/10/2016.
 */

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Stats {

    /**
     * @return The listingCount
     */
    /**
     * @param listingCount The listing_count
     */
    @SerializedName("listing_count")
    @Expose
    var listingCount: Int? = null
    /**
     * @return The averagePrice
     */
    /**
     * @param averagePrice The average_price
     */
    @SerializedName("average_price")
    @Expose
    var averagePrice: Any? = null
    /**
     * @return The lowestPriceGoodDeals
     */
    /**
     * @param lowestPriceGoodDeals The lowest_price_good_deals
     */
    @SerializedName("lowest_price_good_deals")
    @Expose
    var lowestPriceGoodDeals: Any? = null
    /**
     * @return The lowestPrice
     */
    /**
     * @param lowestPrice The lowest_price
     */
    @SerializedName("lowest_price")
    @Expose
    var lowestPrice: Any? = null
    /**
     * @return The highestPrice
     */
    /**
     * @param highestPrice The highest_price
     */
    @SerializedName("highest_price")
    @Expose
    var highestPrice: Any? = null

}