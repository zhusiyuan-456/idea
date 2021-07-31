import java.util.List;
import java.util.Objects;

public class demo2 {
    public void hello(List<demo1> demo1s) {
       demo1s.sort((first,second)->first.getDay()-second.getYear());
       demo1s.removeIf(Objects::nonNull);

    }

}
