package com.company;

/**
 * Classe Greeting qui contient une seul méthode Greet.
 */
public final class Greeting {
    /**
     * Méthode qui permet d'afficher de saluer une personne.
     * @param name est le nom de la personne.
     * @return message
     */
    public String greet(final String name) {
        return "Hello " + name;
    }
}
