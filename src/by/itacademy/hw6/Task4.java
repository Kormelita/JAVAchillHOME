package by.itacademy.hw6;

public class Task4 {

    public static void main(String[] args) {
        int x = 3;
        int y = 56;
        StringBuilder sbSum = new StringBuilder();
        StringBuilder sbCom = new StringBuilder();
        StringBuilder sbSub = new StringBuilder();
        sbSum.append(x).append("+").append(y).append("= ").append(x + y);
        System.out.println(sbSum);

        sbSub.append(x).append("-").append(y).append("= ").append(x - y);
        System.out.println(sbSub);

        sbCom.append(x).append("*").append(y).append("= ").append(x * y);
        System.out.println(sbCom);

        sbSum.replace(sbSum.indexOf("="), sbSum.indexOf(" "), " equal");
        System.out.println(sbSum);
        sbSub.replace(sbSub.indexOf("="), sbSub.indexOf(" "), " equal");
        System.out.println(sbSub);
        sbCom.replace(sbCom.indexOf("="), sbCom.indexOf(" "), " equal");
        System.out.println(sbCom);

    }
}
