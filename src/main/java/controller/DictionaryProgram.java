package controller;

import java.util.HashMap;
import model.Dictionary;
import repository.DicionaryRepository;

import view.Menu;
import repository.IDicionaryRepository;

public class DictionaryProgram extends Menu<String>{
    static String[] mc = {"Add new word.", "Delete word.", "Search word.", "Exit"};
    
    private IDicionaryRepository dicionaryRepository;
    
    protected HashMap<String, String> hm;
    
    public DictionaryProgram(Dictionary dictionary) {
        super("=====================  Dictionary Program =====================", mc);
        dicionaryRepository = new DicionaryRepository();
        hm = dictionary.getHm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                dicionaryRepository.addNewWord(hm);
                break;
            case 2:
                dicionaryRepository.deleteWord(hm);
                break;
            case 3:
                dicionaryRepository.translate(hm);
                break;
            case 4:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    
}