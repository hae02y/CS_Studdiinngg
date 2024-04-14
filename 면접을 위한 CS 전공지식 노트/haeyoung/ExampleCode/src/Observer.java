import java.util.ArrayList;
import java.util.List;

public class Observer {
    public static void main(String[] args) {

        ManageSubject publish = new ManageSubject();

        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();

        publish.registerObserver(observerA);
        publish.registerObserver(observerB);

        publish.notifyObserver();

        publish.removeObserver(observerA);

        publish.notifyObserver();

    }
}

interface InterfaceSubject {
    void registerObserver(InterfaceObserver observer);

    void removeObserver(InterfaceObserver observer);

    void notifyObserver();
}

class ManageSubject implements InterfaceSubject {
    List<InterfaceObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(InterfaceObserver observer) {
        observers.add(observer);
        System.out.println(observer + "구독");
    }

    @Override
    public void removeObserver(InterfaceObserver observer) {
        observers.remove(observer);
        System.out.println(observer + "구독 취소");
    }

    @Override
    public void notifyObserver() {
        for (InterfaceObserver observer : observers) {
            observer.update(); //위임
        }
    }
}


//observer Interface
interface InterfaceObserver {
    void update();
}

class ObserverA implements InterfaceObserver {
    @Override
    public void update() {
        System.out.println("observerA 알람 이벤트 발생");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class ObserverB implements InterfaceObserver {
    @Override
    public void update() {
        System.out.println("observerB 알람 이벤트 발생");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}