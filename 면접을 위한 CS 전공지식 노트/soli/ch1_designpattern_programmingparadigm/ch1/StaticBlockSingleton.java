public class StaticBlockSingleton {

    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){}

    // 정적 블록 초기화로 예외 처리
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
