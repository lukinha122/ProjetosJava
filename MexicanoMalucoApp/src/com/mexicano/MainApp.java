package com.mexicano;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static final int NUM_PLAYERS = 8;
    private static final int NUM_ROUNDS = 13;

    private TextField[][] entries = new TextField[NUM_ROUNDS][NUM_PLAYERS];
    private TextField[] playerNames = new TextField[NUM_PLAYERS];
    private Label[] totals = new Label[NUM_PLAYERS];
    private Label[] leaders = new Label[NUM_ROUNDS];
    private Label[] rankings = new Label[NUM_PLAYERS];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(5);
        grid.setVgap(5);

        // Cabeçalho
        grid.add(new Label("Rodada"), 0, 0);
        for (int j = 0; j < NUM_PLAYERS; j++) {
            playerNames[j] = new TextField();
            playerNames[j].setPromptText("Jogador " + (j + 1));
            grid.add(playerNames[j], j + 1, 0);
        }

        // Entradas de pontuação
        for (int i = 0; i < NUM_ROUNDS; i++) {
            grid.add(new Label("R" + (i + 1)), 0, i + 1);
            for (int j = 0; j < NUM_PLAYERS; j++) {
                entries[i][j] = new TextField();
                entries[i][j].setPrefWidth(60);
                grid.add(entries[i][j], j + 1, i + 1);
            }
        }

        // Totais
        grid.add(new Label("Total"), 0, NUM_ROUNDS + 1);
        for (int j = 0; j < NUM_PLAYERS; j++) {
            totals[j] = new Label("0");
            totals[j].setStyle("-fx-border-color: gray; -fx-padding: 3px;");
            grid.add(totals[j], j + 1, NUM_ROUNDS + 1);
        }

        // Painel lateral
        VBox side = new VBox(10);
        side.setPadding(new Insets(10));

        Label lblLideres = new Label("Líderes por rodada");
        lblLideres.setStyle("-fx-font-weight: bold;");
        side.getChildren().add(lblLideres);

        for (int i = 0; i < NUM_ROUNDS; i++) {
            HBox line = new HBox(5);
            Label rodada = new Label("R" + (i + 1) + ":");
            leaders[i] = new Label("-");
            leaders[i].setStyle("-fx-border-color: lightgray; -fx-padding: 2px;");
            line.getChildren().addAll(rodada, leaders[i]);
            side.getChildren().add(line);
        }

        Label lblRanking = new Label("Ranking Final");
        lblRanking.setStyle("-fx-font-weight: bold;");
        side.getChildren().add(lblRanking);

        for (int i = 0; i < NUM_PLAYERS; i++) {
            rankings[i] = new Label("");
            rankings[i].setStyle("-fx-border-color: lightgray; -fx-padding: 2px;");
            side.getChildren().add(rankings[i]);
        }

        // Botões
        Button btnCalcular = new Button("Calcular");
        btnCalcular.setOnAction(e -> calcular());
        Button btnLimpar = new Button("Limpar Campos");
        btnLimpar.setOnAction(e -> limpar());

        HBox botoes = new HBox(10, btnCalcular, btnLimpar);
        botoes.setPadding(new Insets(10));

        HBox principal = new HBox(20, grid, side);
        VBox root = new VBox(10, principal, botoes);

        stage.setTitle("Mexicano Maluco - Desenvolvido por Lucca Guilherme");
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void calcular() {
        double[] totais = new double[NUM_PLAYERS];
        String[] nomes = new String[NUM_PLAYERS];

        for (int j = 0; j < NUM_PLAYERS; j++) {
            nomes[j] = playerNames[j].getText().trim();
            totais[j] = 0;
            for (int i = 0; i < NUM_ROUNDS; i++) {
                try {
                    double val = Double.parseDouble(entries[i][j].getText());
                    totais[j] += val;
                } catch (NumberFormatException ignored) {}
            }
            this.totals[j].setText(String.format("%.0f", totais[j]));
        }

         // Lideres por rodada
        for (int i = 0; i < NUM_ROUNDS; i++) {
            double menor = Double.MAX_VALUE;
            String nome = "-";
            for (int j = 0; j < NUM_PLAYERS; j++) {
                try {
                    double val = Double.parseDouble(entries[i][j].getText());
                    if (!nomes[j].isEmpty() && val < menor) {
                        menor = val;
                        nome = nomes[j] + " (" + (int) val + ")";
                    }
                } catch (NumberFormatException ignored) {}
            }
            leaders[i].setText(nome);
        }

        // Ranking final
        String[][] ranking = new String[NUM_PLAYERS][2];
        for (int i = 0; i < NUM_PLAYERS; i++) {
            ranking[i][0] = nomes[i];
            ranking[i][1] = String.valueOf(totais[i]);
        }

        java.util.Arrays.sort(ranking, (a, b) -> {
            try {
                return Double.compare(Double.parseDouble(a[1]), Double.parseDouble(b[1]));
            } catch (Exception e) {
                return 0;
            }
        });

        for (int i = 0, pos = 1; i < NUM_PLAYERS; i++) {
            if (ranking[i][0] != null && !ranking[i][0].isEmpty()) {
                rankings[i].setText(pos++ + "º - " + ranking[i][0] + " (" + ranking[i][1].split("\\.")[0] + ")");
            } else {
                rankings[i].setText("");
            }
        }
    }

    private void limpar() {
        for (int i = 0; i < NUM_ROUNDS; i++) {
            for (int j = 0; j < NUM_PLAYERS; j++) {
                entries[i][j].clear();
            }
            leaders[i].setText("-");
        }

        for (int j = 0; j < NUM_PLAYERS; j++) {
            playerNames[j].clear();
            totals[j].setText("0");
            rankings[j].setText("");
        }
    }
}
