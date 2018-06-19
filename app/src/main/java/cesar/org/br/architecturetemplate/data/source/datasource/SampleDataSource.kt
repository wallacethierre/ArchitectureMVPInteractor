package cesar.org.br.architecturetemplate.data.source.datasource

import cesar.org.br.architecturetemplate.data.model.SampleModel
import io.reactivex.Observable


interface SampleDataSource {
    fun getSampleData(): Observable<SampleModel>
}