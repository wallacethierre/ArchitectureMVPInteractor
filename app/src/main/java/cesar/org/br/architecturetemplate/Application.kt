package cesar.org.br.architecturetemplate

import android.app.Application
import cesar.org.br.architecturetemplate.di.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.androidModule


class Application: Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidModule(this@Application))
        import(networkModule)
        import(dataSourceModule)
        import(presenterModule)
        import(interactorModule)
        import(schedulersModule)
    }
}