package ovh.nassimbahri.helloworld;

import org.springframework.stereotype.Component;

@Component("langueFr")
public class MessageFr implements IMessage {

    public String sayHello(){
        return "Bonjour tous le monde";
    }

    public String sayBye(){
        return "Au-revoir";
    }

}
