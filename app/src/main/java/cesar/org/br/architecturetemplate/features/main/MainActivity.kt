package cesar.org.br.architecturetemplate.features.main

import cesar.org.br.architecturetemplate.R
import cesar.org.br.architecturetemplate.base.BaseActivity
import cesar.org.br.architecturetemplate.data.model.SampleModel
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.Kodein
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance

class MainActivity : BaseActivity<MainView>(), MainView {
    override val kodein: Kodein by closestKodein()

    override val layoutId: Int = R.layout.activity_main

    override val presenter: MainPresenter by instance()

    override fun setPresenter() {
        presenter.attachView(this)
    }

    override fun onCreate() {

        presenter.subscribe()
    }

    override fun showError(messageId: Int) {
    }

    override fun showError(messsage: String) {
        mainText.text = messsage
    }

    override fun showContent(sample: SampleModel) {
        mainText.text = resources.getString(R.string.content, sample.id.toString(), sample.name)
    }

    override fun onResume() {
        super.onResume()

        presenter.loadContent()
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter.unsubscribe()
    }


}
