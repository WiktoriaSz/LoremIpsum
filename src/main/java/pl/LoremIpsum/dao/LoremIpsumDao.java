package pl.LoremIpsum.dao;

import java.util.List;

public interface LoremIpsumDao {
    List<String> getWords(int a);
    List<String> getParagraphs(int a);
}
