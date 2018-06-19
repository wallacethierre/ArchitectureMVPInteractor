package cesar.org.br.architecturetemplate.data.source.remote.network

import cesar.org.br.architecturetemplate.data.model.SampleModel
import io.reactivex.Observable
import retrofit2.http.GET


interface SampleApi {

    companion object {
        const val API_KEY = "auihsauhsa21"
        const val API_VERSION = "v2000"
        const val DEFAULT_LANGUAGE = "pt-BR"
    }

    @GET("sample/data")
    fun sampleData(): Observable<SampleModel>
}