/*
Arithmetische Operatoren: (+ addition), (- subtraktion), (* multiplikation), (/ division), (% Modulo/Rest einer Division)
(++ addiere 1 Bsp. 1++), (-- subtrahiere 1 Bsp. 1--),
int a = 1;
int b = ++a; //zuerst a um 1 erhöhen (also 2) und dann b = a; Wenn davor dann so.
int a = 1;
int b = a++; // zuerst b = a (yani 1) und dann a + 1 (a = 2)
int c = 2;
c += a; // c = c+a;
Möglichkeiten: += -= /= *= %=
*/

package Learning;

public class LearningIfElseOperatoren {



    public void bsp(){

        if (!true && !false) { //in der klammer muss alles true sein (false && true) kommt false raus und deshalb sout:"ist Falsch!"
            System.out.println("ist Wahr!");
        } else {
            System.out.println("ist Falsch!");
        }
    }

    public void ifElseBeispiel(int a, int b){

        if (a > b) {
            System.out.println("A ist Größer!");
        } else {
            System.out.println("B ist Größer!");
        }

    }

}
