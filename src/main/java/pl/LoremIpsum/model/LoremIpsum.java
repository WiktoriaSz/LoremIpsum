package pl.LoremIpsum.model;


import org.springframework.stereotype.Component;
import pl.LoremIpsum.dao.LoremIpsumDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class LoremIpsum implements LoremIpsumDao {

    private String[] words = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Aenean fringilla ex risus, vel imperdiet tellus vestibulum et. Donec ornare vel mauris eget tristique. " +
            "Ut egestas urna ac ipsum ullamcorper ornare. Maecenas feugiat ante lectus, eu volutpat odio sagittis in. " +
            "Praesent non nibh eget sapien elementum consectetur. Aenean mollis tristique massa eu dignissim. " +
            "Aliquam nec tincidunt ligula. " +
            "Proin non vestibulum eros. Etiam interdum diam sed purus bibendum, sed venenatis mi luctus. " +
            "In gravida ex ut justo faucibus vehicula. Etiam pharetra fermentum tortor sagittis viverra. " +
            "Aenean tempor molestie leo vitae tempor. Mauris dignissim, justo id mattis varius, " +
            "libero mauris vehicula magna, ornare fringilla quam ligula sit amet nibh. " +
            "Nunc sed elit at ipsum cursus facilisis. Nunc facilisis vitae sem sit amet sagittis. " +
            "Vestibulum id lectus dolor. " +
            "Integer rutrum orci interdum molestie porta. Sed vitae mi eu ante laoreet mattis ac fringilla nisi. " +
            "Aenean luctus at mi vel ullamcorper. Phasellus malesuada malesuada dapibus. " +
            "Nam interdum dolor a lectus blandit convallis non ut lorem. In eu dui egestas, ultrices nisl sit amet, " +
            "tincidunt arcu. Nulla semper enim ipsum, faucibus posuere urna dictum vestibulum. " +
            "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. " +
            "Quisque volutpat commodo mollis. Ut non mollis eros. Fusce mattis euismod justo, a faucibus leo faucibus in. " +
            "Vivamus et rhoncus arcu, a facilisis lectus. Morbi luctus ac arcu egestas pretium. " +
            "Donec hendrerit odio at sem cursus auctor. Ut et ullamcorper diam. Donec hendrerit quam at justo mattis, " +
            "lobortis placerat ipsum mattis. Pellentesque nunc nunc, finibus sed tincidunt ut, varius non leo. " +
            "Aliquam ac dolor maximus, semper ex quis, lobortis nisl. Pellentesque elementum felis nec maximus tempus. " +
            "Etiam egestas suscipit purus id sagittis. Sed ut orci ac nibh lobortis eleifend. " +
            "Curabitur auctor cursus felis, nec elementum elit. " +
            "Nulla viverra iaculis facilisis. Nulla in volutpat velit. Ut quis augue quis est commodo tincidunt a vel nibh. " +
            "Etiam sit amet ligula gravida, fermentum neque sed, congue turpis. Nullam eleifend, " +
            "velit ac blandit scelerisque, magna quam auctor arcu, eget pulvinar magna dolor quis neque. " +
            "Nam eget elit eu dui rutrum sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames " +
            "ac turpis egestas. Praesent malesuada arcu id nulla laoreet mollis. Sed id risus vehicula, malesuada quam id, " +
            "venenatis urna. Donec tincidunt vitae magna sed fermentum. Nullam tincidunt nunc sit amet orci ullamcorper, " +
            "dictum sagittis urna feugiat. ").split("\\s");


    @Override
    public List<String> getWords(int amount) {

        List<String> loremIpsumWords = new ArrayList<>();
        StringBuilder requiredAmount = new StringBuilder();

        for (int i = 0; i < amount; i++) {
            requiredAmount.append(words[i]);
            requiredAmount.append(' ');
        }

        loremIpsumWords.add(requiredAmount.toString());
        return loremIpsumWords;
    }


    @Override
    public List<String> getParagraphs(int amount) {
        String paragraph1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Aenean fringilla ex risus, vel imperdiet tellus vestibulum et. Donec ornare vel mauris eget tristique. " +
                "Ut egestas urna ac ipsum ullamcorper ornare. Maecenas feugiat ante lectus, eu volutpat odio sagittis in. " +
                "Praesent non nibh eget sapien elementum consectetur. Aenean mollis tristique massa eu dignissim. " +
                "Aliquam nec tincidunt ligula.";
        String pagagraph2 = "Proin non vestibulum eros. Etiam interdum diam sed purus bibendum, sed venenatis mi luctus. " +
                "In gravida ex ut justo faucibus vehicula. Etiam pharetra fermentum tortor sagittis viverra. " +
                "Aenean tempor molestie leo vitae tempor. Mauris dignissim, justo id mattis varius, " +
                "libero mauris vehicula magna, ornare fringilla quam ligula sit amet nibh. " +
                "Nunc sed elit at ipsum cursus facilisis. Nunc facilisis vitae sem sit amet sagittis. " +
                "Vestibulum id lectus dolor.";
        String paragraph3 = "Integer rutrum orci interdum molestie porta. Sed vitae mi eu ante laoreet mattis ac fringilla nisi. " +
                "Aenean luctus at mi vel ullamcorper. Phasellus malesuada malesuada dapibus. " +
                "Nam interdum dolor a lectus blandit convallis non ut lorem. In eu dui egestas, ultrices nisl sit amet, tincidunt arcu. " +
                "Nulla semper enim ipsum, faucibus posuere urna dictum vestibulum. " +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. " +
                "Quisque volutpat commodo mollis. Ut non mollis eros. Fusce mattis euismod justo, a faucibus leo faucibus in. " +
                "Vivamus et rhoncus arcu, a facilisis lectus. Morbi luctus ac arcu egestas pretium.";
        String paragraph4 = "Donec hendrerit odio at sem cursus auctor. Ut et ullamcorper diam. " +
                "Donec hendrerit quam at justo mattis, lobortis placerat ipsum mattis. " +
                "Pellentesque nunc nunc, finibus sed tincidunt ut, varius non leo. Aliquam ac dolor maximus, " +
                "semper ex quis, lobortis nisl. Pellentesque elementum felis nec maximus tempus. " +
                "Etiam egestas suscipit purus id sagittis. Sed ut orci ac nibh lobortis eleifend. " +
                "Curabitur auctor cursus felis, nec elementum elit.";
        String paragraph5 = "Nulla viverra iaculis facilisis. Nulla in volutpat velit. " +
                "Ut quis augue quis est commodo tincidunt a vel nibh. Etiam sit amet ligula gravida, " +
                "fermentum neque sed, congue turpis. Nullam eleifend, velit ac blandit scelerisque, " +
                "magna quam auctor arcu, eget pulvinar magna dolor quis neque. Nam eget elit eu dui rutrum sodales. " +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. " +
                "Praesent malesuada arcu id nulla laoreet mollis. Sed id risus vehicula, malesuada quam id, venenatis urna. " +
                "Donec tincidunt vitae magna sed fermentum. Nullam tincidunt nunc sit amet orci ullamcorper, " +
                "dictum sagittis urna feugiat.";

        List<String> maxParagraph = new ArrayList<>(Arrays.asList
                (paragraph1, pagagraph2, paragraph3, paragraph4, paragraph5));

        List<String> loremIpsumParagraphs = new ArrayList<>();

        if (amount <= 5) {
            for (int i = 0; i < amount; i++) {
                loremIpsumParagraphs.add(maxParagraph.get(i));
            }
            return loremIpsumParagraphs;

        } else {

                int repeats = amount / 5;
                for (int i = 0; i < repeats; i++) {
                    loremIpsumParagraphs.addAll(maxParagraph);
                }

                int reminder = (amount / repeats) % 5;
                for (int j = 0; j < reminder; j++) {
                    loremIpsumParagraphs.add(maxParagraph.get(j));
                }

                return loremIpsumParagraphs;
        }



    }

}
