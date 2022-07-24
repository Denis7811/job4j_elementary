package array;

public class ArrayDefinition1 {
    public static void main(String[] args) {
        short[] ages=new short[10];
        String[] surnames=new String[100500];
        float[] prices=new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        String[] names=new String[4];
        names[1]="Denis";
        System.out.println(names[1]);
    }
}
