package by.fokin.laba1KPP.VectorService;

import org.springframework.stereotype.Service;

@Service
public class VectorService {

    public String calculation(int x1, int y1, int x2, int y2) {

        int xPr = x2 - x1;
        int yPr = y2 - y1;

        if(xPr < 0) {
            xPr *= -1;
        } if (yPr < 0) {
            yPr *= -1;
        }

        double norma = Math.sqrt(Math.pow(xPr, 2) + Math.pow(yPr, 2));

        StringBuilder answer = new StringBuilder();

        answer.append("Входные данные: ");

        answer.append(" x1 = ");
        answer.append(x1);

        answer.append(" y1 = ");
        answer.append(y1);

        answer.append(" x2 = ");
        answer.append(x2);

        answer.append(" y2 = ");
        answer.append(y2);

        answer.append("  |  ");

        answer.append(" Проекция на ось X = ");
        answer.append(xPr);

        answer.append(" Проекция на ось Y = ");
        answer.append(yPr);

        answer.append(" Норма = ");
        answer.append(norma);

        return answer.toString();
    }
}