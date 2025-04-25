package test.header.size

import io.micronaut.http.client.annotation.Client
import io.micronaut.http.annotation.Get

@Client
interface BackendClient {

    @Get("http://redsky-product-details-api.ceres1.k8s.us-central1.tgt-cnf-prod.gcp.cloud.target.internal/product_details/v1/tcin/87568666")
//    @Get("http://redsky-varnish-product-details.ceres1.k8s.us-central1.tgt-cnf-prod.gcp.cloud.target.internal/product_details/v1/tcin/87568666")
    fun getBackend(): String
}