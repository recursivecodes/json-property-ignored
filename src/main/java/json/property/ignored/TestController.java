package json.property.ignored;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/test")
public class TestController {

    @Post("/bad")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse bad(@Body TestBad test) {
        return HttpResponse.ok(
                test
        );
    }
    @Post("/good")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public HttpResponse good(@Body TestGood test) {
        return HttpResponse.ok(
                test
        );
    }
}