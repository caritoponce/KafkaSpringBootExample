package com.kafka.demo;

import com.kafka.demo.model.User;
import com.kafka.demo.producer.KafkaJsonProducer;
import com.kafka.demo.producer.KafkaStringProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner  {


    /*private final KafkaStringProducer stringProducer;

    public CommandLineAppStartupRunner(KafkaStringProducer stringProducer) {
        this.stringProducer = stringProducer;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            stringProducer.sendMessage("Hello kafka !! " + i);
            Thread.sleep(2000);
        }
    }*/

    private final KafkaJsonProducer jsonProducer;

    public CommandLineAppStartupRunner(KafkaJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @Override
    public void run(String... args) throws Exception {
        jsonProducer.sendMessage(new User("Carolina"));
        jsonProducer.sendMessage(new User("Maria"));
        jsonProducer.sendMessage(new User("Diego"));
        jsonProducer.sendMessage(new User("Debora"));
        jsonProducer.sendMessage(new User("A.Montoya"));
        jsonProducer.sendMessage(new User("A.Zapata"));
        jsonProducer.sendMessage(new User("Martin"));
        jsonProducer.sendMessage(new User("Jossie"));
        jsonProducer.sendMessage(new User("Juan David"));
        jsonProducer.sendMessage(new User("Sabrina"));


    }

}
