package Singleton;

class ValidationAlgorithm implements AlgorithmStrategy {
    private String validationType;

    public ValidationAlgorithm(String validationType) {
        this.validationType = validationType;
    }

    public void executeAlgorithm() {
        System.out.println(validationType + " validation algorithm is executed.");
        // Implementation of validation algorithm based on validationType
    }
}