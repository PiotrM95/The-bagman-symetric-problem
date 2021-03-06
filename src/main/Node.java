package main;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@Setter
public class Node implements Comparable<Node> {
    private int indexCity;
    private Node parent;
    private List<Integer> way;
    private double cost;;


    public Node(Node parent, double cost, int indexCity) {

        if (parent == null) {
            this.parent = null;
            this.cost = 0.0;
            way = new ArrayList<>();
            way.add(indexCity);

        } else {
            this.parent = parent;
            this.cost = parent.getCost() + cost;
            way = new ArrayList<>(parent.getWay());
            way.add(indexCity);

        }

        this.indexCity = indexCity;
    }
    @Override
    public int compareTo(Node node) {

            return Double.compare(this.cost, node.getCost());


    }
}
