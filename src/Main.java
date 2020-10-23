public class Main {
    public static void main(String[] args) {

        Vector3d vectorA = new Vector3d(5,5,5);
        Vector3d vectorB = new Vector3d(1,3,7);

        System.out.println(OperationsForVectors.ScalarProduct(vectorA,vectorB));
        System.out.println(OperationsForVectors.VectorProduct(vectorA,vectorB));
        System.out.println(OperationsForVectors.SumOfVectors(vectorA,vectorB));

    }
}
