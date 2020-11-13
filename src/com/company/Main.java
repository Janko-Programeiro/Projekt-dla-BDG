package com.company;

public class Main {

    public static void main(String[] args) {
    }
}

class Potegowanie {
    public static void main(String[] args) {
        double liczba_pierwsza = 3.0;
        int liczba_druga = 9;
        double wynik = Math.pow(liczba_pierwsza, liczba_druga);
        System.out.println("Liczba " + liczba_pierwsza + " podniesiona do potęgi " + liczba_druga + " to " + wynik );
    }
}

class Dodawanie {
    public static void main(String[] args ){
        double liczba_pierwsza = 6.4;
        int liczba_druga = 7;
        double wynik = liczba_pierwsza + liczba_druga;
        System.out.println("Wynik dodawnia liczby " + liczba_pierwsza + " i liczby " + liczba_druga + " to " + wynik );
    }
}

class Odejmowanie {
    public static void main(String[] args ){
        double liczba_pierwsza = 43.1;
        int liczba_druga = 6;
        double wynik = liczba_pierwsza - liczba_druga;
        System.out.println("Wynik odejmowania liczby " + liczba_pierwsza + " i liczby " + liczba_druga + " to " + wynik );
    }
}

class Mnozenie {
    public static void main(String[] args ){
        double liczba_pierwsza = 69.5;
        int liczba_druga = 4;
        double wynik = liczba_pierwsza * liczba_druga;
        System.out.println("Wynik możenia liczby " + liczba_pierwsza + " i liczby " + liczba_druga + " to " + wynik );
    }
}