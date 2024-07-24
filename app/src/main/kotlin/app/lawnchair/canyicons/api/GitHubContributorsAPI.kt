package app.lawnchair.canyicons.api

import app.lawnchair.canyicons.model.GitHubContributor
import retrofit2.http.GET

interface GitHubContributorsAPI {

    @GET("repos/LawnchairLauncher/canyicons/contributors")
    suspend fun getContributors(): List<GitHubContributor>
}
