package repository;

import data_access.DictionaryDao;
import java.util.HashMap;

public class DicionaryRepository implements IDicionaryRepository{

    private HashMap<String, String> hm;

    public DicionaryRepository() {
        this.hm = new HashMap<>();
    }        

    @Override
    public void addNewWord(HashMap<String, String> hm) {
        DictionaryDao.Instance().addNewWord(hm);
    }

    @Override
    public void deleteWord(HashMap<String, String> hm) {
        DictionaryDao.Instance().deleteWord(hm);
    }

    @Override
    public void translate(HashMap<String, String> hm) {
        DictionaryDao.Instance().translate(hm);
    }

    @Override
    public boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        return DictionaryDao.Instance().checkKeywordExist(hm, english);
    }
 
    
    
    
    
}