package cesar.org.br.architecturetemplate.features.main

import cesar.org.br.architecturetemplate.base.BaseView
import cesar.org.br.architecturetemplate.data.model.SampleModel


interface MainView: BaseView {
    fun showContent(sample: SampleModel)
}