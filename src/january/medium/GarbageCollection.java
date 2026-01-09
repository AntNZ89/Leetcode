package january.medium;

public class GarbageCollection {
    public int garbageCollection(String[] garbage, int[] travel) {

        int pSum = 0;
        int pIndex = 0;
        int gSum = 0;
        int gIndex = 0;
        int mSum = 0;
        int mIndex = 0;

        for (int i = 0 ; i < garbage.length ; i++){
            boolean isP = false;
            boolean isG = false;
            boolean isM = false;

            String s = garbage[i];

            for (char ch : s.toCharArray()){
                if (ch == 'P'){
                    isP = true;
                    pSum++;
                }
                else if (ch == 'G'){
                    isG = true;
                    gSum++;
                }
                else {
                    isM = true;
                    mSum++;
                }
            }

            if (isP){
                for (int k = pIndex ; k < i ; k++){
                    if (k != travel.length){
                        pSum += travel[k];
                    }
                }
                pIndex = i;
            }

            if (isG){
                for (int k = gIndex ; k < i ; k++){
                    if (k != travel.length){
                        gSum += travel[k];
                    }
                }
                gIndex = i;
            }

            if (isM){
                for (int k = mIndex ; k < i ; k++){
                    if (k != travel.length){
                        mSum += travel[k];
                    }
                }
                mIndex = i;
            }
        }

        return pSum + gSum + mSum;

    }
}
