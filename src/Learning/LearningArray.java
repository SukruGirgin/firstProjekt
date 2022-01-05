package Learning;

public class LearningArray {

    public void array1() {

        int[] arrayName;
        arrayName = new int[5];
        arrayName[0] = 65;

        int[] arr2 = new int[12];
        arr2[0] = 17;
        arr2[1] = 22;
        arr2[2] = 21;
        arr2[3] = 12;
        arr2[4] = 13;
        arr2[5] = 31;
        arr2[6] = 325;

        int[] arr3 = {10, 12, 20, 24, 1};

    }

    public void array2() {

        int[] arr = new int[8];

        for (int i = 0; i < 8 ; i++){
            arr[i] = i; //jedes element erhält den Wert i, mit jedem durchgang ist i + 1;
            if(i == 3) {
                System.out.println(arr[i] + ". = " + arr[i]);
            }
        }

    }

    public int array3() {

        int[] arr = new int[8];
        int x = 0;

        for (int i = 0; i < 8 ; i++){
            arr[i] = i;
            if(i == 3) {
                x = arr[i];
            }
        }

        return x + 2;
    }

    public void array4() {
        int[] arr13 = new int[8];

        for (int i = 0; i < 8; i++){
            arr13[i] = i;
            System.out.println(arr13[i] + ". = " + arr13[i]);
        }
    }





}
