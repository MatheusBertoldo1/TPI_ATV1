/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;
import java.util.Scanner;
import app.Menu;
/**
 *
 * @author fatec-dsm2
 */
public class RestartMenu {
    //Instânciando o Scanner
    static Scanner input = new Scanner(System.in);
    
    //Instanciando a classe menu para exibir novamente
    static Menu menu = new Menu();
    
    //Método que faz o restart do menu
    public static void restart(boolean responseFormatError){ 
        //Exibir mensagem de retorno personalizada
        if(responseFormatError == true)
            System.out.println("Valor invaldo! Deseja tentar novamente? S/N");
        else 
            System.out.println("Deseja voltar ao menu? S/N");
        
        //Capta a resposta do usuário e reinicia ou finaliza o programa
        if("S".equals(input.nextLine().toUpperCase())){
            menu.start();
        }
        else{
            System.exit(0);
        }
    }
}
