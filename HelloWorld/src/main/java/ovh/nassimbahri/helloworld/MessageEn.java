package ovh.nassimbahri.helloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("langueEn")
public class MessageEn implements IMessage{

    public String sayHello(){
        return "Hello World";
    }

    public String sayBye(){
        return "Good Bye";
    }

}
