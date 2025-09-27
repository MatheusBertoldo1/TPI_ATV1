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

//Instanciando a classe menu:
public class Ods {
    //variaveis:
    private static String resposta;
    // instanciando o scanner:
    private static Scanner input = new Scanner(System.in);
    
    // apresentando descrição das ODSs relacionadas ao Projeto:
    public static void start(){
        System.out.println("\n\n");
        System.out.println("|===========================================================|");
        System.out.println("|   Apresentando as ODSs Relacionadas ao Projeto   |");
        System.out.println("|===========================================================|");
        System.out.println("");
        System.out.println(" O nosso Projeto Integrador esta alinhado com as ODS 2: Fome Zero ");
        System.out.println(" e Agricultura Sustentavel e ODS 8: Trabalho Descente e Crescimento ");
        System.out.println(" Economico. A ODS 2 busca garantir acesso universal a alimentos ");
        System.out.println(" de qualidade e promover a agricultura sustentavel, aumentando a ");
        System.out.println(" produtividade e a renda dos pequenos produtores. Ja a ODS 8 visa ");
        System.out.println(" estimular o crescimento economico inclusivo e sustentavel, gerar empregos ");
        System.out.println(" produtivos e assegurar condicoes dignas de trabalho. ");
        System.out.println("");
        System.out.println("* O que nosso projeto aborda destas ODSs? *");
        System.out.println(" ___________________________________________________________");
        System.out.println("Nosso software contribui diretamente com esses objetivos ao reduzir ");
        System.out.println(" as perdas na producao da tangerina ponkan, assegurando alimentos melhor ");
        System.out.println(" qualidade e incentivando praticas agricolas mais sustentaveis. ");
        System.out.println(" Alem disso, apoia o aumento da renda dos agricultores, fortalece sua ");
        System.out.println(" competitividade no mercado e impulsiona a inovacao tecnologica no setor agrticola.");
        System.out.println("");
        System.out.println("* Achou interessante? Quer saber mais sobre o Projeto? Que tal acrescentar alguma ODS? *");
        System.out.println("* (Digite a letra correspondente abaixo) *");
        System.out.println(" ___________________________________________________________");
        System.out.println(" A ... Do que se Trata? ");
        System.out.println(" B ... Detalhes sobre as tecnologias ");
        System.out.println(" C ... Cadastrar nova secao ");
        
        //resposta do usuario:
        resposta = input.nextLine();
        
        //enviando resposta para verificação:
        returnBack(resposta);
        
        //Opção para voltar ao menu
        RestartMenu.restart(false);
    }
    
    //verificando as respostas do usuario:
    private static void returnBack(String letter){
        switch(letter.toUpperCase()){
            case "A" -> Presentation.start();
            case "B" -> ShowDetails.TechDetails();
            case "C" -> AddDetails.BuildDetail();
        }
    }
}
