package cesar.org.br.architecturetemplate.data.repositories

import cesar.org.br.architecturetemplate.data.model.SampleModel
import cesar.org.br.architecturetemplate.data.source.datasource.SampleDataSource
import io.reactivex.Observable


class SampleRepository(
        private val sampleRemoteDataSource: SampleDataSource,
        private val sampleLocalDataSource: SampleDataSource) : SampleDataSource {

    override fun getSampleData(): Observable<SampleModel> {
        /*
         * If has internet connection use sampleRemoteDatasource
         * Else use the sampleLocalDatasource
         *
         */

        return sampleRemoteDataSource.getSampleData()
    }

}