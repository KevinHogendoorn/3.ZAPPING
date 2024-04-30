public class Zapping {
    public static int cambiarCanal(int origen, int destino){
        int clics;
        if (origen > destino) clics = origen - destino;
        else clics = destino - origen;

        return clics;
    }
}
