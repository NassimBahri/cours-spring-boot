package ovh.nassimbahri.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextMessage {

    public IMessage message;


    public TextMessage(@Qualifier("langueEn") IMessage message){
        this.message = message;
    }

    public String afficher(){
        return this.message.sayHello() + " ... " + this.message.sayBye();
    }

}
