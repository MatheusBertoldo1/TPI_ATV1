/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.util.Scanner;
import pages.Presentation;
/**
 *
 * @author fatec-dsm2
 */
public class AddDetails {

    //  instanciando scanner para entrada de dados
    private static Scanner input = new Scanner(System.in);
    //  matriz que guarda os detalhes que o usuario adicionou
    private static String[][] newDetail = new String[3][21];

    //  método para capturar dados do novo detalhe
    public static void BuildDetail() {
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

        //  variavel que marca a ultima posicao
        int last;
        
        // guardando conteudo em uma matriz
        
        // verificando ultima posicao do array para adicionar o detalhe
        for (int i = 0; i < 21; i++) {
            if (newDetail[0][i] == null) {
                last = i; // achando a posicao 'vazia'
                // preenchendo a posicao com nova secao
                newDetail[0][i] = index;
                newDetail[1][i] = name;
                newDetail[2][i] = text;
                break;
            }
        }
        
        // exibindo opcoes da pagina Presentation novamente
        System.out.println("* O que gostaria de saber? (digite a letra da escolha)*");     
        System.out.println(" ___________________________________________________________");
        System.out.println(" A ... O problema a ser resolvido ");
        System.out.println(" B ... Detalhes sobre as tecnologias ");
        System.out.println(" D ... Cadastrar nova secao! ");
        
        // exibindo novo conteudo
        for(int i = 0; i < 21; i++){
            if(newDetail[0][i] != null){
                    System.out.println( " " + newDetail[0][i] + "..." + newDetail[1][i] + " ");
            }
        }
        
        // abrindo para nova resposta do usuario
        Presentation.options();
        
    }
}
