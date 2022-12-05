public class Fott {
    public static void main(String[] args){
        int[] Mas=new int[4];
        for(int i=0;i<Mas.length;i++){
            Mas[i]=(int)(Math.random()*90+10);
            System.out.print(Mas[i]+" ");
        }
        for(int i=0;i<Mas.length;i++){
            if(i>0){
                if(Mas[i-1]>=Mas[i]){
                    System.out.println("Прогрессия не возрастающая");
                    break;
                }
            }
            //Если перебрали все значения элементов массива и цикл не прервался - выводим сообщение о том, что последовательность возрастающая
            if(i==Mas.length-1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}