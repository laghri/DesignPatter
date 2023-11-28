package Singleton;

class Context {
    private AlgorithmStrategy algorithm;

    public void setAlgorithm(AlgorithmStrategy algorithm) {
        this.algorithm = algorithm;
    }

    public void executeAlgorithm() {
        algorithm.executeAlgorithm();
    }
}