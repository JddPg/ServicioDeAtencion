package serviciodeatencionalrestaurante;
import java.util.*;

public class App {

    public int calcularTiempoEsperaVIP(int[] pedidos, int k) {
        
        int minutosTranscurridos = 0;

        Queue<Integer> fila = new LinkedList<>();

        int temp = 0;
        int kaux = k;

        for (int pedido : pedidos) {
            fila.add(pedido);
        }
        
        while (true) {
            
            temp = fila.remove();
            
            

            temp--;
            minutosTranscurridos++;

            

            if (temp == 0 && kaux == 0) {
                break;
            }

            if (temp > 0) {
                fila.add(temp);
                
            }
            kaux--;

            if (kaux == -1) {
                kaux = fila.size() - 1;
            }
            
            
        } 
            
        
        return minutosTranscurridos;

    }

    public static void main(String[] args) {
        
        App sistema = new App();
        
        int[] pedidos1 = {2, 3, 2};
        System.out.println("Prueba 1: " + sistema.calcularTiempoEsperaVIP(pedidos1, 2)); // Esperado: 6
        
        int[] pedidos2 = {5, 1, 1, 1};
        System.out.println("Prueba 2: " + sistema.calcularTiempoEsperaVIP(pedidos2, 0) ); // Esperado: 8

        int[] pedidos3 = {1, 2, 3, 4, 5};
        System.out.println("Prueba 3: " + sistema.calcularTiempoEsperaVIP(pedidos3, 2) ); // Esperado: 10
    }
}
        
    
    
