package br.com.leao.screenmatch.models;

import java.util.List;

public class ApiResponse <T>{
    private List<T> results;

    public List<T> getResults() {
        return results;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T result : results) {
            sb.append(result.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
