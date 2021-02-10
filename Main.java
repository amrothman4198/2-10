class Main {

  public static void main(String[] args) {
    sayHey(20);
  }

  public static void sayHey(int q) {
    if (q == 0) {
      System.out.println("okay");
    } else {
      System.out.println("hey");
      q--;
      sayHey(q);
    }
  }

{
  }
  public static void nethod(){
    sayYo(29);
  }

public static void sayYo(int p) {
  if(p == 0) {
    System.out.println("yup");
  } else {
 System.out.println("yo");
 p--;
  sayYo(p);
        }
  } 
 }
