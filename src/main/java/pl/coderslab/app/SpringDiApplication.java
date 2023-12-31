package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {

    public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

      HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
      helloWorld.printMessage();

      MessageSender messageSender = context.getBean(MessageSender.class);
      messageSender.sendMessageFromProperty();

      context.close();
    }

}
