package cesar.org.br.architecturetemplate.di

import cesar.org.br.architecturetemplate.features.main.MainInteractor
import cesar.org.br.architecturetemplate.features.main.MainPresenter
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

val presenterModule = Kodein.Module {
    bind<MainPresenter>() with provider { MainPresenter(instance()) }
}

val interactorModule = Kodein.Module {
    bind<MainInteractor>() with provider { MainInteractor(instance(), instance()) }
}