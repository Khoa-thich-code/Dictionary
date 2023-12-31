package data_access;

import common.Library;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DictionaryDao {
    private static DictionaryDao instance = null;
    private Library library;

    public DictionaryDao() {
        this.library = new Library();
    }     
    
    public static DictionaryDao Instance() {
        if (instance == null){
            synchronized (DictionaryDao.class) {
                if (instance == null){
                    instance = new DictionaryDao();
                }
            }
        }
        return instance;
    }

    public void addNewWord(HashMap<String, String> hm) {
        System.out.print("Enter Enlish: ");
        String english = library.inputString();
        if (!checkKeywordExist(hm, english)) {
            if (!library.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = library.inputString();
        hm.put(english, vietnam);
        System.err.println("Add successful.");
    }
    public void deleteWord(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = library.inputString();
        hm.remove(english);
        System.err.println("Delete successful.");
    }
    public void translate(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = library.inputString();
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry entry : entries) {
            if (entry.getKey().equals(english)) {
                System.out.println("Vietnamese: " + entry.getValue());
                return;
            }
        }
        System.err.println("Not found in data");
    }
    public boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            if (english.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }
}