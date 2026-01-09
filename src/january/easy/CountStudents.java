package january.easy;

import java.util.LinkedList;
import java.util.Queue;

public class CountStudents {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();
        int stu0 = 0;
        int stu1 = 0;

        for (int stu : students){
            q.add(stu);
            if (stu == 0) stu0++;
            else stu1++;
        }

        int i = 0;

        while (q.size() != 0){

            if (sandwiches[i] == 0 && stu0 == 0){
                break;
            }
            else if (sandwiches[i] == 1 && stu1 == 0){
                break;
            }

            int val = q.poll();

            if (val == sandwiches[i]){
                i++;
                if (val == 0) stu0--;
                else stu1--;
            }
            else {
                q.add(val);
            }

        }

        return q.size();

    }
}
