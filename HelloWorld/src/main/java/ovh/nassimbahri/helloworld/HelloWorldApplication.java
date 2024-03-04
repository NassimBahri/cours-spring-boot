package ovh.nassimbahri.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {

    private TextMessage textMessage;

    public HelloWorldApplication(TextMessage text){
        this.textMessage = text;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.textMessage.afficher());
    }
}
