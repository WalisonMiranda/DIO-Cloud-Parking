package one.digitalinnovation.parking.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("walison190@gmail.com");
        contact.setName("Walison Miranda");
        contact.setUrl("https://github.com/WalisonMiranda");

        Info info = new Info()
                .title("Parking REST API")
                .contact(contact)
                .version("1.0.0")
                .description("Spring Boot REST API for Parking");

        return new OpenAPI()
                .info(info);
    }
}
