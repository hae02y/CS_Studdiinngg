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

        topic.postMessage("amumu is op champion ."); // ㅋㅋㅋ


    }
}
