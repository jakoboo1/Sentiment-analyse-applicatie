package com.example.herkansing;

import Model.Model;
import View.HoofdPagina;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //input
        String sentence = "Bitcoin is the best";

        HoofdPagina hoofdPagina = new HoofdPagina(stage,sentence);

    }

    public static void main(String[] args) {
        launch();
    }
}