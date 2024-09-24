import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;

public class HalloJavamitForEach {
    List<String> list;
    public HalloJavamitForEach(){
        this.list = new ArrayList<>();
        list.add("Hallo");
        list.add("Welt");
    }

    public void showList(){
        for (String s : list){
            System.out.println(s);
        }

        list.forEach(System.out::println);
    }
}
