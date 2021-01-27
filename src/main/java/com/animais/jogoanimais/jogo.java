package com.animais.jogoanimais;

import javax.swing.JOptionPane;

public class jogo {
    public static void main(String[] args) {

        String animalAgua = "";
        String aux_animalAgua = "";
        String caracteristica = ""; 
        String aux_caracteristica = "";

        String animalTerra = "";
        String aux_animalTerra = "";
        String caracteristicaTerra = "";
        String aux_caracteristicaTerra = "";

        String str[] = { "Sim", "Não" };

        int sair = 1;

        while (sair == 1) {

            JOptionPane.showMessageDialog(null, "Pense em um Animal");

            int animal = JOptionPane.showOptionDialog(null, "O animal que você pensou vive na água ?",
                    "Jogo do Animais", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);

            if (animal == 0) {

                if (aux_animalAgua.equals("") && aux_caracteristica.equals("")) {

                    int agua = JOptionPane.showOptionDialog(null, "O animal que você pensou é Tubarão ?",
                            "Jogo dos Animais", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str,
                            str[0]);
                    if (agua == 0) {
                        JOptionPane.showMessageDialog(null, "Acertei de novo!");
                    } else {
                        animalAgua = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");
                        caracteristica = JOptionPane
                                .showInputDialog("Um(a) " + animalAgua + "______ mas um(a) Tubarão não.");
                    }

                } else {

                    int resp = JOptionPane.showOptionDialog(null,
                            "O animal que você pensou é " + aux_caracteristica + "?", "Jogo dos Animais",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);
                    if (resp == 1) {
                        int agua = JOptionPane.showOptionDialog(null, "O animal que você pensou é Tubarão ?",
                                "Jogos do Animais", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str,
                                str[0]);
                        if (agua == 0) {
                            JOptionPane.showMessageDialog(null, "Acertei de novo!");
                        } else {
                            animalAgua = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");
                            caracteristica = JOptionPane
                                    .showInputDialog("Um(a) " + animalAgua + "______ mas um(a) Tubarão não.");

                        }
                    } else if (resp == 0) {
                        int resp2 = JOptionPane.showOptionDialog(null, "O animal é um(a)" + aux_animalAgua + "?",
                                "Jogo dos Animais", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str,
                                str[0]);
                        if (resp2 == 0) {
                            JOptionPane.showMessageDialog(null, "Acertei de novo!");
                        } else {
                            animalAgua = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");
                            caracteristica = JOptionPane.showInputDialog(
                                    "Um(a) " + animalAgua + "______ mas um(a) " + aux_animalAgua + " não.");
                        }
                    }

                }
            } else {

                if (aux_animalTerra.equals("") && aux_caracteristicaTerra.equals("")) {

                    int terra = JOptionPane.showOptionDialog(null, "O animal que você pensou é Macaco ?",
                            "Jogo dos Animais", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str,
                            str[0]);
                    if (terra == 0) {
                        JOptionPane.showMessageDialog(null, "Acertei de novo!");
                    } else {
                        animalTerra = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");
                        caracteristicaTerra = JOptionPane
                                .showInputDialog("Um(a) " + animalTerra + "______ mas um(a) Macaco não.");
                    }

                } else {

                    int resp = JOptionPane.showOptionDialog(null,
                            "O animal que você pensou é " + aux_caracteristicaTerra + "?", "Jogos dos Animais",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);
                    if (resp == 1) {
                        int terra = JOptionPane.showOptionDialog(null, "O animal que você pensou é Macaco ?",
                                "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);
                        if (terra == 0) {
                            JOptionPane.showMessageDialog(null, "Acertei de novo!");
                        } else {
                            animalTerra = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");
                            caracteristicaTerra = JOptionPane
                                    .showInputDialog("Um(a) " + animalTerra + "______ mas um(a) Macaco não.");

                        }
                    } else if (resp == 0) {
                        int resp2 = JOptionPane.showOptionDialog(null, "O animal é um(a)" + aux_animalTerra + "?",
                                "Jogo dos Animais", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str,
                                str[0]);
                        if (resp2 == 0) {
                            JOptionPane.showMessageDialog(null, "Acertei de novo!");
                        } else {
                            animalTerra = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");
                            caracteristicaTerra = JOptionPane.showInputDialog(
                                    "Um(a) " + animalTerra + "______ mas um(a) " + aux_animalTerra + " não.");
                        }
                    }

                }

            }

            aux_animalAgua = animalAgua;
            aux_caracteristica = caracteristica;

            aux_animalTerra = animalTerra;
            aux_caracteristicaTerra = caracteristicaTerra;

            sair = JOptionPane.showOptionDialog(null, "Deseja sair ?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, str, str[0]);

        }
    }

}
