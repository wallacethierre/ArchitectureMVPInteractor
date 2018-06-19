package cesar.org.br.architecturetemplate.di

import cesar.org.br.architecturetemplate.util.schedulers.BaseScheduler
import cesar.org.br.architecturetemplate.util.schedulers.SchedulerProvider
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton


val schedulersModule = Kodein.Module {
    bind<BaseScheduler>() with singleton { SchedulerProvider() }
}