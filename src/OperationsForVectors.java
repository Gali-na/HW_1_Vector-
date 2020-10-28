public class OperationsForVectors {

    public static int scalarProduct(Vector3d vectorA, Vector3d vectorB)  {

        return ( vectorA.getCoordinateX()* vectorB.getCoordinateX())
                + ( vectorA.getCoordinateY()* vectorB.getCoordinateY())
                + ( vectorA.getCoordinateZ()* vectorB.getCoordinateZ());

    }

    public static Vector3d vectorProduct(Vector3d vectorA, Vector3d vectorB)  {

        Vector3d vector3d= new Vector3d();

        vector3d.setCoordinateX((vectorA.getCoordinateY()*vectorB.getCoordinateZ()
                -vectorA.getCoordinateZ()*vectorB.getCoordinateY()));

        vector3d.setCoordinateY((vectorA.getCoordinateZ()*vectorB.getCoordinateX()
                        -vectorA.getCoordinateX()*vectorB.getCoordinateZ()));

        vector3d.setCoordinateZ((vectorA.getCoordinateX()*vectorB.getCoordinateY()
                        -vectorA.getCoordinateY()*vectorB.getCoordinateX()));
        return  vector3d;
    }

    public static Vector3d sumOfVectors(Vector3d vectorA, Vector3d vectorB)  {

        Vector3d vector3d= new Vector3d();
        vector3d.setCoordinateX(vectorA.getCoordinateX()+ vectorB.getCoordinateX());
        vector3d.setCoordinateY(vectorA.getCoordinateY()+ vectorB.getCoordinateY());
        vector3d.setCoordinateZ(vectorA.getCoordinateZ()+ vectorB.getCoordinateZ());
        return vector3d;
    }
}

