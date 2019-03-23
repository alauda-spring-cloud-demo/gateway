package demo.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

@Configuration
public class RouterConfig {
    @Bean
    RouterFunction<?> routerFunction(){
        RouterFunction router = RouterFunctions.resources("/webjars/**", new ClassPathResource("/"))
                                        .andOther(RouterFunctions.resources("/swagger-ui.html", new ClassPathResource("/")));
        return router;
    }
}
