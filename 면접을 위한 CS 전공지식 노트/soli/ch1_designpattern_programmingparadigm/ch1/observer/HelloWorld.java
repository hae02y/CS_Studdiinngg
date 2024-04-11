package observer;

public class HelloWorld {

    public static void main(String[] args) {

        Topic topic = new Topic();

        Observer a = new TopicSubscriber("a", topic);
        Observer b = new TopicSubscriber("b", topic);
        Observer c = new TopicSubscriber("c", topic);

        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.unregister(b);

        topic.postMessage("amumu is op champion .");
        /*
        Message sended to Topic : amumu is op champion .
        a:: got message >> amumu is op champion .
        b:: got message >> amumu is op champion .
        c:: got message >> amumu is op champion .
         */
    }
}
