import javax.swing.*;
//Test
    public class Main {

        public static void main(String[] args) {

// LV1 : 0-9 Punkte | LV2: 10-19 Punkte | LV3: 20-29 | Sieg = 30!  ;

            int score = 0;
            int zahl1 = 0;
            int zahl2 = 0;
            int zahl3 = 0;
            int loesung = 0;
            int keingabe = 0;

            String eingabe;

            // Max ist toll

            JOptionPane.showConfirmDialog(null,
                    "Der Matheskill Tester",
                    "Der Matheskill Tester",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

            while (score != 30) {

                //LV1

                if (score <= 9) {

                    JOptionPane.showConfirmDialog(null,
                            "Level 1",
                            "LevelUP",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);

                    while (score <= 9) {


                        zahl1 = (int) (Math.random() * 10); //Generieren der Zufälligen Zahlen
                        zahl2 = (int) (Math.random() * 10);


                        do {

                            zahl1 = (int) (Math.random() * 10); //Generieren der Zufälligen Zahlen
                            zahl2 = (int) (Math.random() * 10);

                            eingabe = JOptionPane.showInputDialog(zahl1 + " * " + zahl2 + " = "); //Eingabefeld

                            try {
                                keingabe = Integer.parseInt(eingabe); //Konvertierung von einem String --> Int

                                break;
                            }
                            catch (Exception e) {

                                //Ungültige eingabe

                                JOptionPane.showConfirmDialog(null,
                                        "Du hast einen Falschen Wert eingegeben",
                                        "ERROR!",
                                        JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.ERROR_MESSAGE);
                            }

                        } while (keingabe == 0);


                        //Berechnen der Lösung

                        loesung = zahl1 * zahl2;

                        //Checken ob die Lösung richtig ist.

                        if (loesung == keingabe) {
                            score++;
                            JOptionPane.showConfirmDialog(null,
                                    "Die Antwort war Richtig. Dein Aktueller Punktestand ist :" + score,
                                    "RICHTIG!",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE);

                        }
                        if (loesung != keingabe) {

                            JOptionPane.showConfirmDialog(null,
                                    "Die Antwort war Falsch. Dein Aktueller Punktestand ist: " + score,
                                    "FALSCH!",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.ERROR_MESSAGE);

                        }

                    }
                }

                //LV2

                if (score <= 19) {

                    JOptionPane.showConfirmDialog(null,
                            "Level 2",
                            "LevelUP",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);

                    while (score <= 19) {

                        zahl1 = (int) (Math.random() * 15 + 5);
                        zahl2 = (int) (Math.random() * 15 + 5);

                        do {

                            zahl1 = (int) (Math.random() * 15 + 5); //Generieren der Zufälligen Zahlen
                            zahl2 = (int) (Math.random() * 15 + 5);

                            eingabe = JOptionPane.showInputDialog(zahl1 + " * " + zahl2 + " = "); //Eingabefeld

                            try {
                                keingabe = Integer.parseInt(eingabe); //Konvertierung von einem String --> Int

                                break;
                            } catch (Exception e) {

                                //Ungültige eingabe

                                JOptionPane.showConfirmDialog(null,
                                        "Du hast einen Falschen Wert eingegeben",
                                        "ERROR!",
                                        JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.ERROR_MESSAGE);
                            }

                        } while (keingabe == 0);

                        loesung = zahl1 * zahl2;

                        if (loesung == keingabe) {

                            score++;

                            JOptionPane.showConfirmDialog(null,
                                    "Die Antwort war Richtig. Dein Aktueller Punktestand ist:" + score,
                                    "RICHTIG!",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        if (loesung != keingabe) {

                            JOptionPane.showConfirmDialog(null,
                                    "Die Antwort war Falsch. Dein Aktueller Punktestand ist:" + score,
                                    "FALSCH!",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.ERROR_MESSAGE);
                        }

                    }
                }

                //LV 3

                while (score <= 29) {

                    zahl1 = (int) (Math.random() * 15 + 5);
                    zahl2 = (int) (Math.random() * 15 + 5);
                    zahl3 = (int) (Math.random() * 15 + 5);

                    JOptionPane.showConfirmDialog(null,
                            "Level 3",
                            "LevelUP",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);

                    eingabe = JOptionPane.showInputDialog(zahl1 + " * " + zahl2 + " * " + zahl3 + " = ");
                    keingabe = Integer.parseInt(eingabe);

                    loesung = zahl1 * zahl2 * zahl3;
                    if (loesung == keingabe) {

                        score++;

                        JOptionPane.showConfirmDialog(null,
                                "Die Antwort war Richtig. Dein Aktueller Punktestand ist:" + score,
                                "RICHTIG!",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    if (loesung != keingabe) {

                        JOptionPane.showConfirmDialog(null,
                                "Die Antwort war Falsch. Dein Aktueller Punktestand ist:" + score,
                                "FALSCH!",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.ERROR_MESSAGE);
                    }
                }



                JOptionPane.showConfirmDialog(null,
                        "Glückwunsch! Du hast 30 Punkte erreicht",
                        "Gewonnen",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);


            }
        }

    }
