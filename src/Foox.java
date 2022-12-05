public class Foox {
    public static void main(String[] args){
        int a=0;
        for(int i=2;i<=20;i++){
            if(i%2==0)a++;
        }
        int[] Mas = new int[a];
        for(int i=2,b=0;i<=20;i++){
            if(i%2==0){
                Mas[b]=i;
                System.out.print(Mas[b]+" ");
                b++;
            }
        }
        //Выведем на экран каждый элемент массива на отдельной строке
        System.out.println(" ");
        for(int i=0;i<Mas.length;i++){
            System.out.println(Mas[i]);
        }
    }
}