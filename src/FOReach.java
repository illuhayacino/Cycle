public class FOReach {
    public static void main(String[] args) {



            int[] rarr = new int[10];

            for (int i = 0; i < rarr.length; i++) {
                rarr[i] = (int) Math.round((Math.random() * 10));
            }

            for (int i = 0; i < rarr.length; i++) {
                System.out.print(rarr[i] + " ");
            }

        for (int i = 0; i < rarr.length; i++) {

            if (rarr[i] == 5){
                System.out.println(rarr[i]);
            }
        }
    }
}
