package test.header.size

import io.micronaut.http.HttpResponse
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header

@Client
interface BackendClient {

    @Get("https://pokeapi.co/api/v2/pokemon-species/132/")
    fun getBackend(
        @Header("custom-request-header") customRequestHeader: String
    ): HttpResponse<String>
}