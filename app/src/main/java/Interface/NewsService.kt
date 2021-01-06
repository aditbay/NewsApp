package Interface

import Model.WebSite
import retrofit2.Call
import retrofit2.http.GET
import javax.xml.transform.Source

interface NewsService {
    @get:GET(value = "v2/sources?apiKey=03c2dbaebc34416781c52761bd082477")
    val sources: Call<WebSite>

}