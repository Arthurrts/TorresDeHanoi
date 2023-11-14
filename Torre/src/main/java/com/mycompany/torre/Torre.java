/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torre;

/**
 *
 * @author thuts
 */
public class Torre {
    public static void main(String[] args) {
       long nDiscos = 41;
       
       long iniciar = System.currentTimeMillis();
       
       long movimentos = resolverTorre(nDiscos, 'A', 'C', 'B');
       
       long parar = System.currentTimeMillis();
       
       long tempoTotal = parar - iniciar;
       
       System.out.println("Tempo total: " + formatarTempo(tempoTotal));
       System.out.println("Movimentos realizados: " + movimentos);
    }

public static long resolverTorre(long n, char origem, char destino, char auxiliar){
        if(n == 1){
            return 1;
        }
        
        long movimentos = 0;
        movimentos += resolverTorre(n - 1, origem, auxiliar, destino);
        movimentos++;
        movimentos += resolverTorre(n - 1, auxiliar, destino, origem);
        
        return movimentos;
    }

public static String formatarTempo(long millis){
    long segundos = millis / 1000;
    long minutos = segundos / 60;
    long horas = minutos / 60;
    long milissegundos = millis % 1000;
    
    return String.format("%02d:%02d:%02d:%03d", horas, minutos % 60, segundos % 60, milissegundos);
}
}