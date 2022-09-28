import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class GroupingBy {
    public static void main(String[] args) {
        Map<Integer, List<Cliente>> collect = Cliente.list.stream()
                .collect(Collectors.groupingBy(e -> e.idade));

        System.out.println(collect);
    }
}





