package cesar.org.br.architecturetemplate.base

import android.support.annotation.StringRes


interface BaseView {
    fun showError(@StringRes messageId: Int)
    fun showError(messsage: String)
}