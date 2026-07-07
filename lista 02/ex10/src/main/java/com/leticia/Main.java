package com.leticia;

public class Main {
    public static void main(String[] args) {
        Perfil perfil = new Perfil("Só Computando", "foto_perfil.jpg", "Privado");
        Usuario usuario = new Usuario("hirata.yui", "leticiayuihirata@gmail.com", perfil);

        usuario.exibirUsuario();
    }
}
