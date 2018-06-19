package cesar.org.br.architecturetemplate.di

import cesar.org.br.architecturetemplate.data.repositories.SampleRepository
import cesar.org.br.architecturetemplate.data.source.datasource.SampleDataSource
import cesar.org.br.architecturetemplate.data.source.local.SampleLocalDataSource
import cesar.org.br.architecturetemplate.data.source.remote.SampleRemoteDataSource
import cesar.org.br.architecturetemplate.data.source.remote.network.SampleApi
import cesar.org.br.architecturetemplate.data.source.remote.network.ServiceClient
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton


val networkModule = Kodein.Module {
    bind<SampleApi>() with singleton { ServiceClient().getApiClient() }
}

val dataSourceModule = Kodein.Module {
    bind<SampleRepository>() with singleton { SampleRepository(instance(tag = "remote"), instance(tag = "local")) }

    bind<SampleDataSource>(tag = "remote") with provider { SampleRemoteDataSource(instance()) }

    bind<SampleDataSource>(tag = "local") with provider { SampleLocalDataSource() }
}