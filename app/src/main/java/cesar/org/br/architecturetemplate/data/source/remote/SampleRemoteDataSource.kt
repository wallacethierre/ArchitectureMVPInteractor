package cesar.org.br.architecturetemplate.data.source.remote

import cesar.org.br.architecturetemplate.data.model.SampleModel
import cesar.org.br.architecturetemplate.data.source.datasource.SampleDataSource
import cesar.org.br.architecturetemplate.data.source.remote.network.SampleApi
import io.reactivex.Observable


class SampleRemoteDataSource(private val apiClient: SampleApi): SampleDataSource {

    override fun getSampleData(): Observable<SampleModel> {
        return apiClient.sampleData()
    }
}