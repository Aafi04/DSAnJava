import java.util.*;

public class dynamicarr {
    public static void main(String[] args) {
/*      ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(564);
        arrlist.add(562);
        arrlist.add(56334);
        arrlist.add(5436);

        for (int i : arrlist) {
            System.out.print(i + " ");
        } */

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                list.get(r).add(input.nextInt());
            }
        }


        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }
        input.close();
    }
}