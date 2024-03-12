package STRINGS;

import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        String str;
        Scanner in=new Scanner(System.in);
        str= in.nextLine();
        System.out.println(shortestPath(str));
    }

    static float shortestPath(String path) {
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char direction=path.charAt(i);
            if(direction=='S'||direction=='s'){//south
                y--;
            }
            if(direction=='N'||direction=='n'){//north
                y++;
            }
            if(direction=='E'||direction=='e'){// east
                x++;
            }
            if(direction=='W'||direction=='w'){//west
                x--;
            }
        }
        int x2=x*x;//x2 matlab we are finding x^2
        int y2=y*y;//y2 matlab we are finding y^2
        return (float)Math.sqrt(x2+y2);//float because if we write int and the ans is in floating point then we won't get the exact as
    }
}
