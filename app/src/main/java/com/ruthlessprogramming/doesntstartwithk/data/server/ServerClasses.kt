package com.ruthlessprogramming.doesntstartwithk.data.server


/**
 * Created by billyparrish on 2/17/17 for DoesntStartWithK.
 */

data class Event(val links: List<Any>,
                 val id: Int,
                 val stats: Stats,
                 val title: String,
                 val announce_date: String,
                 val score: Double,
                 val date_tbd: Boolean,
                 val type: String,
                 val datetime_local: String,
                 val visible_until_utc: String,
                 val time_tbd: Boolean,
                 val taxonomies: List<Taxonomy>,
                 val performers: List<Performer>,
                 val url: String,
                 val created_at: String,
                 val venue: Venue,
                 val short_title: String,
                 val datetime_utc: String,
                 val datetime_tbd: Boolean,
                 val general_admission: Boolean)

data class Location(val lat: Double, val lon: Double)

data class Performer(val stats: Stats,
                     val name: String,
                     val shortName: String,
                     val divisions: Any,
                     val url: String,
                     val type: String,
                     val image: String,
                     val home_venue_id: Any,
                     val slug: String,
                     val score: Double,
                     val images: Images,
                     val taxonomies: List<Taxonomy>,
                     val has_upcoming_events: Boolean,
                     val id: Int,
                     val primary: Boolean
)


data class Stats(val listing_count: Int,
                 val average_price: Any,
                 val lowest_price_good_deals: Any,
                 val lowest_price: Any,
                 val highest_price: Any)

data class Taxonomy(val parent_id: Any,
                    val id: Int,
                    val name: String)


data class Venue(val city: String,
                 val name: String,
                 val extended_address:String,
                 val url: String,
                 val country: String,
                 val displayLocation: String,
                 val links: List<Any>,
                 val slug: String,
                 val state: String,
                 val score: Double,
                 val postalCode: String,
                 val location: Location,
                 val address: String,
                 val timezone: String,
                 val id: Int)

data class Images(val huge: String)

data class EventResponse(val meta: EventResponse, val events: List<Event>)






