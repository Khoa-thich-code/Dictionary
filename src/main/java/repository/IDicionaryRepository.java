package repository;

import java.util.HashMap;

public interface IDicionaryRepository {
    
    void addNewWord(HashMap<String, String> hm);
    
    void deleteWord(HashMap<String, String> hm);
    
    void translate(HashMap<String, String> hm);
    
    boolean checkKeywordExist(HashMap<String, String> hm, String english);
    
    
}