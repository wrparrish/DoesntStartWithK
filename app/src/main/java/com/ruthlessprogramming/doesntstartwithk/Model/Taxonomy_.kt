package com.ruthlessprogramming.doesntstartwithk.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Billy on 4/10/2016.
 */
class Taxonomy_ {

    /**

     * @return
     * * The parentId
     */
    /**

     * @param parentId
     * * The parent_id
     */
    @SerializedName("parent_id")
    @Expose
    var parentId: Any? = null
    /**

     * @return
     * * The id
     */
    /**

     * @param id
     * * The id
     */
    @SerializedName("id")
    @Expose
    var id: Int? = null
    /**

     * @return
     * * The name
     */
    /**

     * @param name
     * * The name
     */
    @SerializedName("name")
    @Expose
    var name: String? = null

}