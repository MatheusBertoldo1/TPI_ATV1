/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class AddDetails {
    //  instanciando scanner para entrada de dados
    private static Scanner input = new Scanner(System.in);
    //  propriedades da nova seção de detalhes
    private static String detailName;
    private static String detailText;
    private static String detailIndex;
    
    //  método para capturar dados do novo detalhe
    public static void BuildDetail(){
        //  variaveis para capturar dados
        String name; 
        String text;
        String index;
        
        //  capturando dados
        System.out.println(" Digite a letra indice da nova secao: ");
        index = input.nextLine();
        System.out.println(" Digite o nome da nova secao: ");
        name = input.nextLine();
        System.out.println(" Digite o texto da nova secao: ");
        text = input.nextLine();
        
        //  armazenando dados
        detailIndex = index;
        detailName = name;
        detailText = text;
        
        //  movendo dados para lista do menu de descrição
        ShowDetails.NewDetails(detailIndex, detailName, detailText);
    }
    
    
}
