package primitivewritechars;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.String.valueOf;

/**
 *
 * @author oracle
 */
public class Primitivewritechars {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       // /home/oracle/NetBeansProjects/Primitivewritechars/Text4.txt
        String texto = "Esta e unha cadea\n";

        DataInputStream text = new DataInputStream(new BufferedInputStream(new FileInputStream("/home/oracle/NetBeansProjects/Primitivewritechars/Text4.txt")));
        DataOutputStream tex = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/oracle/NetBeansProjects/Primitivewritechars/Text4.txt")));

        for (int i = 1; i <= 2; i++) {
           
            tex.writeChars(texto+valueOf(i));
            System.out.println("WriteChars escribiu: "+texto);
            System.out.println("WriteChars escribiu: " + (tex.size() / i) + " bytes");
        }

        System.out.println("Bytes totais escritos: " + tex.size());
        tex.close();
        String cadea="";
        for (int i = 0; i<texto.length()+1; i++) {
            cadea += text.readChar();
        }
        System.out.println("Lemos a primeira cadea: " + cadea);
            
        System.out.println("Número de bytes lidos: " + (cadea.length()*2)+ " bytes");
        System.out.println("Bytes restantes por ler: " + text.available() + " bytes");
        cadea="";
        for (int i = 0; i<texto.length()+1; i++) {
            cadea += text.readChar();
        }
        System.out.println("Lemos a segunda cadea: " + cadea);
            
        System.out.println("Número de bytes lidos: " + (cadea.length()*2)+ " bytes");
        System.out.println("Bytes restantes por ler: " + text.available() + " bytes");
           
        text.close();
        }   
    }
    
    

