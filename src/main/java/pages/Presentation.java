/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;
import utilities.RestartMenu;
import utilities.ShowDetails;
import java.util.Scanner;
import utilities.AddDetails;

/**
 *
 * @author fatec-dsm2
 */
public class Presentation {
    //  guarda a entrada do usuario
    private static String userResponse; 
    //  scanner -> entrada de dados
    private static Scanner input = new Scanner(System.in);
    
    public static void start(){
        System.out.println("\n\n");
        System.out.println("|===========================================================|");
        System.out.println("|   Descricao do Projeto Integrador  |");
        System.out.println("|===========================================================|");
        System.out.println("");
        System.out.println("* Identificacao da Pinta Preta na tangerina Ponkan, usando Visao Computacional *");
        System.out.println(" ___________________________________________________________");
        System.out.println("");
        System.out.println(" Nosso projeto integrador esta localizado na area de agricultura, ");
        System.out.println(" mais especificamente para a cultura da tangerina Ponkan, que e ");
        System.out.println(" uma fruta bastante influente no Vale do Ribeira. ");
        System.out.println(" A proposta e construir um aplicativo mobile para identificar, ");
        System.out.println(" usando fotos tiradas na camera do celular, a presenca da doenca");
        System.out.println(" fungica conhecida como Pinta Preta, considerada uma das mais ");
        System.out.println(" importantes na citricultura brasileira e mundial. ");
        System.out.println("");    
        System.out.println("* O que gostaria de saber? (digite a letra da escolha)*");     
        System.out.println(" ___________________________________________________________");
        System.out.println(" A ... O problema a ser resolvido ");
        System.out.println(" B ... Detalhes sobre as tecnologias ");
        System.out.println(" D ... Cadastrar nova secao! ");
        System.out.println("");
        
        //instanciando matriz com os cadastros do usuário
        String matriz[][] = AddDetails.newDetail;
        
        //exibindo os cadastros
        for (int i = 0; i < 21; i++) {
            if (matriz[i][0] != null) {
                System.out.println(" " + matriz[i][0] + "..." + matriz[i][1] + " ");
            }
        }
        
        //abrindo p/ resposta
        options();
    }
    
    //resposta do usuario
    public static void options() {  
        //capturando
        userResponse = input.nextLine();
        
        //verificando
        returnBack(userResponse);
        
        //opção para retornar ao menu
        RestartMenu.restart(false);
    }
    
    //chamando descrição correspondente
    private static void returnBack(String letter){
        switch(letter.toUpperCase()){
            case "A" -> ShowDetails.ProblemDetails(); 
            case "B" -> ShowDetails.TechDetails();
            case "D" -> AddDetails.BuildDetail();
            default -> AddDetails.ShowNewDetail(letter);
        }
    };
}
