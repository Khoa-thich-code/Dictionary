package main;

import controller.DictionaryProgram;
import model.Dictionary;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        new DictionaryProgram(dictionary).run();
    }
    
}