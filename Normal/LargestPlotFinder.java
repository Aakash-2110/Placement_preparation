import java.util.*;

public class LargestPlotFinder {

    static class House {
        int houseNum;
        int position;

        House(int houseNum, int position) {
            this.houseNum = houseNum;
            this.position = position;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<House> houses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int pos = sc.nextInt();
            houses.add(new House(num, pos));
        }

        // Sort by position
        houses.sort(Comparator.comparingInt(h -> h.position));

        int maxGap = -1;
        int house1 = -1, house2 = -1;

        for (int i = 0; i < n - 1; i++) {
            int gap = houses.get(i + 1).position - houses.get(i).position;
            if (gap > maxGap) {
                maxGap = gap;
                house1 = houses.get(i).houseNum;
                house2 = houses.get(i + 1).houseNum;
            }
        }

        // Print in ascending order
        if (house1 < house2) {
            System.out.println(house1 + " " + house2);
        } else {
            System.out.println(house2 + " " + house1);
        }
    }
}
