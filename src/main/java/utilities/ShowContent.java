/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;
import pages.Ods;
import pages.Presentation;
import pages.Team;

/**
 *
 * @author fatec-dsm2
 */
public class ShowContent {
    private static int numberResponse;
    
    public static void Show(String response){
        //Tenta converter a resposta de String para int // Em caso de erro chama mensagem de erro e reset
        try {
            numberResponse = Integer.parseInt(response);                 
        } 
        catch (NumberFormatException e) {
            RestartMenu.restart(true);
        }
        
        //Chamar classe responsável pelo conteúdo
        switch(numberResponse){
            case 1 -> Presentation.start();
            case 2 -> Ods.start();
            case 3 -> Team.start();
            default -> RestartMenu.restart(true);
        }
    }
}
