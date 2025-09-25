/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

/**
 *
 * @author fatec-dsm2
 */
public class ShowDetails {

    //  matriz que guarda os detalhes que o usuario adicionou
    private static String[][] newDetail = new String[3][24];
    
    //  exibe os detalhes sobre o problema
    public static void ProblemDetails() {
        System.out.println("");
        System.out.println(" -> A pinta preta e causada pelo fungo Phylloscticta citricarpa ");
        System.out.println("    que se multiplica em frutos, folhas e ramos secos");
        System.out.println("    da planta. Causa queda prematura dos frutos e afeta");
        System.out.println("    a parte externa das frutas, gerando altos prejuizos");
        System.out.println("    para as vendas de citros.");
        System.out.println("");
    }

    //  exibe os detalhes sobre as tecnologias que vamos usar
    public static void TechDetails() {
        System.out.println("");
        System.out.println(" -> O projeto se baseia em visao computacional e inteligencia ");
        System.out.println("    artificial. Os algoritmos de IA vao tratar e extrair dados");
        System.out.println("    importantes das fotos que o usuario capturar, e apos estudar");
        System.out.println("    uma base de dados com diversas imagens da doenca, vai ser");
        System.out.println("    capaz de gerar a probabilidade de infeccao da planta com a");
        System.out.println("    pinta preta. Prentendemos alocar nossa IA e nossos bancos");
        System.out.println("    de dados em nuvem tambem.");
        System.out.println("");
    }

    //  exibe os detalhes que o usuario adicionou
    public static void NewDetails(String index, String name, String text){
        //  variavel que marca a ultima posicao
        int last;
        // verificando ultima posicao do array para adicionar o detalhe
        for(int i = 0; i < 24; i++){
            if(newDetail[0][i] == null){
                last = i;
                break;
            }
        }
        
        //
    }
}
