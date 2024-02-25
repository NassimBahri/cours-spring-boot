package ovh.nassimbahri.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ConfigTextMessage {

  //  @Bean
    public TextMessage textMessage(){
        return new TextMessage(new MessageEn());
    }

}
