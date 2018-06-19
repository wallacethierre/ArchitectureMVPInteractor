package cesar.org.br.architecturetemplate.data.source.local

import cesar.org.br.architecturetemplate.data.model.SampleModel
import cesar.org.br.architecturetemplate.data.source.datasource.SampleDataSource
import io.reactivex.Observable


class SampleLocalDataSource: SampleDataSource {
    override fun getSampleData(): Observable<SampleModel> {
        return Observable.fromPublisher { SampleModel(id = 1, name = "Local") }
    }

}