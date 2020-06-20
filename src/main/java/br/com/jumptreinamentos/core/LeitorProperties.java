package br.com.jumptreinamentos.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LeitorProperties {
	
	public static Properties getProp() throws  IOException {
		Properties props = new Properties();
        FileInputStream file = new FileInputStream(
                "./properties/config.properties");
        props.load(file);
        return props;
	}	
        public static void  main(String args[]) throws IOException {
            String senha; //Variavel que guardará a senha
            String email; //Variavel que guardará email
            
            
            Properties prop = getProp();
            
            senha = prop.getProperty("senha");
            email = prop.getProperty("email");
            
             
            System.out.println("Senha = " + senha);
            System.out.println("Email = " + email);
        }
	}



