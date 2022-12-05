public class Four {
        public static void main (String[] args) {
            int[] Numbers = new int[8];
            Numbers[0] = 2;
            Numbers[1] = 4;
            Numbers[2] = 8;
            Numbers[3] = 16;
            Numbers[4] = 32;
            Numbers[5] = 64;
            Numbers[6] = 128;
            Numbers[7] = 256;
            int res = Numbers[0] + Numbers[1] + Numbers[2] + Numbers[3] + Numbers[4] + Numbers[5] + Numbers[6] + Numbers[7];
            {
                System.out.println(res);
            }
        }
}
