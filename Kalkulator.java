

package kalkulator;
import java.util.Scanner;

public class Kalkulator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Kalkulator");
    System.out.println("----------------------------------------");
    System.out.print("Masukkan angka pertama\t\t = ");
    int angka1 = input.nextInt();
    System.out.print("Masukkan operator (+, -, *, /)\t = ");
    char operator = input.next().charAt(0);
    System.out.print("Masukkan angka kedua\t\t = ");
    int angka2 = input.nextInt();
    System.out.print("Masukkan operator (+, -, *, /)\t = ");
    char operator2 = input.next().charAt(0);
    System.out.print("Masukkan angka ketiga\t\t = ");
    int angka3 = input.nextInt();
    System.out.print("Masukkan operator (+, -, *, /)\t = ");
    char operator3 = input.next().charAt(0);
    System.out.print("Masukkan angka keempat\t\t = ");
    int angka4 = input.nextInt();
    System.out.println("----------------------------------------");
    System.out.println("Soal\t\t = "+angka1+" "+operator+" "+angka2+" "+operator2+" "+angka3+" "+operator3+" "+angka4);
    
    int hasil = 0;

    if(operator == '+') {
        if(operator2 == '+'){
            if(operator3 == '+'){
                hasil = angka1 + angka2 + angka3 + angka4;
            }else if(operator3 == '-'){
                hasil = angka1 + angka2 + angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 + angka2 + angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 + angka2 + angka3 / angka4;
            }
        }
           
        else if(operator2 == '-'){
            if(operator3 == '+'){
                hasil = angka1 + angka2 - angka3 + angka4;
            }else if(operator3 == '-'){
                hasil = angka1 + angka2 - angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 + angka2 - angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 + angka2 - angka3 / angka4;
            }
        }
        
        else if(operator2 == '*') {
            if(operator3 == '+') {
                hasil = angka1 + angka2 * angka3 + angka4;
            }else if(operator3 == '-'){
                hasil = angka1 + angka2 * angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 + angka2 * angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 + angka2 * angka3 / angka4;
            }
        }
        
        else if(operator2 == '/') {
            if(operator3 == '+') {
                hasil = angka1 + angka2 / angka3 + angka4;
            }else if(operator3 == '-'){
                hasil = angka1 + angka2 / angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 + angka2 / angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 + angka2 / angka3 / angka4;
            }
        }
    } 
    
    else if(operator == '-') {
        if(operator2 == '+') {
            if(operator3 == '+'){
                hasil = angka1 - angka2 + angka3 + angka4;
            }else if(operator3 == '-'){
                hasil = angka1 - angka2 + angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 - angka2 + angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 - angka2 + angka3 / angka4;
            }
        }
        
        else if(operator2 == '-') {
            if(operator3 == '+'){
                hasil = angka1 - angka2 - angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 - angka2 - angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 - angka2 - angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 - angka2 - angka3 / angka4;
            }
        }
        
        else if(operator2 == '*') {
            if(operator3 == '+'){
                hasil = angka1 - angka2 * angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 - angka2 * angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 - angka2 * angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 - angka2 * angka3 / angka4;
            } 
        }
        
        else if(operator2 == '/') {
            if(operator3 == '+'){
                hasil = angka1 - angka2 * angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 - angka2 * angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 - angka2 * angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 - angka2 * angka3 / angka4;
            } 
        }
    }
        
    else if(operator == '*') {
        if(operator2 == '+') {
            if(operator3 == '+'){
                hasil = angka1 * angka2 + angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 * angka2 + angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 * angka2 + angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 * angka2 + angka3 / angka4;
            } 
        }
            
        else if(operator2 == '-') {
            if(operator3 == '+'){
                hasil = angka1 * angka2 - angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 * angka2 - angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 * angka2 - angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 * angka2 - angka3 / angka4;
            } 
        }
        
        else if(operator2 == '*') {
            if(operator3 == '+'){
                hasil = angka1 * angka2 * angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 * angka2 * angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 * angka2 * angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 * angka2 * angka3 / angka4;
            }
        }
        
        else if(operator2 == '/') {
            if(operator3 == '+'){
                hasil = angka1 * angka2 / angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 * angka2 / angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 * angka2 / angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 * angka2 / angka3 / angka4;
            } 
        }
    }
    
    else if(operator == '/') {
        if(operator2 == '+') {
            if(operator3 == '+'){
                hasil = angka1 / angka2 + angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 / angka2 + angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 / angka2 + angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 / angka2 + angka3 / angka4;
            } 
        }
            
        else if(operator2 == '-') {
            if(operator3 == '+'){
                hasil = angka1 / angka2 - angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 / angka2 - angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 / angka2 - angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 / angka2 - angka3 / angka4;
            } 
        } 
        
        else if(operator2 == '*') {
            if(operator3 == '+'){
                hasil = angka1 / angka2 * angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 / angka2 * angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 / angka2 * angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 / angka2 * angka3 / angka4;
            } 
        } 
        
        else if(operator2 == '/') {
            if(operator3 == '+'){
                hasil = angka1 / angka2 / angka3 + angka4;
            } else if(operator3 == '-'){
                hasil = angka1 / angka2 / angka3 - angka4;
            }else if(operator3 == '*'){
                hasil = angka1 / angka2 / angka3 * angka4;
            }else if(operator3 == '/'){
                hasil = angka1 / angka2 / angka3 / angka4;
            } 
        }
    }
  
    System.out.println("Jawab\t\t = " + hasil);
  }
}

