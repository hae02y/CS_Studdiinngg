public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
