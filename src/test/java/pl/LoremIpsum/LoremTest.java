package pl.LoremIpsum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.LoremIpsum.dao.LoremIpsumDao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoremTest {

    @Autowired
    private LoremIpsumDao loremIpsumDao;

    @Test
    public void start(){
        assertEquals(loremIpsumDao.getWords(6).get(0), "Lorem ipsum dolor sit amet, consectetur ");
        assertEquals(loremIpsumDao.getParagraphs(2).get(0)+" "+
                        loremIpsumDao.getParagraphs(2).get(1),
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Aenean fringilla ex risus, vel imperdiet tellus vestibulum et. Donec ornare vel mauris eget tristique. " +
                "Ut egestas urna ac ipsum ullamcorper ornare. Maecenas feugiat ante lectus, eu volutpat odio sagittis in. " +
                "Praesent non nibh eget sapien elementum consectetur. Aenean mollis tristique massa eu dignissim. " +
                "Aliquam nec tincidunt ligula. " +
                "Proin non vestibulum eros. Etiam interdum diam sed purus bibendum, sed venenatis mi luctus. " +
                "In gravida ex ut justo faucibus vehicula. Etiam pharetra fermentum tortor sagittis viverra. " +
                "Aenean tempor molestie leo vitae tempor. Mauris dignissim, justo id mattis varius, " +
                "libero mauris vehicula magna, ornare fringilla quam ligula sit amet nibh. " +
                "Nunc sed elit at ipsum cursus facilisis. Nunc facilisis vitae sem sit amet sagittis. " +
                "Vestibulum id lectus dolor.");
        assertEquals(10, loremIpsumDao.getWords(10).get(0).split("\\s").length);
        assertEquals(loremIpsumDao.getParagraphs(7).get(6), "Proin non vestibulum eros. " +
                "Etiam interdum diam sed purus bibendum, sed venenatis mi luctus. " +
                "In gravida ex ut justo faucibus vehicula. Etiam pharetra fermentum tortor sagittis viverra. " +
                "Aenean tempor molestie leo vitae tempor. Mauris dignissim, justo id mattis varius, " +
                "libero mauris vehicula magna, ornare fringilla quam ligula sit amet nibh. " +
                "Nunc sed elit at ipsum cursus facilisis. Nunc facilisis vitae sem sit amet sagittis. " +
                "Vestibulum id lectus dolor.");
        assertEquals(loremIpsumDao.getParagraphs(10).get(5), loremIpsumDao.getParagraphs(10).get(0));
    }
}
