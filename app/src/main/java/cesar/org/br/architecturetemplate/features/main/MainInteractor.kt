package cesar.org.br.architecturetemplate.features.main

import cesar.org.br.architecturetemplate.data.model.SampleModel
import cesar.org.br.architecturetemplate.data.repositories.SampleRepository
import cesar.org.br.architecturetemplate.util.schedulers.BaseScheduler
import io.reactivex.Observable


class MainInteractor(private val repository: SampleRepository, private val schedulerProvider: BaseScheduler) {
    fun getSampleContent(): Observable<SampleModel> {

        //Handle data here, like transformation, manipulation, etc.
        return repository.getSampleData()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
    }
}