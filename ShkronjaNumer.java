package numerike;

public class ShkronjaNumer {
public double ShkronjeNeNumer(String a) {
	String shkronja = a.toLowerCase();
	double numri = 0;
	switch (shkronja) {
          case "a":
              numri = 1;
              break;
          case "b":
              numri = 2;
              break;
          case "c":
              numri = 3;
              break;
          case "d":
              numri = 4;
              break;
          case "e":
              numri = 5;
              break;
          case "f":
              numri = 6;
              break;
          case "g":
              numri = 7;
              break;
          case "h":
              numri = 8;
              break;
          case "i":
              numri = 9;
              break;
          case "j":
              numri = 10;
              break;
          case "k":
              numri = 11;
              break;
          case "l":
              numri = 12;
              break;
          case "m":
              numri = 13;
              break;
          case "n":
              numri = 14;
              break;
          case "o":
              numri = 15;
              break;
          case "p":
              numri = 16;
              break;
          case "q":
              numri = 17;
              break;
          case "r":
              numri = 18;
              break;
          case "s":
              numri = 19;
              break;
          case "t":
              numri = 20;
              break;
          case "u":
              numri = 21;
              break;
          case "v":
              numri = 22;
              break;
          case "w":
              numri = 23;
              break;
          case "x":
              numri = 24;
              break;
          case "y":
              numri = 25;
              break;
          case "z":
              numri = 26;
              break;
        }
        return numri;
    }
public String NumerNeShkronje(double n) {
      int num = (int) (n);
      String shkronja = "";
      switch (num) {
           case 1:
               shkronja = "a";
               break;
           case 2:
               shkronja = "b";
               break;
           case 3:
               shkronja = "c";
               break;
           case 4:
               shkronja = "d";
               break;
           case 5:
               shkronja = "e";
               break;
           case 6:
               shkronja = "f";
               break;
           case 7:
               shkronja = "g";
               break;
           case 8:
               shkronja = "h";
               break;
           case 9:
               shkronja = "i";
               break;
           case 10:
               shkronja = "j";
               break;
           case 11:
               shkronja = "k";
               break;
           case 12:
               shkronja = "l";
               break;
           case 13:
               shkronja = "m";
               break;
           case 14:
               shkronja = "n";
               break;
           case 15:
               shkronja = "o";
               break;
           case 16:
               shkronja = "p";
               break;
           case 17:
               shkronja = "q";
               break;
           case 18:
               shkronja = "r";
               break;
           case 19:
               shkronja = "s";
               break;
           case 20:
               shkronja = "t";
               break;
           case 21:
               shkronja = "u";
               break;
           case 22:
               shkronja = "v";
               break;
           case 23:
               shkronja = "w";
               break;
           case 24:
               shkronja = "x";
               break;
           case 25:
               shkronja = "y";
               break;
           case 26:
               shkronja = "z";
               break;
        }
        return shkronja;
    }
}


