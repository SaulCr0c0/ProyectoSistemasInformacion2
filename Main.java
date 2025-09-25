public class Main {
    public static void main(String[] args) {

        String nombre = "Juan";
        String apellido = "Pérez";
        String colegio = "Colegio Nacional Mirador";
        int edad = 18;
        String carrera = "Ingeniería de Sistemas";
        String ci = "6785234";
        int añoRegistro = 2020;
        String documentos = "CI, Titulo Bachiller";

        String sql = "INSERT INTO postulantes  ('" + nombre + "', '" + apellido + "', '" + colegio + "', " + edad +
                ", '" + carrera + "', '" + ci + "', " + añoRegistro + ", '" + documentos + "');";

        System.out.println("SQL INSERT:");
        System.out.println(sql);
    }
}
