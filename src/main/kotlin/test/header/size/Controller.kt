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
        val customResponseHeader = "This is a custom response header value. The value of max-header-size set to ${maxHeaderSize} but evidently that is not being applied to this custom response header because the length of this response header value exceeds that setting but no exception is thrown and the value of the response header is returned unaffected."

        return HttpResponse.ok("max-header-size set to ${maxHeaderSize}")
            .header("custom-response-header", customResponseHeader)
    }

    @Get("/make-backend-request")
    fun makeBackendRequest(): HttpResponse<String> {
        val customRequestHeader = "xxxxxxxxxxx This  is  a  custom  request  header  value  that  is  100  characters  long. xxxxxxxxxx"
        val httpResponse: HttpResponse<String> = backendClient.getBackend(customRequestHeader)
        val backendHeadersMetadata = "Backend request header custom-request-header is length ${customRequestHeader.length}.  Backend response header server-timing is length = ${httpResponse.header("server-timing").length}. The length of each of those headers exceeds max-header-size set to ${maxHeaderSize} but no exception is thrown and at least the backend response header is returned unaffected."
        return HttpResponse.ok(backendHeadersMetadata)
    }
}