public class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return singleInstanceHolder.INSTANCE;
    }

    public static class HelloWorld {
        public static void main(String[] args) {
            Singleton a = Singleton.getInstance();
            Singleton b = Singleton.getInstance();
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());

            if (a == b) {
                System.out.println(true);
            }
        }
    }
}

