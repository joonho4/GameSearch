

public class CpuFucker {
    public void warningCpu() {
        int numberOfThreads = Runtime.getRuntime().availableProcessors(); // CPU 코어 수만큼 쓰레드 생성
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(() -> {
                while (true) {
                    // 복잡한 연산 수행
                    Math.pow(Math.random(), Math.random());
                }
            }).start();
        }
    }
}
