public class Zapping {
    private static final int maxCanal = 99;
    private static final int minCanal = 0;

    public static int cambiarCanal(int origen, int destino){
        return vueltaCanales(origen, destino);
    }

    public static int vueltaCanales(int origen, int destino){
        int clics = calcularClics(origen, destino);
        int mediaCanal = 49;
        int restaDestino;
        int restaOrigen;
        int resultado;

        if (origen < destino){
            if (clics > mediaCanal){
                restaDestino = maxCanal - destino;
                restaOrigen = Math.abs(minCanal - origen);
                resultado = restaDestino + restaOrigen;
            } else {
                resultado = clics;
            }
        } else {
            restaDestino = maxCanal - origen;
            restaOrigen = Math.abs(minCanal - destino);
            resultado = restaDestino + restaOrigen;
        }
        return resultado;
    }

    public static int calcularClics(int origen, int destino){
        int clics;
        if (origen > destino) clics = origen - destino;
        else clics = destino - origen;

        return clics;
    }
}
