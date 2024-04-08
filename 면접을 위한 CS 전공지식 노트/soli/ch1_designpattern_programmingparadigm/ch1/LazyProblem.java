import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazyProblem {

    private static LazyProblem INSTANCE;

    private LazyProblem(){}

    public static LazyProblem getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new LazyProblem();
        }
        return INSTANCE;
    }

    public static class Main {
        public static void main(String[] args) {
            LazyProblem[] lazyProblems = new LazyProblem[10];

            // 스레드풀 생성
            ExecutorService service = Executors.newCachedThreadPool();

            for (int i = 0; i < 10; i++) {
                final int num = i;

                service.submit(() -> {
                    lazyProblems[num] = LazyProblem.getInstance();
                });
            }

            service.shutdown();
            while (!service.isTerminated()) {
                // 작업이 끝날 때까지 대기
            }

            for (LazyProblem lazyProblem : lazyProblems) {
                System.out.println(lazyProblem.toString());
            }
        }
    }
}
