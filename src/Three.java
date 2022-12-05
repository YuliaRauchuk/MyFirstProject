public class Three {
        public static void main(String[] args) {
            int i;
            int[] Amoeba = new int[8];
            Amoeba[0] = 2;
            Amoeba[1] = 4;
            Amoeba[2] = 8;
            Amoeba[3] = 16;
            Amoeba[4] = 32;
            Amoeba[5] = 64;
            Amoeba[6] = 128;
            Amoeba[7] = 256;
            for (i = 0; i <= 256; i++) ;
            int sum = Amoeba[0] + Amoeba[1] + Amoeba[2] + Amoeba[3] + Amoeba[4] + Amoeba[5] + Amoeba[6] + Amoeba[7];
            {
                System.out.println(sum);
            }
        }
}
