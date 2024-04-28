package br.com.leao.screenmatch.calculations;

import br.com.leao.screenmatch.models.Production;

public class CalculateTotalTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void addProductionTime(Production Production) {
        totalTime += Production.getDurationInMinutes();
    }
}
