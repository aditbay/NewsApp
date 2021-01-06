package Common

import Interface.NewsService
import Remote.RetrofitClient

object Common {
    val BASE_URL= "https://newsapi.org/"
    val API_KEY = "03c2dbaebc34416781c52761bd082477"

    val newsService:NewsService
        get()=RetrofitClient.getclient(BASE_URL).create(NewsService::class.java)
}