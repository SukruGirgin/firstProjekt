package Learning;

public class LearningForSchleife {


    String[] namen = {"Hans", "Peter", "Lol"};

    public void forEachSchleife2() {
        for (int i = 0; i < namen.length; i++){
            if (namen[i] == "Hans") {
                System.out.println(namen[i] + " als Name ist vorhanden!");
            }
        }
    }

    public void forEachSchleife() {
        for (String kopie : namen) {
            if(kopie == "Peter") {
                System.out.println(kopie);
            }
        }
    }

    public void forSchleife4() {
        for (int i = 0; i < namen.length; i++){
            System.out.println(namen[i]);
        }
    }



    public void forSchleife3() {
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public void forSchleife2() {
        for (String s = "*"; s.length() < 15; s += "*") {
            System.out.println(s);
        }
        System.out.println("**");
        System.out.println("**");
    }


    public void forSchleife1() {
        for (int i = 0; i < 10; i++){
            System.out.println((i + 1) + ". durchgang. I = " + i);
        }
    }

}
