public class Switch {
    public static void main(String[] args) {
        String estacion = "";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otonio":
                System.out.println("Estamos en otonio");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }
}
