package guru.qa;

public class FirstClasss {
    // 8 типов данных в джаве

    byte aByte = 127; //8bit -128 ...127 для дз добится переполнения


    short aShort = 100; //16 bit -32768...32767

    //самые используемые
    int aInt=1000;//32bit -2**31...(2**31)-1

    long aLong =100L;//64bit -2**63...(2**63)-1

    float aFloat=0.0F; //32bit
    //самый используемый (если просто хранить, но не использовать арифметику)
    double aDouble=0.0D; //64bit

    char aChar='c';
    boolean aBoolean = false;
//литерал примитивный тип данных в том виде в котором он будет использоваться в программе
// = это оператор присвоения, присвает то что написано с право , тому элементу что с лева


    public static  void main(String[] args){
        System.out.println("===Арифметические операторы");
        int j = 10;
        //+ -- оператор сложения
        System.out.println("+ -- оператор сложения 5+7");
        System.out.println(5+7);
        // - -- оператор вычетания
        System.out.println("- -- оператор вычетания 5-7");
        System.out.println(5-7);
        // * -- умножение
        System.out.println("* -- умножение 3*3");
        System.out.println(3*3);
        // / -- целочисление деление
        System.out.println("/ -- целочисление деление 10/3");
        System.out.println(10/3);

        // % -- остаток от деления
        System.out.println("% -- остаток от деления 10/3");
        System.out.println(10%3);
        // инкримент ++ изменение значений на единицу
        System.out.println("инкримент ++ изменение значений на единицу 10");
        //System.out.println(++j);
        //System.out.println(j++);
        // дикремент -- изменение значений на единицу
        System.out.println("дикремент -- изменение значений на единицу 10");
        System.out.println(--j);
        System.out.println(j--);


        System.out.println("===Операторы сравнения===");

        int k = 5;
        int l = 7;
        //>
        System.out.println("Проверяет является ли значение левого значения больше правого");
        System.out.println(k > l);
        //<
        System.out.println("Проверяет является ли значение правого значения больше левого");
        System.out.println(l < k);
        //>=
        System.out.println("Проверяет является ли левое значения больше либо равно правому");
        System.out.println(k >= l);
        //<=
        System.out.println("Проверяет является ли левое значения меньше либо равно правому");
        System.out.println(k <= l);
        //==
        System.out.println("Проверяет равны ли эти значения друг другу");
        System.out.println( k == l);
        //!=
        System.out.println("Проверяет равны или не равны эти значения, если равно то условие истина");
        System.out.println(k != l);

        System.out.println("===Операторы присваения===");


        // =
        System.out.println("= , Присваиваем значение из правой стороны к левой");
        System.out.println("int a = 5");
        int a = 5;
        System.out.println("int b = 7");
        int b = 7;
        System.out.println("a = a + b");
        a = a + b;
        System.out.println(a);
        // +=
        System.out.println(" += ,Присваиваем значению левого , значение правого. a+=b ");
        System.out.println(a+=b);
        //-=
        System.out.println("-= , Оператор вычетания,вычитает из правого левое");
        System.out.println(a-=b);


        System.out.println("===Операторы логические===");

        System.out.println("boolean g = true");
        boolean g = true;
        System.out.println("boolean h = false");
        boolean h = false;
        // && (&)
        System.out.println("&& , Логический оператор AND");
        System.out.println("g && h = " + (g&&h));
        // || (|)
        System.out.println("|| , Логический оператор OR");
        System.out.println("g || h = " + (g||h) );
        // !
        System.out.println("! , Логический оператор NOT");
        System.out.println("!(g && h) = " + !(g && h));
        //boolean result = (3 > 2) && (3 > 2);
        byte aByte = 127;
        System.out.println((aByte+1)+ " " + (aByte - 300));
        int aInt=999999999;
        System.out.println("Переполнение типа int " + (aInt*999999999));

    }
}

