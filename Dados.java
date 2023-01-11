import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class Dados {

    public static ArrayList<String> leArquivo(String FileName) {

        ArrayList<String> nomes = new ArrayList<String>();

        try {

            FileReader file = new FileReader(FileName);
            BufferedReader leitura = new BufferedReader(file);

 
            String linha = leitura.readLine();

            linha = leitura.readLine();

            while (linha != null) {
                nomes.add(linha);
                linha = leitura.readLine();
            }


            leitura.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();

        }
        return (nomes);
    }

    public static void Escreve (ArrayList<String> data, String FileName, String nome){

        PrintWriter csvWriter;
        int i;

        try{

            File file = new File(FileName);

            if (!file.exists()){

                file = new File(FileName);
            }
                
            csvWriter = new PrintWriter(new FileWriter(file, true));
            
            csvWriter.println(nome);
            
            for (i=0 ; i < data.size() ; i++){

                csvWriter.println(data.get(i));
                i++;

                if (i < data.size()) {
                    
                    csvWriter.println(data.get(i));
                }
               
           }
            csvWriter.close();              
        }

        catch(Exception e){

            e.printStackTrace();
        }
    }
}
