import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskThreeStarter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            list.add(getIntegers());
        }
        Graph<Integer, DefaultEdge> graph = TaskThreeSolver.generateGraph(list);
        System.out.println(TaskThreeSolver.numberOfConnections(graph));
    }

    public static List<Integer> getIntegers() throws Exception {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        List<Integer> collect;
        try {
            collect = Arrays.stream(inputString.split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new Exception("Insert integers space separated");
        }
        return collect;
    }
}
