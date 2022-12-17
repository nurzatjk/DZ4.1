import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Введите  имя");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();
        String[] names = {name1, name2, name3, name4, name5};
        for (int i = 0; i < names.length; i++) {
            listA.add(names[i]);


        }
        System.out.println(listA);
        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите имя");
        String name6 = scanner.nextLine();
        String name7 = scanner.nextLine();
        String name8 = scanner.nextLine();
        String name9 = scanner.nextLine();
        String name10 = scanner.nextLine();
        String[] names1 = {name6, name7, name8, name9, name10};
        for (int i = 0; i < names1.length; i++) {
            listB.add(names1[i]);

        }
        System.out.println(listB);
        ArrayList<String> listC = new ArrayList<>();
        listC.add(0, name1);//nurzat1группа
        listC.add(1, name10);//
        listC.add(2, name2);//arujan1гр
        listC.add(3, name9);
        listC.add(4, name3);//mara1гр
        listC.add(5, name8);
        listC.add(6, name4);//klaea1гргр
        listC.add(7, name7);
        listC.add(8, name5);//zina
        listC.add(9, name6);

        System.out.println(listC);
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);
    }
}

//#ДЗ 4-й урок
//7)  (Дэдлайн до урока)
//    a) Используйте цикл
//    b)  Написать приложение которое бы считывало сначала
//    5 строк которые вводит юзер и сохраняла бы их в Список А.
//            c)  Затем программа должна отобразить этот список
//    d)  Потом программа считывает еще 5 строк,
//    которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
//    e)  Объединить Список А со Списком Б в новый список
//    С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//    f)  После объединения отобразить в консоли список С
//    g)   В конце отсортировать элементы списка С по длине слова,
//    сначала идут String-и с наименьшим количеством символов,
//    и распечатать отсортированный список С.
//}
