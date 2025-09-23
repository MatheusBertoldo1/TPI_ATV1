/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import java.util.Scanner;
import utilities.ShowContent;
/**
 *
 * @author fatec-dsm2
 */
public class Menu {  
    //Variáveis 
    private String response;
    //Instânciando o Scanner
    Scanner input = new Scanner(System.in);
    
    //Método para iniciar o menu
    public void start(){
        welcome();
    }

    //Boas vindas e cabeçalho
    private void welcome(){
        System.out.println("\n\n");        
        System.out.println("|===========================================================|");
        System.out.println("|   Bem vindo ao Sistema informativo do Projeto Integrador  |"); 
        System.out.println("|===========================================================|");
        System.out.println("");            
        System.out.println("* O que gostaria de saber? (digite o numero da escolha)*");            
        System.out.println(" ___________________________________________________________");
        System.out.println("");                    
        System.out.println("1 ....... Do que se trata");
        System.out.println("2 ....... ODS relacionadas ao projeto");
        System.out.println("3 ....... Equipe desenvolvedora");
        System.out.println(" ___________________________________________________________");       
        System.out.println("");
        
        response = input.nextLine();
        
        ShowContent.Show(response);
    }  
}
