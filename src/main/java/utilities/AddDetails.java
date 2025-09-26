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

    //scanner -> entrada de dados
    private static Scanner input = new Scanner(System.in);
    //matriz que guarda os cadastros (publica)
    public static String[][] newDetail = new String[21][3];

    //método para cadastrar nova descrição
    public static void BuildDetail() {
        //variaveis para cadastrar
        String name;
        String text;
        String index;

        //capturando dados
        System.out.println(" Digite a letra indice da nova secao: ");
        index = input.nextLine();
        System.out.println(" Digite o nome da nova secao: ");
        name = input.nextLine();
        System.out.println(" Digite o texto da nova secao: ");
        text = input.nextLine();

        //variavel que marca a próxima posição vazia da matriz
        int last;

        // guardando conteudo em uma matriz
        for (int i = 0; i < 21; i++) {
            if (newDetail[i][0] == null) {
                last = i; //achando a posicao 'vazia'
                //preenchendo a posicao com nova secao
                newDetail[i][0] = index;
                newDetail[i][1] = name;
                newDetail[i][2] = text;
                break;
            }
        }

        //exibindo opções da pagina Presentation novamente
        System.out.println("* O que gostaria de saber? (digite a letra da escolha)*");
        System.out.println(" ___________________________________________________________");
        System.out.println(" A ... O problema a ser resolvido ");
        System.out.println(" B ... Detalhes sobre as tecnologias ");
        System.out.println(" D ... Cadastrar nova secao! ");

        //exibindo index e titulo
        for (int i = 0; i < 21; i++) {
            if (newDetail[i][0] != null) {
                System.out.println(" " + newDetail[i][0] + "..." + newDetail[i][1] + " ");
            }
        }

        //abrindo para nova resposta do usuario
        Presentation.options();
    }

    public static void ShowNewDetail(String letter) {

        //exibindo nova descricao
        for (int i = 0; i < 21; i++) {
            if (newDetail[i][0] != null && newDetail[i][0].equals(letter)) {
                System.out.println(" -> " + newDetail[i][2] + " ");
            }
        }

        //Opção para voltar ao menu
        RestartMenu.restart(false);
    }
}
