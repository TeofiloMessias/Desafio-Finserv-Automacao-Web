#language: pt
#Version: 1.0
#Author:Teofilo
@Login
Funcionalidade: Login

  @loginSucesso
  Cenario: Fazer login com credenciais validas
   Dado que o usuario esteja na pagina de login
    Quando o usuario preecher as credencias de acesso
      | email 										 | password |
      | teofilo.messias@gmail.com  |teo123456 |
    Entao o usuario estara logado