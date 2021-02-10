package soundSystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({ CDPlayerConfig.class})
@ImportResource("classpath:inner/springConfig.xml")
public class SoundSystemConfig {
}
