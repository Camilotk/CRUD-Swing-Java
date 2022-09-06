package br.com.utfpr.proj.projespjava;

import java.io.*;

public class Leitura {
    public String entDados (String rotulo) {
        System.out.print(rotulo);
        
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(teclado);
        
        String lido = "";
        
        try {
            lido = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return lido;
    }
    
}
