package test.header.size

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller
class Controller {

    @Get("/headers")
    fun index(): HttpResponse<String> {
        return HttpResponse.ok("Response with headers")
    }
}