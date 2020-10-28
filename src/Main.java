public class Main {
    public static void main(String[] args) {

        Vector3d vectorA = new Vector3d(5,2,8);
        Vector3d vectorB = new Vector3d(1,3,7);

        System.out.println(OperationsForVectors.scalarProduct(vectorA,vectorB));
        System.out.println(OperationsForVectors.vectorProduct(vectorA,vectorB));
        System.out.println(OperationsForVectors.sumOfVectors(vectorA,vectorB));

    }
}
