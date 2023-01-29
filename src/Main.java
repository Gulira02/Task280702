public class Main {
    public static void main(String[] args) {
        // Scanner scanner=new Scanner(System.in);
      /*  int num= scanner.nextInt();//5
        while(num>0){
            System.out.println(num+" ");
            num--;// otvet:5 ,4 , 3, 2, 1
        }*/
        /*double num2= scanner.nextInt(); //5
        double num3= scanner.nextInt();//10
        while (num2<num3) { //5<10
            num2++;
           System.out.println(Math.pow(num2,2)); //25.0, 36.0, 49.0, 64.0, 81.0

        }*/

        // Консолдон бир сан бериниз жана ал санга чейинки жуп сандарды чыгарыныз
    /*    int num = scanner.nextInt();
        while (1 < num) {
            num--;
            if (num % 2 == 0) {
                System.out.println(num);

            }
        }//  otvet: 8, 6,4,2*/
        /*int num = scanner.nextInt();
        int counter = 1;
        while (counter < num) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }// otvet: 2 ,4, 6, 8*/

        //    6 for loops
        // Консолдон бир сан бериниз  берген саныныз качан 0дон чон болсо
        // цикл бесконечно иштей берсин качан 0дон  кичине болгондо цикл токтосун
        /*Scanner scanner=new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a < 0) {
                break;
            }
        }
        System.out.println("THE END");*/

        /*Scanner scanner=new Scanner(System.in);
        for (;true;){
            int a = scanner.nextInt();
            if (a < 0) {
                break;
            }
        }
        System.out.println("THE END");*/

        // 10 санын кемуу тартибинде чыгар 10,9,8,7,6,5,4,3,2,1
        /*for (int i =10; i>0; i--) {
            System.out.println(i);
        }*/

        // 5тин таблицасын чыгар
        /*for (int i = 1; i < 10; i++) {
            int a=5;
            System.out.println((i+" * "+a+" = "+(a*i)));
        }*/

        // Таблица умножения чыгар
        /*Scanner scanner=new Scanner(System.in);
            int scanNumber= scanner.nextInt();
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d =%d \n", scanNumber, i, i * scanNumber);
            }*/

        //for loop менен декремент кылып кобойтуп берсин 100,81,64...
        /*for (int i = 10; i>1; i--) {
            System.out.println(i*i);
        }*/

        // Консолдон бир сан алыныз .
        // Берилген санга чейинки так сандардын чыгарып . Алардын суммасын табыныз
        // Мисалы: 10 Жооп: 2,4,6,8=20
        /*Scanner scanner=new Scanner(System.in);
        int scanNumber= scanner.nextInt();
        int summa=0;
        for (int i = 0; i < scanNumber; i++) {
            if(i%2==0){
                summa += i;
            }
        }
        System.out.println(summa);*/

        // 2нин 1-10 чейинки даражаларын консолго чыгарыныз
        /*for (int i = 1; i <= 10; i++) {
            System.out.println( i+" "+Math.pow(2,i));
        }*/


        // Табдица умножения while бесконечно таблицаны чыгарып бер 5 десен 5тин таблицасы чыгат
        // 9 жазсан 9дун таблицасы чыгат
       /* Scanner scanner=new Scanner(System.in);
        while (true) {
            int scanNumber= scanner.nextInt();
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d =%d \n", scanNumber, i, i * scanNumber);
            }
        }*/

        //Nested for loops  колдонуп таблица умножения чыгар
        /*for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <=10; j++) {
                System.out.printf("%d * %d = %d \n  ",i,j,i*j);
            }
        }*/

        //7 Массивы
        /*int[] var1 =new int[]{1,2,3,4,5};
        int[] var2={1,2,3,4,5,6};
        int [] var3=new int[5];
         Arraysтин турлору*/


        /*int [] var3=new int[4];
       System.out.println(var3.length);*/// Маасивдин размерин чыгарып алуу

       /* int[] var2={1,2,3,4,5,6};
        System.out.println(var2[1]); */// Кандайдыр бир индекстеги маанини чыгарып берет

        /*int [] var3=new int[]{1,6,77,54,3};
        for (int i = 0; i <var3.length; i++) {
            System.out.println(Arrays.toString(var3));}*/// МАссивдин баардык маанилери чыгаруу

       /* Random random=new Random();
        int [] var3=new int[5];
        for (int i = 0; i < var3.length ; i++) {
            var3[i]= random.nextInt(1,35);
            System.out.println(var3[i]);
        }*///Массивди рандом сандар менен толтуруу

        //Массивди рандом сандар менен толтуруп орточо арифмет санын тап
    /*    Random random=new Random();
        int [] var3=new int[5];
        int summa=0;
        for (int i = 0; i < var3.length ; i++) {
            var3[i]= random.nextInt(1,20);
          summa+=var3[i];
          System.out.print(var3[i]+"\n ");
        }
        System.out.println("summa"+summa/ var3.length);*/

        //Консолдон уч сан алып, алардын суммасын, кобойтуусун жана
        // арифметикалык орточо санын табыш керек.
        //Мисалы консолго: 5 7 8 деп жазып
        //Жообу катары томондогудой жоопту алышыбыз керек:
        //5 + 7 + 8 = 20
        //5 * 7 * 8 = 280
        //(5 + 7 + 8) / 3 = 6.6666666667
       /* Scanner scanner =new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        double num3= scanner.nextDouble();
        System.out.println(num1 + num2 + num3);
        System.out.println(num1 * num2 * num3);
        System.out.println((num1 + num2 + num3)/3);*/

        //Уч убакыт брилген консолдон (саат, минута, секунда)
        //Ал убакытты секундага айландырып консольго чыгарыныз
        //Мисалы: саат: 1, минута: 1,  секунда: 1.
        //Жооп: секунда: 3661
       /* Scanner scanner =new Scanner((System.in));
        int minute= scanner.nextInt();
        int hour= scanner.nextInt();
        int second= scanner.nextInt();
        System.out.println(hour*3600+minute*60+second%60);*/


        //Консолдон бир сан бериңиз, анын канча орундуу сан экенин консолго чыгарыңыз
        /*int num = scanner.nextInt();//123
        int counter = 0;
        System.out.println("Бул " + num + " саны:"); //123
        while (num > 0) {//123>0
            num /= 10; //123/10=2
            counter++; //0 =1
        }
        //2  + 1 = 3
        System.out.println(num + counter);*/

        //Дано 3х-значное число через консоль.
        //Надо за каждой цифрой поставить запятую и вывести на консоль.
        //С консоли: 567
        //На консоль: 5,6,7
        /*int  u,t,h;
        int num = scanner.nextInt(); //123
           u= num / 100;//123/100= 1
           t= num %100/10; //123%100/10= 23/10= 2
           h= num %10;// num%10 = 3
       System.out.println(u + ", "+t+", "+h); // 1,2,3*/

        //Консолдон бир сан алыныз жана бир рандом сан алыныз(диапозону 1-5 болсун).
        //Эки санды бири-бирине салыштырып, эгер барабар болсо "a == b " деп чыксын,
        // барабар болбосо "a!=b" деп чыксын.
      /*  Scanner scanner =new Scanner((System.in));
        Random random=new Random();
        int num= scanner.nextInt();
        int ranNum= random.nextInt(1,5);
        if(num==ranNum){
            System.out.println("a == b ");
        }
        else{
            System.out.println("a != b ");
        }
        System.out.println(num==ranNum ? "a==b": "a!=b");*/


        //1ден 10го чейинки сан алыныз. Ал сандын факториалын консольго чыгарып бериниз.
        //Мисалы: 5
        //Жооп: 120
       /* int number= scanner.nextInt();
        int summa=1;
        for (int i = 1; i <=number; i++) {
            summa*=i;
        }
        System.out.println(summa);*/

        //Бир толтурулган массивти,  жаны бир  массивке For Loop колдонуп кочуруу керек.
        /*int [] array ={1,2,3,4,5,7,8,9};
        int[] array2=Arrays.copyOfRange(array, 0,3);
        System.out.println(Arrays.toString(array2));*/// variant1 [1,2,3,4]

        /*int [] array ={1,2,3,4,5,7,8,9,10,11,12};
        int[] array2=Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array2));//variant2 [1,2,3,4,5,7,8,9,10,11,12]*/

       /* int [] array ={1,2,3,4,5,7,8,9,10,11,12};
        int[] array2=Arrays.copyOf(array,array.length);
       for (int i = 0; i < array2.length; i++){
           System.out.print(array2[i] + " ");} //variant3 [1,2,3,4,5,7,8,9,10,11,12]*/

        //Массивтин ичин кокусунан чыккан сандар менен толтурунуз(100 санга чейин),
        //андан кийин консольдон бир сан алыныз,
        //эгер консольдон алынган сан массивтин ичинде
        //бар болсо анда ошол сан турган индекси консольго чыгарыныз.
        //Эгер жок болсо анда “Мындай сан массивтин ичинде жок” деген жазууну чыгарыныз.
     /*   Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int scNumber = scanner.nextInt();
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(1, 100);
        }
        System.out.print(Arrays.toString(arrays) + "\n");
        boolean san = false;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == scNumber) {
                System.out.println(i + "\n ");
                san = true;
            }
        }
        if (!san) {
            System.out.println("Мындай сан массивде жок");
        }
    }*/




          System.out.println(returnVarargs(8,1,3,4,5,67,8,6,5,47,8));

    /*    int[] arr={1,14,2,3,4,5,65,74,82,9};
        System.out.print(returnArrays(arr)+" ");*/

        //  firstMethod();
    }
    //1ден 300го чейинки сандардын арасында 3ко, 4ко жана 5ке (баарына) калдыксыз
    //болунгон сандардын суммасын табыныз.
    //Жооп: 600 чыгат
    /*public static void firstMethod(){
        int summa=0;
        for (int i = 0; i <300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                summa += i;
            }
        }
            System.out.println(summa);
    }*/


    //Метод тузунуз параметрине массив кабыл алсын.
    //Метод массивдин ичиндеги сандарды кемуу тартибинде сорттоп кайтарып берсин.
    /* public static int[] returnArrays(int[] arr){
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         for (int i =arr.length-1;i>=0; i--) {
             System.out.println(arr[i]);
         }
         return arr;
     }*/


    //Кайтаруучу метод тузунуз, параметрине бир сан жана сандардын varargs-ын кабыл алсын.
    //Методко биринчи берген аргументинизди экинчи берген аргументтердин ичинен барбы
    //же жокпу текшерип бар болсо true жок болсо false кайтарсын.

    public static boolean returnVarargs(int number, int... numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(number==numbers[i]){
                return true;
            }
        }
        return false;
    }
    // 10 lesson






}



