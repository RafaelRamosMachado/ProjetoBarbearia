/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

/**
 *
 * @author BRG
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        // Pegar um usuário da View
        Usuario usuario = helper.obterModelo();
        
        //Pesquisar Usuário no Banco
        //Se o usuário da View tiver mesmo usuário e senha que o usuário vindo do banco, direcionar para o menu principal
        //Se não mostrar uma mensagem ao usuário "Usuário ou senha inválidos"
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
