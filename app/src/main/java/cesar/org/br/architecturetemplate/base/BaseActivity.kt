package cesar.org.br.architecturetemplate.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.kodein.di.KodeinAware

abstract class BaseActivity<V: BaseView>: AppCompatActivity(), KodeinAware, BaseView {

    protected abstract val layoutId: Int
    protected abstract val presenter: BasePresenter<V>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)

        setPresenter()
        onCreate()

        presenter.subscribe()
    }

    protected abstract fun setPresenter()

    protected abstract fun onCreate()

    override fun onDestroy() {
        super.onDestroy()
        presenter.unsubscribe()
    }

}