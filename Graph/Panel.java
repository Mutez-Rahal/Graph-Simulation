package finalodevi2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public Panel() {
        super();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g);

        drawKenar(g2d);
        drawDugum(g2d);
        drawChar(g2d);
    }

    public int[][] locations() {
        int[][] locations = new int[0][0];

        switch (Arayuz.g.vertexSayisi) {
            case 1:
                locations = new int[1][2];
                locations[0][0] = 325;
                locations[0][1] = 130;
                break;

            case 2:
                locations = new int[2][2];
                locations[0][0] = 250;
                locations[0][1] = 130;
                locations[1][0] = 400;
                locations[1][1] = 130;
                break;

            case 3:
                locations = new int[3][2];
                locations[0][0] = 325;
                locations[0][1] = 50;
                locations[1][0] = 450;
                locations[1][1] = 170;
                locations[2][0] = 200;
                locations[2][1] = 170;
                break;
            case 4:
                locations = new int[4][2];
                locations[0][0] = 200;
                locations[0][1] = 50;
                locations[1][0] = 450;
                locations[1][1] = 50;
                locations[2][0] = 450;
                locations[2][1] = 190;
                locations[3][0] = 200;
                locations[3][1] = 190;
                break;

            case 5:
                locations = new int[5][2];
                locations[0][0] = 325;
                locations[0][1] = 20;
                locations[1][0] = 450;
                locations[1][1] = 100;
                locations[2][0] = 410;
                locations[2][1] = 220;
                locations[3][0] = 240;
                locations[3][1] = 220;
                locations[4][0] = 200;
                locations[4][1] = 100;

                break;

            case 6:
                locations = new int[6][2];
                locations[0][0] = 315;
                locations[0][1] = 20;
                locations[1][0] = 430;
                locations[1][1] = 70;
                locations[2][0] = 430;
                locations[2][1] = 210;
                locations[3][0] = 315;
                locations[3][1] = 260;
                locations[4][0] = 200;
                locations[4][1] = 210;
                locations[5][0] = 200;
                locations[5][1] = 70;
                break;

            default:
                break;
        }
        return locations;
    }

    public void drawDugum(Graphics2D g) {
        /*
        Düğümleri çizen meotot. düğüm sayısı sınırlı en fazla 6 düğüm çizilebilir
         */
        g.setStroke(new BasicStroke(5));
        g.setColor(new Color(51, 102, 255));
        switch (Arayuz.g.vertexSayisi) {
            case 1:
                g.fillOval(325, 130, 50, 50); //1
                break;

            case 2:
                g.fillOval(250, 130, 50, 50); //1
                g.fillOval(400, 130, 50, 50); //2
                break;

            case 3:
                g.fillOval(325, 50, 50, 50); //1
                g.fillOval(450, 170, 50, 50);//2
                g.fillOval(200, 170, 50, 50); //3
                break;

            case 4:
                g.fillOval(200, 50, 50, 50); //1
                g.fillOval(450, 50, 50, 50); //2
                g.fillOval(450, 190, 50, 50);//3
                g.fillOval(200, 190, 50, 50);//4
                break;

            case 5:
                g.fillOval(325, 20, 50, 50); //1
                g.fillOval(450, 100, 50, 50); //2
                g.fillOval(410, 220, 50, 50);//3
                g.fillOval(240, 220, 50, 50); //4
                g.fillOval(200, 100, 50, 50);//5
                break;

            case 6:
                g.fillOval(315, 20, 50, 50);//1
                g.fillOval(430, 70, 50, 50);//2
                g.fillOval(430, 210, 50, 50);//3
                g.fillOval(315, 260, 50, 50);//4
                g.fillOval(200, 70, 50, 50);//5
                g.fillOval(200, 210, 50, 50);//6
                break;

            default:
                break;
        }

    }

    public void drawKenar(Graphics2D g) {
        /*
        düğümler arası kenarları ve kenarların ağırlıklarını çizen metot
         */

        int[][] locations = locations();
        boolean ziyaretEdildiMi[][] = new boolean[Arayuz.g.adjMat.length][Arayuz.g.adjMat.length];
        if (Arayuz.g.vertexSayisi > 0) {
            for (int i = 0; i < Arayuz.g.adjMat.length; i++) {
                for (int j = 0; j < Arayuz.g.adjMat[i].length; j++) {
                    if (Arayuz.g.adjMat[i][j] > 0 && !ziyaretEdildiMi[i][j] && !ziyaretEdildiMi[j][i]) {
                        g.setColor(Color.BLACK);
                        g.setStroke(new BasicStroke(5));
                        g.drawLine(locations[i][0] + 25, locations[i][1] + 25, locations[j][0] + 25, locations[j][1] + 25);
                        g.drawString(Arayuz.g.adjMat[i][j] + "", (locations[i][0] + locations[j][0] + 40) / 2, (locations[i][1] + locations[j][1] + 40) / 2);
                        ziyaretEdildiMi[i][j] = true;
                        ziyaretEdildiMi[j][i] = true;
                    }
                }
            }
        }
    }

    public void drawChar(Graphics2D g) {
        /*
        Düğümün içindeki karakteri yazan metot.
        */
        int locations[][] = locations();
        for (int i = 0; i < Arayuz.g.vertexSayisi; i++) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Sogeo UI", Font.BOLD, 15));
            g.drawString(Arayuz.g.vertexList[i].vertex + "", locations[i][0] + 20, locations[i][1] + 30);
        }
    }

    public void printAgirlik(Graphics2D g) {

    }

}
