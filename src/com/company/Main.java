package com.company;

public class Main {

    char[] alfabet = {' ', 'A', 'B', 'C', 'D','E','F','G','H','I','J','K','L','M','N',
            'O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Å'};

    final int ALFABETMÆNGDE = 28;

    public int bogstaverTilTal(char inputBogstav){
        //Går igennem alle bogstaver indtil den finder hvilket tal passer til et char i alfabet Arrayet.
        for (int i = 0;ALFABETMÆNGDE >= i; i++ ){
            //Tjekker om alfabet Array er det samme som inputtet.
            if ( alfabet[i] == inputBogstav){
                //Returnerer tallet.
                return i;
            }
        }
        return 404;
    }

    public char taltilBogstaver(int inputTal) {
        //Spørger efter et char med det int fra input.
             char result = alfabet[inputTal];
             return result;
            }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.bogstaverTilTal('C'));
        System.out.println(obj.taltilBogstaver(0));
    }
}
