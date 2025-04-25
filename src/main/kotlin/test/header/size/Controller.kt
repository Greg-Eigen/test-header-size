package test.header.size

import io.micronaut.context.annotation.Value
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn


@Controller
@ExecuteOn(TaskExecutors.BLOCKING)
class Controller (
    val backendClient: BackendClient,
    @Value("\${micronaut.server.netty.max-header-size}") val maxHeaderSize: Int
) {

    @Get("/test-response-header-size")
    fun getResponseWithHeader(): HttpResponse<String> {
        var customResponseHeader: String = "This is a custom header value that is showing that even though the value of property micronaut.server.netty.max-header-size is set to 80, it is not being applied to this custom response header. This is evident by the fact that the response code is 200 instead of 413 despite this response header value being well over 80 bytes long."
        return HttpResponse.ok("max-header-size set to ${maxHeaderSize}")
            .header("custom-response-header", customResponseHeader)
    }

    @Get("/make-backend-request")
    fun makeBackendRequest(): HttpResponse<String> {
        return HttpResponse.ok(backendClient.getBackend())
    }
}