package cesar.org.br.architecturetemplate.features.main

import android.util.Log
import cesar.org.br.architecturetemplate.base.BasePresenter
import io.reactivex.disposables.Disposable


class MainPresenter(val interactor: MainInteractor) : BasePresenter<MainView>() {

    fun loadContent() {
        val disposable: Disposable = interactor.getSampleContent()
                .subscribe(
                        {
                            view?.showContent(it)
                        },
                        {
                            view?.showError("This is an Error message")
                        })

        compositeDisposable.add(disposable)
    }

    override fun subscribe() {
        loadContent()
    }

    override fun unsubscribe() {
        compositeDisposable.clear()
    }

}