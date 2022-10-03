
# Java solution to 15 pattern problems

A brief description of what this project does and who it's for





## Pattern 1

```bash
                       public static void main(String[] args) {
*                         int n=5;
* *                       for(int row = 0; row < 2 * n; row++) {
* * *                        if(row==0) continue;
* * * *                      int colInRow = row>n ? 2*n-row: row;  
* * * * *                    for(int col = 0; col < colInRow; col++) {
* * * *                          System.out.print("* ");
* * *                        }       
* *                       System.out.println();
*                       }
                       }
    
```
## Code

```Java
  public static void main(String[] args) {
       int n=5;
       for(int row = 0; row < 2 * n; row++) {
           if(row==0) continue;
           int colInRow = row>n ? 2*n-row: row;
           for(int col = 0; col < colInRow; col++) {
               System.out.print("* ");
           }
         if(row!=2*n) System.out.println();
       }
    }
```

